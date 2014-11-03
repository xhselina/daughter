package org.daughter.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.daughter.dao.IBaseDAO;
import org.daughter.service.IBaseService;
import org.springframework.cache.annotation.Cacheable;

//@Transactional
public abstract class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {

	public abstract IBaseDAO<T, PK> baseDAO();

	/**
	 * 使用了一个名字是myCache的缓存，以key,value的方式缓存 key可以为null,也可以是spEl表达式，默认是参数名的组合
	 */
	@Cacheable(value = "myCache", key = "#entity.id")
	// 使用了一个缓存名叫 saveCache
	public void save(T entity) {
		baseDAO().add(entity);

	}

	/**
	 * 更新缓存 在缓存名字为myCache中找到key值为xxx的缓存更新，并把更新后的对象重新写到缓存中
	 * 注意：@CacheEvict(value="myCache",allEntries=true) 这个意思代表清除所有缓存
	 */
	// @CachePut(value="myCache",key="#entity.id")
	public void update(T entity) {
		baseDAO().update(entity);
	}

	/**
	 * 清除缓存 在缓存名字为myCache中找到key值为xxx的缓存清除
	 * 注意：@CacheEvict(value="myCache",allEntries=true) 这个意思代表清除所有缓存
	 */
	// @CacheEvict(value = "myCache", key = "#entity.id", allEntries = true)
	public void delete(long id) {
		baseDAO().delete(id);

	}

	public void delete(T entity) {
		baseDAO().delete(entity);

	}

	// @Cacheable(value = "myCache", key = "#id")
	public T getById(long id) {
		return baseDAO().queryById(id);
	}

	public List<T> getAll() {
		return baseDAO().queryAll();
	}

	public Map<String, Object> getMap(int firstResult, int maxResults, Objects... objects) {
		return null;
	}

}
