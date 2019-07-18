package heroj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		SuperHeroj heroj = context.getBean("superHeroj", SuperHeroj.class);
		
		HibernateMetode metode = context.getBean("hibernateMetode",HibernateMetode.class);
		
		
		//metode.sacuvajHeroja(heroj);
		//System.out.println(metode.vratiHeroja(2).getIme());
		System.out.println(metode.vratiMagiju("Bananamen"));
		
		
	}

}
