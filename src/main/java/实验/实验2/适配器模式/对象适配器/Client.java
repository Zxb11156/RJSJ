package 实验.实验2.适配器模式.对象适配器;

public class Client {

    public static void main(String[] args) {
        Computer computer = new ROGAdapter(new ROG());
        computer.Msg();
    }
}
