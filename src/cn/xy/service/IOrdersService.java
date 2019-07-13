package cn.xy.service;

import java.util.List;

import cn.xy.entity.Orders;
import cn.xy.utils.PageBean;

public interface IOrdersService {
	
	void update(Orders orders);

	List<Orders> query();

	void add(Orders orders);
	
	int getCount();
	
	public void getAll(PageBean<Orders> pb);
}
