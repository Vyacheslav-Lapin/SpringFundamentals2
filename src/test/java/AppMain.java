import com.epam.spring.fundamentals.dao.ContactEntity;
import hibernate.HibernateSessionFactory;
import org.hibernate.Session;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setBirthDate(new Date());
        contactEntity.setFirstName("Nick");
        contactEntity.setLastName("VN");

        session.save(contactEntity);
        session.getTransaction().commit();

        session.close();
    }
}
