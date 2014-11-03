package org.daughter.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 服务层基类接口
 * 
 * @author junhui.ji
 * 
 */
public interface IBaseService<T, PK extends Serializable> {
	/**
	 * 保存
	 * 
	 * @param entity
	 */
	public abstract void save(T entity);

	/**
	 * 修改
	 * 
	 * @param entity
	 */
	public abstract void update(T entity);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	public abstract void delete(long id);

	/**
	 * 根据对象删除
	 * 
	 * @param entity
	 */
	public abstract void delete(T entity);

	/**
	 * 根据id获取对象
	 * 
	 * @param id
	 * @return
	 */
	public abstract T getById(long id);

	/**
	 * 获取所有对象
	 * 
	 * @return
	 */
	public abstract List<T> getAll();

	/**
	 * 分页专用
	 * 
	 * @param firstResult
	 * @param maxResults
	 * @param objects
	 * @return
	 */
	public abstract Map<String, Object> getMap(int firstResult, int maxResults, Objects... objects);
}
