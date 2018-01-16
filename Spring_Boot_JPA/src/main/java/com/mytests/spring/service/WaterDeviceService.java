package com.mytests.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytests.spring.dao.WaterDeviceDao;
import com.mytests.spring.model.WaterDevice;

@Service
public class WaterDeviceService {
	@Autowired
	WaterDeviceDao waterDao;
	
	public void add(WaterDevice record) {
		waterDao.persist(record); 
	}
	
	public List<WaterDevice> getAllDevices(){
		return waterDao.getAllDevices();
	}
}