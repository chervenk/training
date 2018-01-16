package com.mytests.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytests.spring.dao.TemperatureRecordDao;
import com.mytests.spring.model.TemperatureRecord;

@Service
public class RecordService {

	@Autowired
	TemperatureRecordDao temperatureRecordDao;
	
	public void add(TemperatureRecord record) {
		temperatureRecordDao.persist(record); 
	}
}
