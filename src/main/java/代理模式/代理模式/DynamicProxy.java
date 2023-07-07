package 代理模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//
public class DynamicProxy implements InvocationHandler
{
	private Object obj;
	
	public DynamicProxy(){}
	
	public DynamicProxy(Object obj)
	{
   		this.obj=obj;
   	}
   	
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        //代理要做的事
		preRequest();
        method.invoke(obj, args);
        postRequest();
        return null;
    }

    public void preRequest(){
    System.out.println("赛前准备工作");
    }

    public void postRequest(){
    System.out.println("赛后收尾工作");
    }

}