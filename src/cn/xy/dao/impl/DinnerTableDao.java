package cn.xy.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.xy.dao.IDinnerTableDao;
import cn.xy.entity.DinnerTable;
import cn.xy.utils.JdbcUtils;
/*
 * DbUtils工具
 * 首先获得一个QueryRunner对象
 * 所有的操作都是根据QueryRunner执行方法
 * 数据查询对象
 * 需要获得连接
 * 从连接池中获得
 * 通过数据源得到QueryRunner对象
 */
public class DinnerTableDao implements IDinnerTableDao{
	private QueryRunner qr = JdbcUtils.getQuerrRunner();
	
	@Override
	public void add(DinnerTable dt) {
		try {
			String sql = "INSERT dinnertable(tableName) VALUES(?)";
			int n = qr.update(sql, dt.getTableName());
			/*if(n==1){
				System.out.println("更新成功");
			}else{
				
			}*/
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/*
	 * query方法 参数(sql,返回结果集,参数.....)
	 * update方法
	 */
	
	/*
	 * new BeanHandler<类型>(类.class) 单个结果集
	 * new BeanListHandler<类型>(DinnerTable.class) 多个结果集 列表
	 * 
	 */
	@Override
	public DinnerTable findById(int id){
		String sql = "select * from dinnertable where id=?";
		try {
			return qr.query(sql, new BeanHandler<DinnerTable>(DinnerTable.class),id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delete(int id) {
		String sql = "delete from dinnertable where id=?";
		try {
			qr.update(sql, id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updata(DinnerTable dt) {
		String sql = "UPDATE dinnertable SET tableStatus=?,orderDate=? WHERE id=?";
		Date date = dt.getOrderDate();
		try {
			JdbcUtils.getQuerrRunner().update(sql, dt.getTableStatus(),date,dt.getId());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<DinnerTable> query(String keyword) {
		String sql = "SELECT * FROM dinnertable WHERE tableName LIKE ?";
		try {
			return qr.query(sql, new BeanListHandler<DinnerTable>(DinnerTable.class),"%"+keyword +"%");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<DinnerTable> query() {
		String sql = "select * from dinnertable";
		try {
			return qr.query(sql, new BeanListHandler<DinnerTable>(DinnerTable.class));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public void quitTable(int id) {
		String sql = "UPDATE dinnertable SET tableStatus=?,orderDate=? WHERE id=?";
	
		try {
			JdbcUtils.getQuerrRunner().update(sql,0,null,id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
