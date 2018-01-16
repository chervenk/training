package com.mytests.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.mytests.spring.model.TemperatureRecord;

@Component
public class TemperatureRecordDao {
	@PersistenceContext
	private EntityManager em;

	public void persist(TemperatureRecord record) {
		em.persist(record);
	}
}
