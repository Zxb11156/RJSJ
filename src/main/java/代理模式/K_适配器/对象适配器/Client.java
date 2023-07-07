package 代理模式.K_适配器.对象适配器;

public class Client {

    public static void main(String[] args) {
        Computer computer = new ROGAdapter(new ROG());
        computer.Msg();
    }
}
