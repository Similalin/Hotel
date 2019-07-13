package cn.xy.dao;

import java.util.List;

import cn.xy.entity.Orders;
import cn.xy.utils.PageBean;

public interface IOrdersDao {

	void update(Orders orders);
	
	List<Orders> query();

	void add(Orders orders);
	
	int getCount();

	void getAll(PageBean<Orders> pb);

	int getTotalCount();
}
