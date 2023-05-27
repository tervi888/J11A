package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioCanal(){
        Radio canal = new Radio();
        canal.setCurrentStation(6);
        int expected = 6;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioCanal2(){
        Radio canal = new Radio();
        canal.setCurrentStation(10);
        int expected = 0;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioCanal3(){
        Radio canal = new Radio();
        canal.setCurrentStation(-1);
        int expected = 0;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioCanal4(){
        Radio canal = new Radio();
        canal.setCurrentStation(0);
        int expected = 0;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioCanal5(){
        Radio canal = new Radio();
        canal.setCurrentStation(9);
        int expected = 9;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioCanal6(){
        Radio canal = new Radio();
        canal.setCurrentStation(1);
        int expected = 1;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioCanal7(){
        Radio canal = new Radio();
        canal.setCurrentStation(8);
        int expected = 8;
        int actual = canal.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume(){
        Radio volume = new Radio();
        volume.setCurrentVolume(25);
        int expected = 25;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume1(){
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume2(){
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume3(){
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume4(){
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume5(){
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume6(){
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume7(){
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldNextStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.previous();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldPreviousStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.previous();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldPreviousStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previous();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldPreviousStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.previous();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldPreviousStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.previous();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}
