package loginRegisterAction;
import loginRegisterDao.Leibie;
import PO.LeibiePO;
import javax.swing.JOptionPane;
import com.opensymphony.xwork2.ActionSupport;
public class Update1Action extends ActionSupport{
	private int id;
	private String sex;
	private String message="input";
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getSex(){
		return this.sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String execute() throws Exception{
	Leibie dao=new Leibie();
		boolean update=dao.updateInfo(info());
		if(update){
			message=SUCCESS;
		}
		return message;
	}
	public LeibiePO info() {
		// TODO Auto-generated method stub
		LeibiePO info=new LeibiePO();
		info.setId(this.getId());
		info.setSex(this.getSex());
		return info;
	}
	public void message(String mess){
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null, mess,title,type);
	}
}
