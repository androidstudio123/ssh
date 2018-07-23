package loginRegisterAction;
import loginRegisterDao.Leibie;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class UpdateAction extends ActionSupport{
private int id;
private String message="input";
private HttpServletRequest request;
public int getId(){
	return id;
}
public void setId(int id){
	this.id=id;
}

public String execute() throws Exception{
	request=ServletActionContext.getRequest();
	Leibie dao=new Leibie();
	List list=dao.findInfo("id",this.getId());
	request.getSession().setAttribute("one", list);
	System.out.print(id);
	System.out.print(list);
	System.out.print("oneInfo");
	message=SUCCESS;
	return message;
}
public void message(String mess){
	int type=JOptionPane.YES_NO_OPTION;
	String title="提示信息";
	JOptionPane.showMessageDialog(null, mess,title,type);
}
}
