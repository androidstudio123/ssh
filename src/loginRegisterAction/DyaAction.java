package loginRegisterAction;
import loginRegisterDao.Dy;
import PO.DyPO;
import javax.swing.JOptionPane;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class DyaAction extends ActionSupport{
	private int id;
	private String userName;
	private String sex;
	private String jj;
	private String message="input";
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getSex(){
		return this.sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getJj(){
		return this.jj;
	}
	public void setJj(String jj){
		this.jj=jj;
	}
public String execute() throws Exception{
	
	Dy dao=new Dy();
	boolean save=dao.saveInfo(info());
	if(save){
		message=SUCCESS;
	}
	return message;
	
}
public DyPO info(){
	DyPO info=new DyPO();
	info.setId(this.getId());
	info.setUserName(this.getUserName());
	info.setSex(this.getSex());
	info.setJj(this.getJj());
	return info;
}
public void message(String mess){
	int type=JOptionPane.YES_NO_OPTION;
	String title="提示信息";
	JOptionPane.showMessageDialog(null, mess,title,type);
}
}