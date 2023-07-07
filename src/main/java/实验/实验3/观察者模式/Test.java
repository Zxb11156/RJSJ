package 实验.实验3.观察者模式;

public class Test {

    public static void main(String[] args) {
        ConcreteStar star = new ConcreteStar();
        ConcreteFans fans1 = new ConcreteFans("张三");
        ConcreteFans fans2 = new ConcreteFans("李四");
        ConcreteFans fans3 = new ConcreteFans("王五");
        star.addFans(fans1);
        star.addFans(fans2);
        star.addFans(fans3);
        star.notify("大家好我是练习时长两年半的篮球练习生蔡徐坤，我会唱、跳、rap、篮球、music");
    }
}
