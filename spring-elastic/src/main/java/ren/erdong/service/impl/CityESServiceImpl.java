package ren.erdong.service.impl;

import org.apache.commons.collections4.IterableUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ren.erdong.domain.City;
import ren.erdong.repository.CityRepository;
import ren.erdong.service.CityService;

import java.util.List;

/**
 * 城市 ES 业务逻辑实现类
 */
@Service
public class CityESServiceImpl implements CityService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CityESServiceImpl.class);

	private final CityRepository cityRepository;

	@Autowired
	public CityESServiceImpl(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	public Long saveCity(City city) {
		City cityResult = cityRepository.save(city);
		return cityResult.getId();
	}

	@Override
	public List<City> searchByCityname(String cityName) {
		List<City> cityList = cityRepository.findByCityname(cityName);
		cityList.forEach(city -> LOGGER.info(city.toString()));
		return cityList;
	}

	@Override
	public List<City> searchAll() {
		List<City> cityList = IterableUtils.toList(cityRepository.findAll());
		cityList.forEach(city -> LOGGER.info(city.toString()));
		return cityList;
	}
}
