package ru.vlad.enterprise.controller;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import ru.vlad.enterprise.model.Product;
import ru.vlad.enterprise.ProductRepository;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
@URLMapping(id = "catalog", pattern = "/catalog", viewId = "/WEB-INF/views/faces/catalog.xhtml")
public class CatalogController implements Serializable {

    @Inject
    private ProductRepository productRepository;

    @NotNull
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    private void init(){
        reload();
    }

    private void reload() {
        products.clear();
        products.addAll(productRepository.getAll());

    }

    @NotNull
    public List<Product> getProducts(){

       return products;
    }

    public void delete(String id){
        productRepository.delete(id);
        reload();
    }

}
