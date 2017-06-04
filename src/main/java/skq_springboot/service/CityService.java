package skq_springboot.service;

import skq_springboot.domain.City;

/**
 * 城市业务逻辑接口类
 * @author Administrator
 *
 */
public interface CityService {

	City findCityByName(String cityName);

}
