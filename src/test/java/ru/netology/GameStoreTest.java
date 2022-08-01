package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameStoreTest {
    GameStore store = new GameStore();
    Game game1 = store.publishGame("Гарри Поттер", "RPG");
    Game game2 = store.publishGame("Танки", "Стратегии");
    Game game3 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
    Game game4 = store.publishGame("Симсы", "Симулятор");
    Game game5 = store.publishGame("Контра", "Шутер");

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }



    // другие ваши тесты
}
