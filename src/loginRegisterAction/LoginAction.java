package loginRegisterAction;//ҵ�������Action����ҵ���߼����
import com.opensymphony.xwork2.ActionSupport;
import loginRegisterDao.LoginRegisterInfo;//���ݿ������
import PO.UserInfoPO;//�־û���
import java.util.List;//�б���
public class LoginAction extends ActionSupport{
private String userName;
private String password;
private String message="error";
private List list;
public String getUserName(){
	return userName;
}
public void setUserName(String userName){
	this.userName=userName;
}
public String getPassword(){
	return password;
}
public void setPassword(String password){
	this.password=password;
}
public void validate(){
	System.out.println("LoginAction.validate()");
	if(this.getUserName()==null||this.getUserName().length()==0){
		addFieldError("userName","不能为空！");
	}else {
		LoginRegisterInfo info=new LoginRegisterInfo();
		list=info.queryInfo("userName",this.getUserName());
		if(list.size()==0){
			addFieldError("userName","���û���δע��");
		}else{
			UserInfoPO ui=new UserInfoPO();
			int count=0;
			for(int i=0;i<list.size();i++){
				count++;
				ui=(UserInfoPO)list.get(i);
				if(this.getUserName().equals(ui.getUserName())){
					if(ui.getPassword().equals(this.getPassword())){
						message=SUCCESS;
					}else{
						addFieldError("password","��¼���벻�ԣ�");
					}
				}
			}
		}
	}
}
public String execute() throws Exception{
	return message;
}
}
