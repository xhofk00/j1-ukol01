package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    nakresliSlunicko();

    posunDum();
    nakresliDomecek();
    nakresliDomecek();
    nakresliDomecek();
    nakresliDomecek();
    nakresliDomecek();

    posunDomek();
    nakresliDomecek();

    posunPrasatko();
    nakresliPrasatko();

    posunDomecek();
    nakresliDomecek();

    posunK();
    nakresliK();

    posunPismena();
    nakresliA();
    posunPismena();
    nakresliT();
    posunPismena();
    nakresliK();
    posunPismena();
    nakresliA();
  }

  public void nakresliCtverecek() {
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);
    }
  }

  public void nakresliDomecek() {
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);
    }
    zofka.move(100);
    zofka.turnRight(45);
    zofka.move(Math.sqrt(1)*80);
    zofka.turnRight(100);
    zofka.move(Math.sqrt(1)*80);

    zofka.penUp();
    zofka.turnRight(35);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void nakresliPrasatko() {
    for (int i = 0; i < 1; i++) {
      zofka.move(100);
      zofka.turnRight(90);
      zofka.move(150);
      zofka.turnRight(90);
      zofka.move(100);
      zofka.turnLeft(45);
      zofka.move(50);
      zofka.turnLeft(180);
      zofka.move(50);
      zofka.turnLeft(90);
      zofka.move(50);
      zofka.turnLeft(180);
      zofka.move(50);
      zofka.turnLeft(135);
      zofka.move(150);
      zofka.turnLeft(135);
      zofka.move(50);
      zofka.turnLeft(180);
      zofka.move(50);
      zofka.turnLeft(90);
      zofka.move(50);
      zofka.turnLeft(180);
      zofka.move(50);
      zofka.turnLeft(90);
      zofka.move(Math.sqrt(1)*80);
      zofka.turnRight(100);
      zofka.move(Math.sqrt(1)*80);
    }
  }

  public void nakresliOsmiuhlenik() {
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(45);
      zofka.move(Math.sqrt(1)*80);
      zofka.turnRight(45);
    }
  }

  public void nakresliKruh() {
    for (int i = 0; i < 24; i++) {
      zofka.move(20);
      zofka.turnRight(15);
    }
  }

  public void nakresliSlunicko() {
    zofka.penUp();
    zofka.move(300);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.penDown();
    for (int i = 0; i < 9; i++) {
      zofka.turnRight(10);
      zofka.move(5);
      zofka.turnRight(10);
      zofka.turnLeft(90);
      zofka.move(15);
      zofka.turnRight(180);
      zofka.move(15);
      zofka.turnLeft(90);
      zofka.move(5);
      zofka.turnRight(10);
      zofka.move(5);
      zofka.turnRight(10);
    }
  }

  public void nakresliK() {
    zofka.move(200);
    zofka.turnRight(180);
    zofka.move(100);
    zofka.turnLeft(135);
    zofka.move(130);
    zofka.turnLeft(180);
    zofka.move(130);
    zofka.turnLeft(90);
    zofka.move(130);
    zofka.turnLeft(135);
  }

  public void nakresliA() {
    zofka.turnRight(25);
    zofka.move(200);
    zofka.turnRight(180);
    zofka.move(100);
    zofka.turnLeft(115);
    zofka.move(77);
    zofka.turnLeft(180);
    zofka.move(77);
    zofka.turnRight(115);
    zofka.move(100);
    zofka.turnRight(130);
    zofka.move(200);
    zofka.turnLeft(155);
  }

  public void nakresliT() {
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnRight(180);
    zofka.move(200);
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnLeft(180);
  }

  public void posunPismena() {
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void posunK() {
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(1020);
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(180);
    zofka.penDown();
  }

  public void posunDomecek() {
    zofka.penUp();
    zofka.turnRight(45);
    zofka.move(470);
    zofka.turnLeft(100);
    zofka.penDown();
  }

  public void posunPrasatko() {
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void posunDomek() {
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(1020);
    zofka.turnLeft(90);
    zofka.move(250);
    zofka.turnLeft(180);
    zofka.penDown();
  }

  public void posunDum() {
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(700);
    zofka.turnLeft(180);
    zofka.move(400);
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnRight(90);
    zofka.penDown();
  }
}
