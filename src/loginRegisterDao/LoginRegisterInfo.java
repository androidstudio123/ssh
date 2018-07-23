package loginRegisterDao;
import addHibernateFile.HibernateSessionFactory;
import PO.UserInfoPO;
import PO.DyPO;
import java.util.*;
import javax.swing.*;
import org.hibernate.*;
public class LoginRegisterInfo {
private Session session;
private Transaction transaction;
private Query query;
HibernateSessionFactory getSession;
public LoginRegisterInfo(){
}
public String saveInfo(UserInfoPO info){
	String mess="error";
	getSession=new HibernateSessionFactory();
	session=getSession.getSession();
	try{
		System.out.println("ִ��ע��");
		transaction=session.beginTransaction();
		session.save(info);
		transaction.commit();
		mess="success";
		return mess;
	}catch(Exception e){
		//message("RegisterInfo.error:"+e);
		e.printStackTrace();
		return null;
	}
}
public List queryInfo(String type,Object value){
	System.out.println("LoginRegisterInfo.queryInfo()");
	getSession=new HibernateSessionFactory();
	session=getSession.getSession();
	try{System.out.println("ִ�в�ѯ");
		String hqlsql="from UserInfoPO as u where u.userName=?";
		query=session.createQuery(hqlsql);
		query.setParameter(0, value);
		System.out.println("value="+value);
		List list=query.list();
		if(list!=null) System.out.println(list.size());
		transaction=session.beginTransaction();
		transaction.commit();
		return list;
	}catch(Exception e){
		//message("LoginRegisterInfo�������쳣���쳣Ϊ��"+e);
		e.printStackTrace();
		return null;
	}
}
public  List findAllInfo(){
	getSession=new HibernateSessionFactory();
	session=getSession.getSession();
	try{
		transaction=session.beginTransaction();
		String queryString="from info";
				query=session.createQuery(queryString);
				List list=query.list();
				transaction.commit();
				session.close();
				return list;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
public boolean deleteInfo(String id){
	try{
		session=getSession.getSession();
		transaction=session.beginTransaction();
		UserInfoPO info=new UserInfoPO();
		info=(UserInfoPO) session.get(UserInfoPO.class, id);
		session.delete(info);
		transaction.commit();
		session.close();
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}
}
public boolean updateInfo(UserInfoPO info){
	try{
		session=getSession.getSession();
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
	String title="��ʾ��Ϣ";
	JOptionPane.showMessageDialog(null, mess,title,type);
}
}
