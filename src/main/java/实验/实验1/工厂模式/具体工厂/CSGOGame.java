package 实验.实验1.工厂模式.具体工厂;

import 实验.实验1.工厂模式.具体产品.CSGO;
import 实验.实验1.工厂模式.抽象产品.Game;
import 实验.实验1.工厂模式.抽象工厂.GameFactory;

public class CSGOGame implements GameFactory {

    @Override
    public Game CreateGame() {
        return new CSGO();
    }
}
