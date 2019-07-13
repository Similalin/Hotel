package cn.xy.entity;

import java.util.Date;
/*
 * 实体类
 * 模型层
 * 数据库的数据与业务逻辑层的转换 模板
 * 每个实体类对应一张表
 * 表中每一条记录对应一个对象
 * 类的每个属性对应一列
 * 
 * 框架 DAO
 * 数据持久层框架
 * 自动生成工具
 * 根据表的结构自动生成实体类
 */
public class DinnerTable {
	
	private int id;
	private String tableName;
	private int tableStatus;
	private Date orderDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public int getTableStatus() {
		return tableStatus;
	}
	public void setTableStatus(int tableStatus) {
		this.tableStatus = tableStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "DinnerTable [id=" + id + ", tableName=" + tableName
				+ ", tableStatus=" + tableStatus + ", orderDate=" + orderDate
				+ "]";
	}
}
