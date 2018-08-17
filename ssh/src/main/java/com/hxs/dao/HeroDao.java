package com.hxs.dao;

import java.util.List;

import com.hxs.entity.Heros;

public interface HeroDao {
	public int addHero(Heros heros);
	public int delHero(Heros heros);
	public int updateHero(Heros heros);
	public List getList();
	
	public List getPage(int page,int size);
	public long getCount();
}
