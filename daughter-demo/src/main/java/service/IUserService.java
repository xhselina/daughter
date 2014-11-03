package service;

import java.util.Map;

import org.daughter.service.IBaseService;

import model.User;

/**
 * 用户管理接口
 * 
 * @author junhui.ji
 * 
 */
public interface IUserService extends IBaseService<User, Long> {

	/**
	 * 根据用户名、密码获取用户
	 * 
	 * @return
	 */
	public User getUserByUserNamePassword(String userName, String password);

	public Map<String, Object> getUserMap(int firstResult, int maxResults, User user);
}
