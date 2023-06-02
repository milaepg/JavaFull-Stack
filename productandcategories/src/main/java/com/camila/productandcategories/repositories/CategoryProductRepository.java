package com.camila.productandcategories.repositories;

import org.springframework.stereotype.Repository;

import com.camila.productandcategories.models.CategoryProduct;

@Repository
public class CategoryProductRepository extends CrudRepository <CategoryProduct, Long> {

}
