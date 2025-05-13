package com.foodorder.quickbite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodorder.quickbite.entity.FoodEntity;

@Repository
public interface FoodRepository extends MongoRepository<FoodEntity, String> 
{

}
