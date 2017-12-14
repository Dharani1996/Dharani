package org.book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Mainclass {

	 public static void main(String[] args) throws IOException {
		    SessionFactory sf = new Configuration().configure().buildSessionFactory();
	        sf.close();
	 }
}