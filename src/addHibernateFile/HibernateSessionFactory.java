package addHibernateFile;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateSessionFactory {
private static SessionFactory sessionFactory;
private static Configuration configuration=new Configuration();
public HibernateSessionFactory(){
	System.out.println("chushihua");
}
	static {
		try{
		System.out.println("11111111");
		Configuration configuration=new Configuration();
		System.out.println("22222222222");
		Configuration configure=configuration.configure("hibernate.cfg.xml");
		System.out.println("3333333333");
		sessionFactory= configure.buildSessionFactory();
	}catch(Exception e){
		e.printStackTrace();
	}
}
public static Session getSession(){
	System.out.println("HibernateSessionFactory.getSession()");
	
	return sessionFactory.openSession();
}
public void message(String mess){
	int type=JOptionPane.YES_NO_OPTION;
	String title="提示信息";
	JOptionPane.showMessageDialog(null, mess,title,type);
}
}
