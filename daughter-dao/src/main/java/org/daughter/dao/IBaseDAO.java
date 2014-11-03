package org.daughter.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 数据基类接口
 * 
 * @author Administrator 2013-11-2 下午2:39:43
 */
public interface IBaseDAO<T, PK extends Serializable> {

	/**
	 * 添加一个对象
	 * 
	 * @param entity
	 * @return
	 */
	void add(T entity);

	/**
	 * 修改一个对象
	 * 
	 * @param entity
	 * @return
	 */
	void update(T entity);

	/**
	 * 删除一个对象
	 * 
	 * @param entity
	 */
	void delete(T entity);

	/**
	 * 根据id删除一个对象
	 * 
	 * @param id
	 */
	void delete(long id);

	/**
	 * 根据hsql 修改或者删除对象
	 * 
	 * @param hsql
	 * @param objects
	 */
	void executeByHsql(String hsql, Objects... objects);

	/**
	 * 根据sql语句 修改或者删除对象
	 * 
	 * @param hsql
	 * @param objects
	 */
	void executeBySql(String hsql, Objects... objects);

	/**
	 * 根据hsql查询总数
	 * 
	 * @param hsql
	 * @param objs
	 * @return
	 */
	long queryTotal(String hsql, Object... objs);

	/**
	 * 根据id获取对象
	 * 
	 * @param id
	 * @return
	 */
	T queryById(Long id);

	/**
	 * 根据hsql查询对象集合
	 * 
	 * @param hsql
	 * @return
	 */
	List<T> queryByHsql(String hsql);

	/**
	 * 根据hsql语句查询对象集合 支持(多条件全匹配或者模糊查询)
	 * 
	 * @param hsql
	 * @return
	 */
	List<T> queryByHsql(String hsql, Object... objs);

	/**
	 * 根据对象的条件获取该对象的列表
	 * 
	 * @param exampleEntity
	 * @return
	 */
	List<T> queryByObjects(Object obj);

	/**
	 * 根据对象的属性获取该对象的列表(支持分页)
	 * 
	 * @param obj
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	Map<String, Object> queryByObjects(String hsql, int firstResult, int maxResults, Object... obj);

	/**
	 * 获取所有对象
	 * 
	 * @return
	 */
	List<T> queryAll();

	/**
	 * 根据hsql语句查询对象集合(分页)
	 * 
	 * @param value
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	List<T> query(String hsql, Object[] value, int firstResult, int maxResults);

	/**
	 * 
	 * @param exampleInstance
	 * @param excludeProperty
	 * @return
	 */
	List<T> queryByExample(T exampleInstance, String... excludeProperty);
}
