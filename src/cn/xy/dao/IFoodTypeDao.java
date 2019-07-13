package cn.xy.dao;

import java.util.List;

import cn.xy.entity.FoodType;

public interface IFoodTypeDao {

	void add(FoodType foodtype);
	
	void delete(int id);
	
	void updata(FoodType foodtype);
	
	List<FoodType> query();

	FoodType findById(int id);

	List<FoodType> query(String keyword);
	
	Integer getFirstType();
}
