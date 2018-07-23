package loginRegisterAction;
import loginRegisterDao.Dy;
import javax.swing.JOptionPane;
import com.opensymphony.xwork2.ActionSupport;
public class DycAction extends ActionSupport{
	private int id;
	private String message;
 public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String execute() throws Exception{
		Dy dao=new Dy();
		System.out.print(id);
		boolean del=dao.deleteInfo(this.getId());
		
		if(del){
			message=SUCCESS;
		}
		return message;
	}
	public void message(String mess){
	int type=JOptionPane.YES_NO_OPTION;
	String title="提示信息";
	JOptionPane.showMessageDialog(null, mess,title,type);
}
}
