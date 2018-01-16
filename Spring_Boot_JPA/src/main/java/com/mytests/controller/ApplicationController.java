package com.mytests.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytests.spring.model.WaterDevice;
import com.mytests.spring.service.RecordService;
import com.mytests.spring.service.WaterDeviceService;

@Controller
@RequestMapping("/control")
public class ApplicationController {
	
	@Autowired
	RecordService recordService;
	@Autowired
	WaterDeviceService waterService;
	
	//@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<WaterDevice> getAllDevices(){
		return waterService.getAllDevices();
		
	}
}
