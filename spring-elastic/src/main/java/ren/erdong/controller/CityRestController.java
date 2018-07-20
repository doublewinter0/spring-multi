package ren.erdong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ren.erdong.domain.City;
import ren.erdong.service.CityService;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 */
@RestController
public class CityRestController {

	private final CityService cityService;

	@Autowired
	public CityRestController(CityService cityService) {
		this.cityService = cityService;
	}

	@RequestMapping(value = "/api/city", method = RequestMethod.POST)
	public Long createCity(@RequestBody City city) {
		return cityService.saveCity(city);
	}

	@RequestMapping(value = "/api/city", method = RequestMethod.GET)
	public List<City> searchByCityname(@RequestParam("cityName") String cityName) {
		return cityService.searchByCityname(cityName);
	}

	@RequestMapping(value = "/api/city/searchAll", method = RequestMethod.GET)
	public List<City> searchAll() {
		return cityService.searchAll();
	}
}
