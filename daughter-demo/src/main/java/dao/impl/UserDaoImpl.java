package dao.impl;

import model.User;

import org.daughter.hibernate.impl.BaseDAOImpl;
import org.springframework.stereotype.Repository;

import dao.IUserDao;

/**
 * 用户管理接口的 实现类
 * 
 * @author junhui.ji
 * 
 */
@Repository
public class UserDaoImpl extends BaseDAOImpl<User, Long> implements IUserDao {

}
