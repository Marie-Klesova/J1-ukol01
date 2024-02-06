package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void nakresliCtverecek() {
    for (int i = 0; i<4; i++){
      zofka.move(100);
      zofka.turnRight(90);
    }
  }

  public void nakresliDomecek() {
    nakresliCtverecek();{
      zofka.penUp();
      zofka.move(100);
      zofka.penDown();
      zofka.turnRight(45);
      zofka.move(71);
      zofka.turnRight(90);
      zofka.move(71);
      zofka.penUp();
      zofka.turnRight(45);
      zofka.move(100);
      zofka.turnRight(180);

    }
  }

  public void nakresliPrasatko() {
    zofka.penUp();
    zofka.move(50);
    zofka.penDown();

    nakresliCtverecek();

    zofka.turnLeft(90);
    zofka.turnRight(45);
    zofka.move(71);
    zofka.turnRight(90);
    zofka.move(71);
    zofka.penUp();

    zofka.turnLeft(45);
    zofka.turnLeft(180);
    zofka.move(100);

    zofka.penDown();
    zofka.turnLeft(20);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(50);
    zofka.penDown();
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(50);
    zofka.turnRight(50);
    zofka.move(100);

    zofka.penDown();
    zofka.turnRight(90);
    zofka.turnLeft(20);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(50);
    zofka.penDown();
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(57);
    zofka.turnLeft(45);
    zofka.move(50);
    zofka.turnRight(90);
    zofka.penDown();
    zofka.move(25);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(25);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
  }

  public void nakresliOsmiuhelnik() {
    for (int i = 0; i<8; i++){
      zofka.move(40);
      zofka.turnRight(45);
    }
  }


  public void nakresliKolecko() {
    for (int i = 0; i<17; i++){
      zofka.move(10);
      zofka.turnLeft(20);
    }
  }

  public void nakresliSlunicko() {
    for (int i = 0; i<18; i++){
      zofka.move(10);
      zofka.turnLeft(90);
      zofka.move(20);
      zofka.penUp();
      zofka.turnRight(180);
      zofka.move(20);
      zofka.turnLeft(90);
      zofka.penDown();
      zofka.turnRight(20);
    }
  }

  public void nakresliM() {
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(135);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnRight(135);
    zofka.move(100);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
  }

  public void nakresliA() {
    zofka.penDown();
    zofka.turnRight(20);
    zofka.move(110);
    zofka.turnRight(140);
    zofka.move(110);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(55);
    zofka.turnLeft(70);
    zofka.penDown();
    zofka.move(40);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(40);
    zofka.turnRight(70);
    zofka.move(55);
    zofka.turnLeft(70);

    zofka.move(20);
    zofka.turnLeft(90);
  }

  public void nakresliPulkolecko() {
    for (int i = 0; i<180; i++){
      zofka.move(1.5 * Math.PI * 40/360);
      zofka.turnRight(1);
    }
  }



  public void nakresliR() {
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(90);
    nakresliPulkolecko();

    zofka.turnLeft(90);
    zofka.turnLeft(45);
    zofka.move(55);
    zofka.penUp();
    zofka.turnLeft(45);

    zofka.move(20);
    zofka.turnLeft(90);
  }

  public void nakresliI() {
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(180);
    zofka.move(100);
    zofka.penUp();

    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
  }

  public void nakresliE() {
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(30);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(30);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(30);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(30);
    zofka.penUp();

    zofka.move(20);
    zofka.turnLeft(90);
  }





  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

    /* úkol 1. část
    nakresliPrasatko();
     */


    /* úkol 2. část
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(400);
    zofka.penDown();
    nakresliOsmiuhelnik();

    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.penDown();
    nakresliKolecko();
    zofka.penUp();
    zofka.turnLeft(20);
    zofka.move(100);

    zofka.turnLeft(90);
    zofka.move(50);
    zofka.penUp();
    nakresliSlunicko();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(110);

    */

  // Úkol - 3. část

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.move(200);
    zofka.penDown();

    nakresliSlunicko();
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnRight(90);

    zofka.turnLeft(180);
    zofka.move(250);
    zofka.turnLeft(180);
    zofka.penDown();

    nakresliDomecek();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliDomecek();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliDomecek();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliDomecek();
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliDomecek();
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(250);
    zofka.turnLeft(180);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.penDown();


    nakresliDomecek();
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(400);
    zofka.turnRight(90);
    zofka.penDown();

    nakresliPrasatko();
    zofka.penUp();
    zofka.turnLeft(85);
    zofka.move(450);
    zofka.turnRight(90);
    zofka.penDown();

    nakresliDomecek();

    // Úkol - 4. část
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(200);
    zofka.turnLeft(180);
    zofka.penDown();

    nakresliM();
    nakresliA();
    nakresliR();
    nakresliI();
    nakresliE();




  }



}
