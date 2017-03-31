package com.woniu.struts4;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionProxy actionProxy =invocation.getProxy();
		String nameSpace= actionProxy.getNamespace();
		String actionName= actionProxy.getActionName();
		String method=actionProxy.getMethod();
		Object action = invocation.getAction();
		if(action instanceof ModelDriven){
			Object object=((ModelDriven) action).getModel();
			if(object instanceof User){
				((User) object).getUserName();
			}
		}
			 
		String invoke = invocation.invoke();
		return invoke;
	}


}
