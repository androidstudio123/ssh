package loginRegisterAction;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import PO.DyPO;
import loginRegisterDao.Dy;
public class PublicAction extends ActionSupport{
private String sex;
private File userName1;
private String userName;
private String savePath;
public void setSex(String sex){
	this.sex=sex;
}
public String getSex(){
	return this.sex;
}
public void setUserName1(File userName1){
	this.userName1=userName1;
}
public File getUserName1(){
	return this.userName1;
}
public void setUserName(String userName){
	this.userName=userName;
}
public String getUserName(){
	return this.userName;
}
public void setSavePath(String value){
	this.savePath=value;
}
private String getSavePath() throws Exception{
	return ServletActionContext.getServletContext().getRealPath(savePath);
}
public String execute() throws Exception{
	Dy dao=new Dy();
	boolean save=dao.saveInfo(info());
	FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+getUserName1());
	FileInputStream fis=new FileInputStream(getUserName());
	byte[] buffer=new byte[1024];
	int len=0;
	while ((len=fis.read(buffer))>0){
		fos.write(buffer,0, len);
	}
	fos.close();
	return SUCCESS;
}
public DyPO info() {
	// TODO Auto-generated method stub
	DyPO info=new DyPO();
	info.setUserName(this.getUserName());
	info.setSex(this.getSex());
	return info;
}
}

