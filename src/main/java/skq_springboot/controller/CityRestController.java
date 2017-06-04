package skq_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import skq_springboot.domain.City;
import skq_springboot.service.CityService;


@RestController
public class CityRestController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/api/hello",method=RequestMethod.GET)
	public City doEntry(@RequestParam("cityName") String cityName){
		//TODO 
		return cityService.findCityByName(cityName);
	}
}
