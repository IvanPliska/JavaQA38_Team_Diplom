package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameStoreTest {
    GameStore store = new GameStore();
    Game game1 = store.publishGame("Гарри Поттер", "RPG");
    Game game2 = store.publishGame("Танки", "Стратегии");
    Game game3 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
    Game game4 = store.publishGame("Симсы", "Симулятор");

    @Test
    public void shouldAddGame() {
        assertTrue(store.containsGame(game1));
    }

    @Test
    public void shouldAllAddGame() {
        assertTrue(store.containsGame(game1));
        assertTrue(store.containsGame(game2));
        assertTrue(store.containsGame(game3));
        assertTrue(store.containsGame(game4));
    }

    // другие ваши тесты
}
