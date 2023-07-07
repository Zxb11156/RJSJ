package 代理模式.动态代理;

public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name) {
        System.out.println(this.name + "正在唱：" + name);
        return "你干嘛，哈哈，哎哟";
    }

    public void dance() {
        System.out.println(this.name +"正在跳ikun舞");
    }
}
