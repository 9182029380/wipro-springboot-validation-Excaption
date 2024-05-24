package com.wipro.Propertysale.repository;

import com.wipro.Propertysale.model.PropertyInfo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface Propertyrepo extends MongoRepository<PropertyInfo,Integer> {

}
