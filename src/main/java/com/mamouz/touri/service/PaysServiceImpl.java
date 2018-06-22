package com.mamouz.touri.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mamouz.touri.dao.entity.Pays;
import com.mamouz.touri.dao.interfaces.IPaysDao;
import com.mamouz.touri.service.interfaces.IPaysService;

@Service("paysService")
public class PaysServiceImpl implements IPaysService {
	
	@Resource(name="paysDao")
	IPaysDao paysDao;

	@Override
	public void addPays(Pays p) {
		paysDao.addPays(p);

	}

	@Override
	public void removePays(Long id) {
		paysDao.removeContinent(id);

	}

	@Override
	public void updatePays(Pays p) {
		paysDao.updateContinent(p);

	}

	@Override
	public Pays findPaysById(Long id) {
		return paysDao.findPaysById(id);
	}

	@Override
	public List<Pays> findPaysByCriteria(String criteria) {
		return paysDao.findPaysByCriteria(criteria);
	}

	@Override
	public List<Pays> findAllPays() {
		return paysDao.findAllPays();
	}

}
