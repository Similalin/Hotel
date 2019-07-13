package cn.xy.dao;

import java.util.List;

import cn.xy.entity.DinnerTable;
/*
 * 
 * 面向接口编程
 * 
 * 目的 解耦
 * 
 * 选中某一个餐桌
 * 编程习惯 约定俗称
 * 不属于语法规则
 * 接口已I开头
 * implements
 * 实现类放在impl包下
 */
public interface IDinnerTableDao {
	//添加餐桌
	void add(DinnerTable dt);
	//删除餐桌
	void delete(int id);
	//改变餐桌状态 对餐桌信息进行更新
	void updata(DinnerTable dt);
	
	//餐桌列表
	List<DinnerTable> query();
	//根据餐桌ID选定某一个餐桌
	DinnerTable findById(int id);
	//搜索列表功能
	List<DinnerTable> query(String keyword);
	//退桌
	void quitTable(int id);
}
