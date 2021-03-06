package ren.erdong.service;

import ren.erdong.domain.City;

import java.util.List;

/**
 * 城市业务逻辑接口类
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
