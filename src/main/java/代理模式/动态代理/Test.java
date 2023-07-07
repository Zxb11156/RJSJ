package 代理模式.动态代理;

public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("蔡徐坤");
        Star star = ProxyUtil.creatProxy(bigStar);
        String msg = star.sing("只因你太美");
        System.out.println(msg);
        System.out.println("-----------------------------");
        star.dance();
    }
}
