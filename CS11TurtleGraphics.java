/*
 * Name: Darell Hoei
 * Login: cs11fadt
 * Date: September 24, 2016
 * File: CS11TurtleGraphics.java
 * Sources of Help: The PA1 Homework Writeup
 *
 * This program prints out a text using the 
 * turtle class.
 */
import turtleClasses.*;
import java.awt.Color;
/*
 * Name: CS11TurtleGraphics
 * Purpose: General class
 */
public class CS11TurtleGraphics extends Turtle { 
  private final static int CHAR_WIDTH = 40;
  private final static int CHAR_HEIGHT = 80;
  private final static int HALF_CHAR_WIDTH = CHAR_WIDTH / 2;
  private final static int HALF_CHAR_HEIGHT = CHAR_HEIGHT / 2;
  private final static int PADDING_BETWEEN_CHARS = 40;
  private final static int PADDING_BETWEEN_LINES = 40;
  private final static int CHAR_SPACING = CHAR_WIDTH + PADDING_BETWEEN_CHARS;
  private final static int LINE_SPACING = CHAR_HEIGHT + PADDING_BETWEEN_LINES;
  private final static int DOUBLE_CHAR_SPACING = 2 * CHAR_SPACING;
  private final static int DOUBLE_LINE_SPACING = 2 * LINE_SPACING;
  private final static int CENTER_OFFSET_WIDTH = CHAR_WIDTH / 2;
  private final static double FIFTEEN_DEGREES = 15.0;
  private final static double THIRTY_DEGREES = 30.0;
  private final static int OFFSET_DIAGONAL_CHAR_N = 12;

  private final static int START_X_1 = 40; // starting x offset for line 1
  private final static int START_X_2 = 40; // starting x offset for line 2
  private final static int START_X_3 = 40; // starting x offset for line 3
  private final static int START_Y = 40; // starting y offset
  private final static int PEN_WIDTH = 10;
  private final static Color PEN_COLOR = Color.BLUE;
  private final static int WORLD_WIDTH = 1080;
  private final static int WORLD_HEIGHT = 480;
  /*
  * Delay between turtle actions (turns, moves) in milliseconds.
  * 1000 = 1 sec. so 200 = 0.2 sec.
  */
  private final static int DELAY = 200;  // remember to change this back to 200
  /*
  * Name: CS11TurtleGraphics
  * Purpose: Creates Turtle World
  * Parameters: World w, int delay
  */
  public CS11TurtleGraphics(World w, int delay) {
  super(w, delay); // Invoke superclass's ctor to create this turtle
  } // on World w with delay of each turtle's action.
  /*
  * Name: drawC
  * Purpose: Draws the character C
  * Parameters: int x, int y
  * Return: void
  */
  private void drawC(int x, int y) {
  penUp();
  moveTo(x, y); // always start in upper left corner of this char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  turnLeft();
  forward(CHAR_WIDTH);
  }
  /*
  * Name: drawS
  * Purpose: Draws the character S
  * Parameters: int x, int y
  * Return: void
  */
  private void drawS(int x, int y) {
  penUp();
  moveTo(x, y); // always start in upper left corner of this char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  }
  /*
  * Name: draw1
  * Purpose: Draws the number 1
  * Parameters: int x, int y
  * Return: void
  */
  private void draw1(int x, int y) {
  penUp();
  moveTo(x + CENTER_OFFSET_WIDTH, y); // start in top-center of char block
  turnToFace(getXPos() - 1, getYPos() + 1); // face left-down
  penDown();
  forward(HALF_CHAR_WIDTH);
  backward(HALF_CHAR_WIDTH);
  turnToFace(getXPos(), getYPos() + 1); // face down
  forward(CHAR_HEIGHT);
  turnRight();
  forward(HALF_CHAR_WIDTH);
  backward(CHAR_WIDTH);
  }
  /*
  * Name: drawF
  * Purpose: Draws the letter F
  * Parameters: int x, int y
  * Return: void 
  */
  private void drawF(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(HALF_CHAR_WIDTH);
  backward(HALF_CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  }
  /*
  * Name: drawA
  * Purpose: Draws the letter A
  * Parameters: int x, int y
  * Return: void
  */
  private void drawA(int x, int y) {
  penUp();
  moveTo(x + CENTER_OFFSET_WIDTH, y); // start in top-center of char block
  turnToFace(getXPos(), getYPos() + 1); // face down
  turn(FIFTEEN_DEGREES); // turn right 15 degrees
  penDown();
  forward(CHAR_HEIGHT);
  backward(CHAR_HEIGHT);
  turnToFace(getXPos(), getYPos() + 1); // face down
  turn(-FIFTEEN_DEGREES); // turn left 15 degrees
  forward(CHAR_HEIGHT);
  backward(CHAR_WIDTH);
  turnToFace(getXPos() - 1, getYPos()); // face left
  forward(HALF_CHAR_WIDTH);
  }
  /*
  * Name: drawD
  * Purpose: Draws the letter D
  * Parameters: int x, int y
  * Return: void
  */
  private void drawD(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  turnToFace(getXPos(), getYPos() + 1); // face down
  turn(-FIFTEEN_DEGREES); // turn left 15 degrees
  forward(HALF_CHAR_WIDTH);
  turnToFace(getXPos(), getYPos() + 1); // face down
  forward(CHAR_WIDTH);
  turn(FIFTEEN_DEGREES); // turn right 15 degrees
  forward(HALF_CHAR_WIDTH);
  turnToFace(getXPos() - 1, getYPos()); // face left
  forward(CHAR_WIDTH);
  turnToFace(getXPos(), getYPos() - 1); // face up
  forward(CHAR_HEIGHT);
  }
  /*
  * Name: drawT
  * Purpose: Draws the letter T
  * Parameters: int x, int y
  * Return: void
  */
  private void drawT(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(HALF_CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  }
  /*
  * Name: drawJ
  * Purpose: Draws the letter J
  * Parameters: int x, int y
  * Return: void
  */
  private void drawJ(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(HALF_CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  turnRight();
  forward(HALF_CHAR_WIDTH);
  turnRight();
  forward(HALF_CHAR_WIDTH);
  }
  /*
  * Name: drawV
  * Purpose: Draws the letter V
  * Parameters; int x, int y
  * Return: void
  */
  private void drawV(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos(), getYPos() + 1); // face down
  turn(-FIFTEEN_DEGREES); // turn left 15 degrees
  penDown();
  forward(CHAR_HEIGHT);
  turnToFace(getXPos(), getYPos() - 1); // face up
  turn(FIFTEEN_DEGREES); // turn right 15 degrees
  forward(CHAR_HEIGHT);
  }
  /*
  * Name: draw2
  * Purpose: Draws the number 2
  * Parameters: int x, int y
  * Return: void
  */
  private void draw2(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  }
  /*
  * Name: draw0
  * Purpose: Draws the number 0
  * Parameters: int x, int y
  * Return: void
  */
  private void draw0(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  turnRight();
  forward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  }
  /*
  * Name: draw6
  * Purpose: Draws the number 6
  * Parameters: int x, int y
  * Return: void
  */
  private void draw6(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  turnLeft();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  }
  /*
  * Name: drawU
  * Purpose: Draws the letter U
  * Parameters: int x, int y
  * Return: void
  */
  private void drawU(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos(), getYPos() + 1); // face down
  penDown();
  forward(CHAR_HEIGHT);
  turnLeft();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_HEIGHT);
  }
  /*
  * Name: drawN
  * Purpose: Draws the letter N
  * Parameters: int x, int y
  * Return: void
  */
  private void drawN(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos(), getYPos() + 1); // face down
  penDown();
  forward(CHAR_HEIGHT);
  backward(CHAR_HEIGHT);
  turn(-THIRTY_DEGREES); // turn left 15 degrees
  forward(CHAR_HEIGHT + OFFSET_DIAGONAL_CHAR_N);  // diagonal of N
  turnToFace(getXPos(), getYPos() -1); // face up
  forward(CHAR_HEIGHT);
  }
  /*
  * Name: drawI
  * Purpose: Draws the letter I
  * Parameters: int x, int y
  * Return: void
  */
  private void drawI(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(HALF_CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  turnLeft();
  forward(HALF_CHAR_WIDTH);
  backward(CHAR_WIDTH);
  }
  /*
  * Name: drawE
  * Purpose: Draws the letter E
  * Parameters: int x, int y
  * Return: void
  */
  private void drawE(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  }
  /*
  * Name: drawG
  * Purpose: Draws the letter G
  * Parameters: int x, int y
  * Return: void
  */
  private void drawG(int x, int y) {
  penUp();
  moveTo(x, y); // start in upper left corner of char block
  turnToFace(getXPos() + 1, getYPos()); // face right
  penDown();
  forward(CHAR_WIDTH);
  backward(CHAR_WIDTH);
  turnRight();
  forward(CHAR_HEIGHT);
  turnLeft();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(CHAR_WIDTH);
  turnLeft();
  forward(HALF_CHAR_WIDTH);
  }
  /*
  * Name: Main
  * Purpose: The main program which writes the sentence
  * Parameters: String [] args
  * Return: void
  */
  public static void main(String [] args) {
  int startX1 = START_X_1; // starting x offset for line 1
  int startX2 = START_X_2; // starting x offset for line 2
  int startX3 = START_X_3; // starting x offset for line 3
  int startY = START_Y; // starting y offset
  int x, y;
  World w = new World(WORLD_WIDTH, WORLD_HEIGHT);
  CS11TurtleGraphics myTurtle = new CS11TurtleGraphics(w, DELAY);
  myTurtle.setPenWidth(PEN_WIDTH);
  myTurtle.setPenColor(PEN_COLOR);
  myTurtle.drawC(x = startX1, y = startY);
  myTurtle.drawS(x += CHAR_SPACING, y);
  myTurtle.draw1(x += CHAR_SPACING, y);
  myTurtle.draw1(x += CHAR_SPACING, y);
  myTurtle.drawF(x += CHAR_SPACING, y);
  myTurtle.drawA(x += CHAR_SPACING, y);
  myTurtle.drawD(x += CHAR_SPACING, y);
  myTurtle.drawT(x += CHAR_SPACING, y);

  myTurtle.drawJ(x = startX2, y += LINE_SPACING);
  myTurtle.drawA(x += CHAR_SPACING, y);
  myTurtle.drawV(x += CHAR_SPACING, y);
  myTurtle.drawA(x += CHAR_SPACING, y);
  myTurtle.draw2(x += DOUBLE_CHAR_SPACING, y);
  myTurtle.draw0(x += CHAR_SPACING, y);
  myTurtle.draw1(x += CHAR_SPACING, y);
  myTurtle.draw6(x += CHAR_SPACING, y);

  myTurtle.drawU(x = startX3, y += LINE_SPACING);
  myTurtle.drawC(x += CHAR_SPACING, y);
  myTurtle.drawS(x += DOUBLE_CHAR_SPACING, y);
  myTurtle.drawA(x += CHAR_SPACING, y);
  myTurtle.drawN(x += CHAR_SPACING, y);
  myTurtle.drawD(x += DOUBLE_CHAR_SPACING, y);
  myTurtle.drawI(x += CHAR_SPACING, y);
  myTurtle.drawE(x += CHAR_SPACING, y);
  myTurtle.drawG(x += CHAR_SPACING, y);
  myTurtle.draw0(x += CHAR_SPACING, y);
  }
} // End of public class CS11TurtleGraphics extends Turtle
