package org.daughter.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.daughter.core.util.CommonUtil;
import org.daughter.core.util.ReflectUtils;
import org.daughter.dao.IBaseDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDAOImpl<T, PK extends Serializable> implements IBaseDAO<T, PK> {

	private Class<T> clazz;
	@Autowired
	private SessionFactory sessionFactory;

	public BaseDAOImpl() {
		// this.clazz = (Class<T>) ((ParameterizedType)
		// (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
		this.clazz = ReflectUtils.getClassGenricType(getClass());
	}

	/**
	 * 获取session
	 * 
	 * @return
	 */
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(T entity) {
		getSession().save(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);

	}

	public void delete(long id) {
		getSession().delete(id + "", clazz);
	}

	public void executeByHsql(String hsql, Objects... objects) {
		Query query = getSession().createQuery(hsql);
		if (objects != null && objects.length > 0) {
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
		}
		query.executeUpdate();
	}

	public void executeBySql(String hsql, Objects... objects) {
		Query query = getSession().createSQLQuery(hsql);
		if (objects != null && objects.length > 0) {
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
		}
		query.executeUpdate();

	}

	public long queryTotal(String hsql, Object... objects) {
		Query query = getSession().createQuery(hsql);
		if (objects != null && objects.length > 0) {
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
		}
		@SuppressWarnings({ "rawtypes" })
		List list = query.list();
		return null == list ? 0 : list.size();
	}

	@SuppressWarnings("unchecked")
	public T queryById(Long id) {
		System.out.println("查询方法这个方法被调用");
		return (T) getSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> queryByHsql(String hsql) {
		Query query = getSession().createQuery(hsql);
		return (List<T>) query.list();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<T> queryByHsql(String hsql, Object... objects) {
		Query query = getSession().createQuery(hsql);
		if (objects != null && objects.length > 0) {
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
		}
		List list = query.list();
		return CommonUtil.isNull(list) ? null : list;
	}

	public Map<String, Object> queryByObjects(String hsql, int firstResult, int maxResults, Object... objects) {
		Map<String, Object> map = new HashMap<String, Object>();
		// long count = 0l;
		// List<T> list;
		// Query query = getSession().createQuery(hsql);
		// if (objects != null && objects.length > 0) {
		// for (int i = 0; i < objects.length; i++) {
		// query.setParameter(i, objects[i]);
		// }
		// }
		// list = query.list();
		// // 获取总数
		// // count = null == list ? 0 : list.size();
		// // 设置分页
		// query.setFirstResult(firstResult);
		// query.setMaxResults(maxResults);
		// list = query.list();
		// map.put(PageCommon.PAGE_DATA, list);
		// map.put(PageCommon.PAGE_COUNT, count);
		return map;
	}

	@SuppressWarnings("unchecked")
	public List<T> queryAll() {
		return (List<T>) getSession().createCriteria(clazz).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.daughter.dao.IBaseDAO#query(java.lang.String,
	 * java.lang.Object[], int, int)
	 */
	public List<T> query(String hsql, Object[] value, int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.daughter.dao.IBaseDAO#queryByExample(java.lang.Object,
	 * java.lang.String[])
	 */
	public List<T> queryByExample(T exampleInstance, String... excludeProperty) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.daughter.dao.IBaseDAO#queryByObjects(java.lang.Object)
	 */
	public List<T> queryByObjects(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
