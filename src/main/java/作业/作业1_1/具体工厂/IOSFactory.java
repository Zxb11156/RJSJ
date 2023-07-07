package 作业.作业1_1.具体工厂;

import 作业.作业1_1.具体产品.IOSInterface;
import 作业.作业1_1.具体产品.IOSOperation;
import 作业.作业1_1.抽象工厂.AbstractFactory;
import 作业.作业1_1.产品接口.InterfaceControl;
import 作业.作业1_1.产品接口.OperationControl;

public class IOSFactory implements AbstractFactory {
    @Override
    public InterfaceControl produceInterfaceControl() {
        return new IOSInterface();
    }

    @Override
    public OperationControl produceOperationControl() {
        return new IOSOperation();
    }
}
