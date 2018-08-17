package com.hxs.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hxs.dao.HeroDao;
import com.hxs.entity.Heros;

public class HerodaoImpl extends HibernateDaoSupport implements HeroDao{

	public int addHero(Heros heros) {
		Integer n=(Integer) this.getHibernateTemplate().save(heros);
		return n;
	}

	public int delHero(Heros heros) {
		this.getHibernateTemplate().delete(heros);
		return 1;
	}

	public int updateHero(Heros heros) {
		this.getHibernateTemplate().update(heros);
		return 1;
	}

	public List getList() {
		return this.getHibernateTemplate().find("from Heros");
	}

	public List getPage(final int page,   final int size) {
		List list=this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				
				Query q=session.createQuery("from Heros");
				q.setFirstResult((page-1)*size);
				q.setMaxResults(size);
				
				
				return q.list();
			}
		});
		return list;
		
	}

	public long getCount() {
		long n=  (Long) (this.getHibernateTemplate().find("select count(*) from Heros").listIterator().next());
		return  n;
	}

}
