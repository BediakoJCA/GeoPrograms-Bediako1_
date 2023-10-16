import java.awt.event.KeyEvent;

public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
square();
//        for(int i =5; i< 35; i = i +5){
//
//
//                    System.out.println(i);
//        }

            plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);


    }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
        plane.isTrail = false;
        plane.move(222);
    }

    public void triangle(){
        plane.startingAngle(-45);
        plane.move(55);
        plane.turn(120);
        plane.move(50);


    }
public void sun(){
        plane.isTrail = false;
    plane.trailWidth = 60;
    plane.setColor(255, 234, 0);
    plane.startingAngle(270);
    plane.move(150);
    plane.startingAngle(180);
    plane.move(110);
    plane.isTrail = true;
    plane.trailWidth = 100;
    plane.move(2);}

    public void dog(){
        plane.setColor(150, 75, 0);
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(600);
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(100);
        plane.isTrail = true;
        plane.move(2);}
public void grass(){
plane.startingAngle(90);
plane.isTrail = false;
plane.move(80);
plane.setColor(0, 200, 0);
plane.isTrail = true;
plane.startingAngle(0);
plane.move(1000);
plane.turn(180);
plane.move(5000);
    }




    public void fives(){
        for(int i =5; i< 35; i = i +5){

System.out.println(i);
        }}
        public void countDown(){
            for (int i = 7; i > 2; i = i  -1) {
                System.out.println(i);
            }
            }
        }




//        for(int i =5; i< 35; i = i +5){






















/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/