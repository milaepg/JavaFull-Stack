package com.camila.productandcategories.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camila.productandcategories.models.Category;
import com.camila.productandcategories.models.Product;

@Repository
public class ProductRepository extends CrudRepository <Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);

}
