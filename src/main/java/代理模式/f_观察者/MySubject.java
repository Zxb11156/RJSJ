package 代理模式.f_观察者;

import java.util.*;

public abstract class MySubject
{
	protected ArrayList observers = new ArrayList();
	
	//ע�᷽��
	public void attach(MyObserver observer)
	{
		observers.add(observer);
	} 
	
	//ע������
	public void detach(MyObserver observer)
	{
		observers.remove(observer);
	}
	
	public abstract void cry(); //����֪ͨ����
}