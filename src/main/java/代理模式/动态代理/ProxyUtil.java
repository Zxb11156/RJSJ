package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star creatProxy(BigStar bigStar) {
//        ClassLoader loader,     指定一个类加载器
//        Class<?>[] interfaces,  指定代理有哪些方法（数组）
//        InvocationHandler h     指定生成的代理对象干什么
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            //回调方法
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //代理需要做的事，在这里
                if (method.getName().equals("sing")) {
                    System.out.println("准备唱歌的场地和设备");
                } else if (method.getName().equals("dance")) {
                    System.out.println("准备跳舞的场地和设备");
                }
                return method.invoke(bigStar,args);
            }
        });
        return starProxy;
    }
}
