package 实验.实验3.观察者模式;


import java.util.ArrayList;
import java.util.List;

//具体主题，即具体的明星
public class ConcreteStar implements Star {

    private List<Fans> fansList = new ArrayList<Fans>();


    @Override
    public void addFans(Fans fans) {
        fansList.add(fans);
    }

    @Override
    public void delFans(Fans fans) {
        fansList.remove(fans);
    }

    @Override
    public void notify(String msg) {
        for (Fans fans : fansList) {
            fans.update(msg);
        }
    }
}
