package ru.vlad.enterprise.repository;

import ru.vlad.enterprise.ProductRepository;
import ru.vlad.enterprise.model.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@ApplicationScoped
public class ProductRepositoryBean implements ProductRepository {
    @NotNull
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    void init(){
        products = Arrays.asList(
                new Product("Товар 1", "4612345678", "this is a product descr", 100),
                new Product("Товар 2", "0812312312", "bla-bla-bla", 500),
                new Product("Товар 3", "12345678", "no description :)", 900)
                );
    }

    @NotNull
    @Override
    public List<Product> getAll() {

        return products;
    }

    @Override
    public Product get(@NotNull String id) {
        return products.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Product create(Product product) {

        return product;
    }

    @Override
    public boolean delete(@NotNull String id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId().equals(id)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Product product) {

    }
}
