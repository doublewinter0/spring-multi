package ren.erdong.dao;

import org.apache.ibatis.annotations.Param;
import ren.erdong.entities.City;

import java.util.List;

/**
 * 城市 DAO 接口类
 */
public interface CityDao {

	List<City> findAllCity();

	/**
	 * 根据城市 ID，获取城市信息
	 *
	 * @param id
	 * @return
	 */
	City findById(@Param("id") Long id);

	Long saveCity(City city);

	Long updateCity(City city);

	Long deleteCity(Long id);
}
