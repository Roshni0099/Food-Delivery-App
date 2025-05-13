package com.foodorder.quickbite.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.foodorder.quickbite.io.FoodRequest;
import com.foodorder.quickbite.io.FoodResponse;

public interface FoodService 
{
	String uploadFile(MultipartFile file);
	
	FoodResponse addFood(FoodRequest request, MultipartFile file);
	
	List<FoodResponse> readFoods();
	
	FoodResponse readFood(String id);
	
	boolean deleteFile(String filename);
	
	void deleteFood(String id);
}
