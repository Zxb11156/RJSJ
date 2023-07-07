package 代理模式.H_建造者;

public class Player {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct(){
        carBuilder.buildBody();
        carBuilder.buildEngine();
        carBuilder.buildGearbox();
        carBuilder.buildTyre();
        return carBuilder.getCar();
    }
}
