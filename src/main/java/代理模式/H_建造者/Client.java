package 代理模式.H_建造者;

public class Client {
    public static void main(String[] args) {

        CarBuilder carBuilder;

        //以方程式赛车为例
        carBuilder=new FormulaCar();
        Player player = new Player();
        player.setCarBuilder(carBuilder);
        Car car = player.construct();
        System.out.println("您的赛车配置部件如下:");
//        不同类型的赛车的车身、发动机、轮胎、变速箱等部件
        System.out.println("车身："+car.getBody());
        System.out.println("发动机："+car.getEngine());
        System.out.println("轮胎："+car.getTyre());
        System.out.println("变速箱："+car.getGearbox());
    }
}

