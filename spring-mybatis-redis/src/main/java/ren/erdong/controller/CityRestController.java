package ren.erdong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ren.erdong.domain.City;
import ren.erdong.service.CityService;

@RestController
public class CityRestController {

	private final CityService cityService;

	@Autowired
	public CityRestController(CityService cityService) {
		this.cityService = cityService;
	}


	@RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
	public City findOneCity(@PathVariable("id") Long id) {
		return cityService.findCityById(id);
	}

	@RequestMapping(value = "/api/city", method = RequestMethod.POST)
	public void createCity(@RequestBody City city) {
		cityService.saveCity(city);
	}

	@RequestMapping(value = "/api/city", method = RequestMethod.PUT)
	public void modifyCity(@RequestBody City city) {
		cityService.updateCity(city);
	}

	@RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
	public void modifyCity(@PathVariable("id") Long id) {
		cityService.deleteCity(id);
	}
}
