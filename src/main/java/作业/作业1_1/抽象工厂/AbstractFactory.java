package 作业.作业1_1.抽象工厂;

import 作业.作业1_1.产品接口.InterfaceControl;
import 作业.作业1_1.产品接口.OperationControl;

public interface AbstractFactory {
    public InterfaceControl produceInterfaceControl();
    public OperationControl produceOperationControl();
}
