package ren.erdong.dao;

import org.apache.ibatis.annotations.*;
import ren.erdong.domain.City;

import java.util.List;

/**
 * 城市 DAO 接口类
 */
@Mapper // 标志为 Mybatis 的 Mapper
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    @Select("SELECT * FROM city WHERE city_name = #{cityName}")
    City findByName(@Param("cityName") String cityName);

	@Select("SELECT * FROM city")
	List<City> findAll();
}
