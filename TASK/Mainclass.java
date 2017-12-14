package org.book1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Mainclass {

	 public static void main(String[] args) throws IOException {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 Session session = sf.openSession();
		 session.beginTransaction();
		 
		 Book b1=new Book();
		 b1.setTitle("mygirl");
		 b1.setAuthor("edision");
		 b1.setPrice(31231);
		 b1.setISBNnumber(123124235);
		 b1.setEdision("edision 1");
		 b1.setPublisher("abc publishers");
		 
		 Book b2=new Book();
		 b2.setTitle("Innocent man");
		 b2.setAuthor("shakespheare");
		 b2.setPrice(320);
		 b2.setISBNnumber(1234567);
		 b2.setEdision("edision 5");
		 b2.setPublisher("vmn publishers");
		 
		 Author a1=new Author();
		 a1.setId(2);
		 a1.setName("shakespheare");
		 a1.setEmailid("abc@gmail.com");
		 a1.setGender("male");
		 a1.setURL("http://abcCVT02373hsdfdjf.Com");
		 
		 Author a2=new Author();
		 a1.setId(2);
		 a1.setName("milton");
		 a1.setEmailid("antony@gmail.com");
		 a1.setGender("male");
		 a1.setURL("http://Abc03hrSgs.Com"); 
		 
		 session.save(b1);
		 session.save(b2);
		 session.save(a1);
		 session.save(a2);
		session.getTransaction().commit();
		session.close();
		sf.close();
	 }
}
