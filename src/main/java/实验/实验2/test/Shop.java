package 实验.实验2.test;

import java.util.ArrayList;

public class Shop implements Watched{
    //定义集合存储对象
    ArrayList<Look> list=new ArrayList<>();

    @Override
    public void addLooker(Look look) {
        list.add(look);
    }

    @Override
    public void removeLooker(Look look) {
        list.remove(look);
    }

    @Override
    public void NotifyLooker() {
        for(Look look:list){
            look.watch();
        }
    }
}
