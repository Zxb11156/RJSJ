package 实验.实验1.工厂模式;

import 实验.实验1.工厂模式.具体产品.LOL;
import 实验.实验1.工厂模式.具体工厂.CFGame;
import 实验.实验1.工厂模式.具体工厂.CSGOGame;
import 实验.实验1.工厂模式.具体工厂.LOLGame;
import 实验.实验1.工厂模式.抽象产品.Game;
import 实验.实验1.工厂模式.抽象工厂.GameFactory;

public class Test {
    public static void main(String[] args) {
        GameFactory gameFactory = null;
        Game game = null;
        gameFactory= new CFGame();
        game = gameFactory.CreateGame();
        game.outMessage();
        System.out.println("-----------------------------");
        gameFactory= new LOLGame();
        game = gameFactory.CreateGame();
        game.outMessage();
        System.out.println("-----------------------------");
        gameFactory= new CSGOGame();
        game = gameFactory.CreateGame();
        game.outMessage();
    }
}
