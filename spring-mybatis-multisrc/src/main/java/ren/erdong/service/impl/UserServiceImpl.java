/*
 * This line is for God!
 * Created by erdong on 2018/7/7 10:22
 * One is Gauss, and another is Évariste Galois.
 */

package ren.erdong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.erdong.dao.cluster.CityDao;
import ren.erdong.dao.master.UserDao;
import ren.erdong.domain.User;
import ren.erdong.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserDao userDao;
	private final CityDao cityDao;

	@Autowired
	public UserServiceImpl(UserDao userDao, CityDao cityDao) {
		this.userDao = userDao;
		this.cityDao = cityDao;
	}

	@Override
	public User findByName(String userName) {
		User user = userDao.findByName(userName);
		user.setCity(cityDao.findByName("神木市"));
		return user;
	}
}
