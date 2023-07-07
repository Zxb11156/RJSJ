package 代理模式.H_建造者;
public class SportsCar extends CarBuilder {
    @Override
    public void buildBody() {
        car.setBody("运动汽车车身");
    }

    @Override
    public void buildEngine() {
        car.setEngine("运动汽车发动机");
    }

    @Override
    public void buildTyre() {
        car.setTyre("运动汽车轮胎");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("运动汽车变速箱");
    }
}
