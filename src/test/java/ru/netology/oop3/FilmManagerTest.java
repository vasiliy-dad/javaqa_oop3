package ru.netology.oop3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldAllFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllFilms2() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");

        String[] expected = {"Бладшот", "Вперёд"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Джентльмены");

        String[] expected = {"Джентльмены", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsWithinLimit() {
        FilmManager manager = new FilmManager(3);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");

        String[] expected = {"Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsExactLimit() {
        FilmManager manager = new FilmManager(3);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Джентльмены");

        String[] expected = {"Джентльмены", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldFindLastFilmsOverLimit() {
//        FilmManager manager = new FilmManager(2);
//
//        manager.addFilm("Бладшот");
//        manager.addFilm("Вперёд");
//        manager.addFilm("Джентльмены");
//
//        String[] expected = {"Джентльмены", "Вперёд"};
//        String[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

    @Test
    public void shouldFindLastFilmsDefaultLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Вперёд");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли", "Человек-невидимка", "Джентльмены", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllFilmsEmptyList() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilmsEmptyList() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
