package service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import model.User;

import org.daughter.core.util.CommonUtil;
import org.daughter.hibernate.IBaseDao;
import org.daughter.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import service.IUserService;
import dao.IUserDao;

/**
 * 用户管理服务接口 实现类
 * 
 * @author junhui.ji
 * 
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements IUserService {

	@Resource
	private IUserDao userDao;

	public User getUserByUserNamePassword(String username, String password) {
		String hsql = "FROM User u WHERE u.username = ? and u.password = ?";
		List<User> users = userDao.queryByHsql(hsql, username, password);
		return CommonUtil.isNull(users) ? null : users.get(0);
	}

	@Override
	public IBaseDao<User, Long> baseDAO() {
		return userDao;
	}

	@Override
	public Map<String, Object> getUserMap(int firstResult, int maxResults, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
