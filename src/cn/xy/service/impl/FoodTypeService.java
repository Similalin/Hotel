package cn.xy.service.impl;

import java.util.List;

import cn.xy.dao.IFoodTypeDao;
import cn.xy.entity.FoodType;
import cn.xy.factory.BeanFactory;
import cn.xy.service.IFoodTypeService;

public class FoodTypeService implements IFoodTypeService{

	IFoodTypeDao dao = BeanFactory.getInstance("foodTypeDao", IFoodTypeDao.class) ;
	
	@Override
	public void add(FoodType foodtype) {
		dao.add(foodtype);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void updata(FoodType foodtype) {
		dao.updata(foodtype);
	}

	@Override
	public List<FoodType> query() {
		return dao.query();
	}

	@Override
	public FoodType findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<FoodType> query(String keyword) {
		return dao.query(keyword);
	}

	@Override
	public Integer getFirstType() {
		return dao.getFirstType();
	}
}
