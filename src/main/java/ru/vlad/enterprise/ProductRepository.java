package ru.vlad.enterprise;

import ru.vlad.enterprise.model.Product;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ProductRepository {

    @NotNull
    List<Product> getAll();

    Product get(@NotNull String id);

    Product create(Product product);

    boolean delete(@NotNull String id);

    void update(Product product);
}
