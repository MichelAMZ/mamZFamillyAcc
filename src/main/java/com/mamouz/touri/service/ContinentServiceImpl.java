package com.mamouz.touri.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mamouz.touri.dao.entity.Continent;
import com.mamouz.touri.dao.interfaces.IContinentDao;
import com.mamouz.touri.dao.interfaces.IFamilyAccDao;
import com.mamouz.touri.service.interfaces.IContinentService;

@Service("continentService")
public class ContinentServiceImpl implements IContinentService {
	

	@Resource(name="continentDao")
	IContinentDao continentDao;

	@Override
	public void addContinent(Continent c) {
		continentDao.addContient(c);

	}

//	@Override
//	public void removeContinent(Long id) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void updateContinent(Continent family) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public Continent findContinentById(Long id) {
		return continentDao.findContinentById(id);
	}

	@Override
	public List<Continent> findContinentByCriteria(String criteria) {
		return continentDao.findContinentByCriteria(criteria);
	}

	@Override
	public List<Continent> findAllContinent() {
		return continentDao.findAllContinent();
	}

}
