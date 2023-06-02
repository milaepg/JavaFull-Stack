package com.camila.productandcategories.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camila.productandcategories.models.Category;
import com.camila.productandcategories.models.Product;

@Repository
public class CategoryRepository extends CrudRepository <Category, Long> {
	List<Category> findAll();
    List<Category> findByProductsNotContains(Product product);

}
