package com.foodorder.quickbite.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.NoArgsConstructor;

//@Data
//@Builder
//@Getter
//@Setter
//@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "foods")
public class FoodEntity 
{
	@Id
	private String id;
	private String name;
	private String description;
	private double price;
	private String category;
	private String imageUrl;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	private FoodEntity(Builder builder)
	{
		this.id = builder.id;
		this.name  = builder.name;
		this.description = builder.description;
		this.price = builder.price;
		this.category = builder.category;
		this.imageUrl = builder.imageUrl;
	}
	
	public static class Builder
	{
		private String id;
		private String name;
		private String description;
		private double price;
		private String category;
		private String imageUrl;
		
		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}
		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}
		public Builder setCategory(String category) {
			this.category = category;
			return this;
		}
		public Builder setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
			return this;
		}
		
		public FoodEntity build() 
		{
			return new FoodEntity(this);
		}
		
		
	}
	

}
 