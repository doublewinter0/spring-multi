package ren.erdong.service;

import ren.erdong.domain.City;

import java.util.List;

public interface CityService {

	Long saveCity(City city);

	List<City> searchByCityname(String cityName);

	List<City> searchAll();
}