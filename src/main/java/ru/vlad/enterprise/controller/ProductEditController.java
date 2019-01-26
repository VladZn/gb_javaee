package ru.vlad.enterprise.controller;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import ru.vlad.enterprise.ProductRepository;
import ru.vlad.enterprise.model.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ViewScoped
@ManagedBean
@URLMapping(id = "product-edit", pattern = "/product-edit", viewId = "/WEB-INF/views/faces/product-edit.xhtml")
public class ProductEditController implements Serializable {

    @Inject
    private ProductRepository productRepository;

    private String id;

    private Product product = new Product();

    public void init(){
        final Product product = productRepository.get(id);
        if (product != null) this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
