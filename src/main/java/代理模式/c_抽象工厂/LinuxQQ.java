package 代理模式.c_抽象工厂;

public class LinuxQQ implements QQ{
    @Override
    public void Chat() {
        System.out.println("Linux环境下使用QQ进行聊天");
    }
}
