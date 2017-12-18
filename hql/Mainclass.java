package org.userinfo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	session.beginTransaction();
	
	User use=new User();
	use.setName("abc");
	use.setEmailId("aabc@gmail.com");
	use.setPhNo(1212);
	
	User use1=new User();
	use1.setName("sas");
	use1.setEmailId("aafa@gmail.com");
	use1.setPhNo(23523);
	
	User use2=new User();
	use2.setName("abi");
	use2.setEmailId("abi@gmail.com");
	use2.setPhNo(355);
	
	User use3=new User();	
	use3.setName("anu");
	use3.setEmailId("anu@gmail.com");
	use3.setPhNo(7867);
	
	session.save(use);
	session.save(use1);
	session.save(use2);
	session.save(use3);
	session.getTransaction().commit();
	
	Criteria criteria=session.createCriteria(User.class);
	criteria.add(Restrictions.le("id", 4));
	List <User> infos=criteria.list();
	for(User u:infos)
	{
		System.out.println(u.getEmailId());
	}
	session.close();
	sf.close();
	}
   }
	
	


