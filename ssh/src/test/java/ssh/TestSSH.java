package ssh;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hxs.entity.Heros;
import com.hxs.service.HeroService;
import com.hxs.service.impl.HeroServiceImpl;

import junit.framework.TestCase;

public class TestSSH extends TestCase{
	//spring+hibernate
	public void testSSh(){
		String[] p={"spring-common.xml","spring-bean.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(p);
		HeroService h=(HeroService) context.getBean("heroService");
		
		List list=h.getList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//System.out.println(list);
	}
	
	public void addtest(){
		Heros heros=new Heros();
		heros.setBirthday(new Date());
		heros.setName("法鸡");
		heros.setNickname("法老之鹰");
		heros.setSex("女");
		
		String[] p={"spring-common.xml","spring-bean.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(p);
		HeroService h=(HeroService) context.getBean("heroService");
		
		
		h.addHero(heros);
		
	}
	public void deltest(){
		Heros heros=new Heros();
		heros.setBirthday(new Date());
		heros.setName("法鸡");
		heros.setNickname("法老之鹰");
		heros.setSex("女");
		heros.setId(130);		
		String[] p={"spring-common.xml","spring-bean.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(p);
		HeroService h=(HeroService) context.getBean("heroService");		
		
		h.delHero(heros);
		
	}
	public void updatetest(){
		Heros heros=new Heros();
		heros.setBirthday(new Date());
		heros.setName("法鸡");
		heros.setNickname("法老之鹰");
		heros.setSex("女");
		heros.setR("天降正义");
		heros.setId(131);		
		String[] p={"spring-common.xml","spring-bean.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(p);
		HeroService h=(HeroService) context.getBean("heroService");		
		
		h.updateHero(heros);
		
	}
	
	public void page(){
		String[] p={"spring-common.xml","spring-bean.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(p);
		HeroService h=(HeroService) context.getBean("heroService");	
		List list=h.getPage(2, 10);
		//System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void count(){
		String[] p={"spring-common.xml","spring-bean.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(p);
		HeroService h=(HeroService) context.getBean("heroService");	
		long n=h.getCount();
		System.out.println(n);
		
	}

}
