package skq_springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skq_springboot.dao.CityDao;
import skq_springboot.domain.City;
import skq_springboot.service.CityService;

/**
 * 城市业务逻辑实现类
 * @author Administrator
 *
 */
@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao cityDao;
	
	public City findCityByName(String cityName) {
		
		return cityDao.findCityByName(cityName);
	}
	
}
