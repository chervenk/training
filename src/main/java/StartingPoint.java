import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StartingPoint {
	private static final Logger logger = Logger.getLogger(StartingPoint.class);

	public static void main(String[] args) {
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml")
				.build();
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
			logger.error("cannot create sessionFactory", e);
			System.exit(1);
		}
		// create session, open transaction and save test entity to db
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			EntityClass testEntity = new EntityClass();
			testEntity.setName("thirdDevice");

			session.persist(testEntity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			logger.error("cannot commit transaction", e);
		} finally {
			session.close();
		}

		// clean up
		sessionFactory.close();
	}
}