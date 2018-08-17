package com.hxs.service.impl;

import java.util.List;

import com.hxs.dao.HeroDao;
import com.hxs.dao.imp.HerodaoImpl;
import com.hxs.entity.Heros;
import com.hxs.service.HeroService;

public class HeroServiceImpl implements HeroService {
	
	HeroDao heroDao;
	

	public HeroDao getHeroDao() {
		return heroDao;
	}

	public void setHeroDao(HeroDao heroDao) {
		this.heroDao = heroDao;
	}

	public int addHero(Heros heros) {
		heroDao.addHero(heros);
		return 0;
	}

	public int delHero(Heros heros) {
		
		return heroDao.delHero(heros);
	}

	public int updateHero(Heros heros) {
		int n=heroDao.updateHero(heros);
		return n;
	}

	public List getList() {
		
		return heroDao.getList();
	}

	public List getPage(int page, int size) {
		
		return heroDao.getPage(page, size);
	}

	public long getCount() {
		
		return heroDao.getCount();
	}

}
