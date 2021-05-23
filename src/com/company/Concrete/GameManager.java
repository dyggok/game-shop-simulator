package com.company.Concrete;

import com.company.Abstracts.IGameManager;
import com.company.Entities.Game;

public class GameManager implements IGameManager {
    @Override
    public void save(Game game) {
        System.out.println(game.getName()+" adlı oyun sisteme kaydedildi.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+" adlı oyun sistemden silindi.");
    }



}
