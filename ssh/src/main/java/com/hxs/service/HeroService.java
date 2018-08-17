package com.hxs.service;

import java.util.List;

import com.hxs.dao.HeroDao;
import com.hxs.dao.imp.HerodaoImpl;
import com.hxs.entity.Heros;

public interface HeroService {
	
	
	public int addHero(Heros heros);
	
	public int delHero(Heros heros);
	
	public int updateHero(Heros heros);
	
	public List getList();
	public List getPage(int page,int size);
	
	public long getCount();

}
