package com.mytests.spring.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.mytests.spring.model.WaterDevice;

@Component
public class WaterDeviceDao {
	
	@PersistenceContext
	private EntityManager em;

	public void persist(WaterDevice waterDevice) {
		em.persist(waterDevice);
	}

//	public List<WaterDevice> findAll() {
//		return em.createQuery("SELECT  FROM  p").getResultList();
//	}
	@SuppressWarnings("unchecked")
	public List<WaterDevice> getAllDevices(){
		return (List<WaterDevice>) em.createQuery("Select w from WaterDevice w").getResultList();
	}
}
