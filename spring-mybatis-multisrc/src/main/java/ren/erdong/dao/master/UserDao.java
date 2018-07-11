package ren.erdong.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ren.erdong.domain.User;

/**
 * 用户 DAO 接口类
 */
@Mapper
public interface UserDao {

	/**
	 * 根据用户名获取用户信息
	 *
	 * @param userName
	 * @return
	 */
	User findByName(@Param("userName") String userName);
}
