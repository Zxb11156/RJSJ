package 代理模式.c_抽象工厂;

public class WindowsQQ implements QQ{
    @Override
    public void Chat() {
        System.out.println("Window环境下使用QQ进行聊天");
    }
}
