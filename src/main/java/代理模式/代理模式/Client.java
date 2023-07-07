package 代理模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
	public static void main(String args[])
	{
	InvocationHandler handler =null;
    AbstractSubject subject=null;

//        ClassLoader loader,     指定一个类加载器
//        Class<?>[] interfaces,  指定代理有哪些方法（数组）
//        InvocationHandler h     指定生成的代理对象

    handler=new DynamicProxy(new RealSubjectA());
    subject=(AbstractSubject)Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{AbstractSubject.class}, handler);
    subject.request();
    
    System.out.println("------------------------------");
    
    handler=new DynamicProxy(new RealSubjectB());
    subject=(AbstractSubject)Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, handler);
    subject.request();
	} 
}