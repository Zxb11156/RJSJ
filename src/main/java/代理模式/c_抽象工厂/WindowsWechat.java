package 代理模式.c_抽象工厂;

public class WindowsWechat implements Wechat{
    @Override
    public void Pay() {
        System.out.println("Windows下使用微信付款");
    }
}
