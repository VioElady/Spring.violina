package lucrare2.demo;

import java.util.List;
import java.util.ArrayList;

public class GameRepository {
    List<String> games = new ArrayList<>();

    public GameRepository() {
        games.add("Fly");
        games.add("My life");
    }

    public List<String> getGames(){
        return games;
    }

    public void addGame(String name){
        games.add(name);
    }

    public  void delGame(String name ){
        games.remove(name);
    }

}

