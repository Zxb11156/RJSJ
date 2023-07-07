package 代理模式.H_建造者;

public class Truck extends CarBuilder{
    @Override
    public void buildBody() {
        car.setBody("卡车车身");
    }

    @Override
    public void buildEngine() {
        car.setEngine("卡车发动机");
    }

    @Override
    public void buildTyre() {
        car.setTyre("卡车轮胎");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("卡车变速箱");
    }
}
