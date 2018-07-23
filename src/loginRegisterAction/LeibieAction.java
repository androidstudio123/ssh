package loginRegisterAction;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import loginRegisterDao.Leibie;
public class LeibieAction extends ActionSupport{
	private String message="input";
	private HttpServletRequest request;
	
	public String execute() throws Exception{
		request=ServletActionContext.getRequest();
		Leibie dao=new Leibie();
		List list=dao.findAllInfo();
		request.getSession().setAttribute("count",list.size());
      request.getSession().setAttribute("allInfo", list);
      message="success";
      return message;
	}
}
