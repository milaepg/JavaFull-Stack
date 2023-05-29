package com.camila.dojosninjas.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camila.dojosninjas.models.Dojo;

@Repository
public class DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();

}
