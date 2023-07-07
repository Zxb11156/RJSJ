package 代理模式.d_工厂方法;

public class ByBus implements VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Bus();
    }
}
