package skq_springboot.dao;

import org.apache.ibatis.annotations.Param;

import skq_springboot.domain.City;

/**
 * 城市Dao接口类
 * @author Administrator
 *
 */
public interface CityDao {

	/**
	 * 根据城市名称查询城市信息
	 * @param cityName
	 * @return City
	 */
	City findCityByName(@Param("cityName") String cityName);

}
