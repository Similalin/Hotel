package cn.xy.service;

import java.util.List;

import cn.xy.entity.OrderDetail;

public interface IOrderDetailService {

	void add(OrderDetail od);
	
	List<OrderDetail> query();
	
	List<OrderDetail> findByOrderId(int id);
}
