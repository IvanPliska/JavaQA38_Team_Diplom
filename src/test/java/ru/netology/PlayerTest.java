package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);

        int expected = 3;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSumGenreIfOneGamePlayDouble() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);
        player.play(game, 5);

        int expected = 8;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);
    }
    @Test
    public void shouldmostPlayerByGenreOn() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Баттл Онлайн", "Шуттер");

        Player player = new Player("Petya");
        player.installGame(game1);
        player.installGame(game2);
        player.play(game1, 3);
        player.play(game2, 5);

        Game expected = game2;
        Game actual = player.mostPlayerByGenre(game2.getGenre());
        assertEquals(expected, actual);
    }
    @Test
    public void shouldmostPlayerByGenreOff() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Нетология Баттл Онлайн", "Шуттер");
        Game game3 = store.publishGame("Нетология Баттл Онлайн", "Квест");

        Player player = new Player("Petya");
        player.installGame(game1);
        player.installGame(game2);
        player.play(game1, 3);
        player.play(game2, 5);

        Game expected = null;
        Game actual = player.mostPlayerByGenre(game3.getGenre());
        assertEquals(expected, actual);
    }


//     другие ваши тесты
}
