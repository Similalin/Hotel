package cn.xy.service.impl;

import java.util.List;

import cn.xy.dao.IOrdersDao;
import cn.xy.entity.Orders;
import cn.xy.factory.BeanFactory;
import cn.xy.service.IOrdersService;
import cn.xy.utils.PageBean;

public class OrdersService implements IOrdersService{

	IOrdersDao dao = BeanFactory.getInstance("ordersDao", IOrdersDao.class);
	@Override
	public void update(Orders orders) {
		dao.update(orders);
	}

	@Override
	public List<Orders> query() {
		return dao.query();
	}

	@Override
	public void add(Orders orders) {
		dao.add(orders);
	}

	@Override
	public int getCount() {
		return dao.getCount();
	}
	
	@Override
	public void getAll(PageBean<Orders> pb) {
		try {
			dao.getAll(pb);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
