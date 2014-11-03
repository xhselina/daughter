package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.IUserService;

/**
 * 用户登陆、注销
 * 
 * @author junhui.ji
 * 
 */
@Controller
@RequestMapping(value = "/user/")
public class UserController {

	private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Resource
	private IUserService userService;

	@RequestMapping(value = "showUserJsp", method = RequestMethod.GET)
	public String showUser(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("show user.jsp");
		return "user";
	}

	// /**
	// * 用户登陆
	// *
	// * @param request
	// * @param response
	// * @param user
	// * @return
	// */
	// @RequestMapping(value = "/login.html", method = RequestMethod.GET)
	// public void login(HttpServletRequest request, HttpServletResponse
	// response, User user) {
	// user.setRealName("selina");
	// user.setCreateDate(new Date());
	// user.setDes("hahahahhah这个方法很聪明");
	// userService.save(user);
	// // JackJsonUtil.stringToJson(response, "success", "true");
	// System.out.println("请求成功!");
	// }

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
