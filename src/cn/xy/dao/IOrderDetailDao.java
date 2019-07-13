package cn.xy.dao;

import java.util.List;

import cn.xy.entity.OrderDetail;

public interface IOrderDetailDao {

	void add(OrderDetail od);
	
	List<OrderDetail> query();
	
	List<OrderDetail> findByOrderid(int id);
}
