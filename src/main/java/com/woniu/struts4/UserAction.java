package com.woniu.struts4;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private User user;
	
	
	@Override
	public User getModel() {
		this.user=new User();
		return user;
	}
	
	public String second(){
		
		if("admin".equals(user.getUserName())&&"admin".equals(user.getPassWord())){
			return "second";
		}
		else{return "fail";}
		
	}
	

	public void validateSecond() {
		if(user.getPassWord()!=null&&user.getPassWord().length()<=5){
			System.out.println("密码校验成功");
		}else{System.out.println("密码校验失败");}
		super.validate();
	}
	

}
