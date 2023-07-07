package 代理模式.c_抽象工厂;

public class LinuxWechat implements Wechat{
    @Override
    public void Pay() {
        System.out.println("Linux下使用微信付款");
    }
}
