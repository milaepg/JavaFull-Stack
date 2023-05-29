package com.camila.dojosninjas.repositories;

import org.springframework.stereotype.Repository;

import com.camila.dojosninjas.models.Ninja;

@Repository
public class NinjaRepositoy extends CrudRepository <Ninja, Long> {

}
