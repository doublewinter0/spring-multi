package ren.erdong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.erdong.dao.CityDao;
import ren.erdong.domain.City;
import ren.erdong.service.CityService;

import java.util.List;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService {

    private final CityDao cityDao;

    @Autowired
    public CityServiceImpl(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

	@Override
	public List<City> findAll() {
		return cityDao.findAll();
	}
}
