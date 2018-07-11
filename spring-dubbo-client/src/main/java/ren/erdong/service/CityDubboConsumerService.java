package ren.erdong.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import ren.erdong.domain.City;

/**
 * 城市 Dubbo 服务消费者
 */
@Component
public class CityDubboConsumerService {

	@Reference(version = "1.0.0")
	private CityDubboService cityDubboService;

	public void printCity() {
		String cityName = "采当";
		City city = cityDubboService.findCityByName(cityName);
		System.out.println(city.toString());
	}
}
