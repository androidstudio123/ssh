package loginRegisterDao;
import addHibernateFile.HibernateSessionFactory;
import PO.LeibiePO;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class Leibie {
private Transaction transaction;
private Session session;
private Query query;
public Leibie(){
}
public boolean saveInfo(LeibiePO info){
	try{
		session=HibernateSessionFactory.getSession();
		transaction=session.beginTransaction();
		session.save(info);
		transaction.commit();
		session.close();
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}
}

public  List findInfo(String type,Object value){	
	session=HibernateSessionFactory.getSession();
	try{
		transaction=session.beginTransaction();
		System.out.println("1");
		String queryString="from LeibiePO as model where model."+type+"=?";
		System.out.println("1");
				query=session.createQuery(queryString);
				System.out.println("2");
				query.setParameter(0, value);
				System.out.println("3");
				List list=query.list();
				System.out.print(list+"111");
				transaction.commit();
				session.close();
				return list;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
public  List findAllInfo(){
	session=HibernateSessionFactory.getSession();
	try{
		transaction=session.beginTransaction();
		String queryString="from LeibiePO";
				query=session.createQuery(queryString);
				List list=query.list();
				transaction.commit();
				session.close();
				System.out.print(list);
				return list;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
public boolean deleteInfo(int id){
	try{
		session=HibernateSessionFactory.getSession();
		transaction=session.beginTransaction();
		LeibiePO info=new LeibiePO();
		info=(LeibiePO)session.get(LeibiePO.class,id);
		session.delete(info);
		transaction.commit();
		session.close();
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}
}
public boolean updateInfo(LeibiePO info){
	try{
		session=HibernateSessionFactory.getSession();
		transaction=session.beginTransaction();
		session.update(info);
		transaction.commit();
		session.close();
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}
}
public void message(String mess){
	int type=JOptionPane.YES_NO_OPTION;
	String title="提示信息";
	JOptionPane.showMessageDialog(null, mess,title,type);
}
}
