package ren.erdong.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import ren.erdong.doamin.City;
import ren.erdong.service.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

	public City findCityByName(String cityName) {
		return new City(3L, 3L, cityName, cityName + "是个好地方！");
	}
}
