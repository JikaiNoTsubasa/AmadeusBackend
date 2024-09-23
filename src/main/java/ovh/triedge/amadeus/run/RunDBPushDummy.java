package ovh.triedge.amadeus.run;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ovh.triedge.amadeus.model.Project;
import ovh.triedge.amadeus.model.Unit;

public class RunDBPushDummy {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Unit.class);
        configuration.addAnnotatedClass(Project.class);
        
        try (SessionFactory sessionFactory
                = configuration.buildSessionFactory()) {
 
            // Initialize Session Object
            Session session = sessionFactory.openSession();
 
            
            Unit unit = new Unit();
            unit.setName("S2i");
            
            Project prj = new Project();
            prj.setDescription("Projects related to s2i-evolution.");
            prj.setName("CAMS");
            prj.setUnit(unit);
            unit.getProjects().add(prj);
 
            session.beginTransaction();
 
            // Here we have used
            // persist() method of JPA
            session.persist(unit);
 
            session.getTransaction().commit();
        }
	}

}
