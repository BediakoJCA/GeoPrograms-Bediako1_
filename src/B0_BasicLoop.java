public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.trailWidth=5;
gridOfSmallSquares();
    }
    public void rowOfSmallSquares(){
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        for(int y=0; y<1000; y=y+10)
        {
            plane.trailWidth=5;
            plane.teleport(y+10, 300);
            plane.square(10);
            plane.square(30);

        }

    }
    public void columnOfSmallSquares(){
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        for(int y=0; y<1000; y=y+10)
        {
            plane.trailWidth=5;
            plane.teleport(300, y+10);
            plane.square(10);

        }

        //put your loop here

    }
    public void gridOfSmallSquares(){
        plane.trailWidth=5;
        plane.setColor(173, 216, 230);
        for(int x=0; x<1000;x=x+10) {
            for( int y=0; y<1000;y=y+10){
System.out.println("x:"+",y:"+y);
                plane.teleport(x+10, y+10);
                plane.square(10);
                plane.setColor(173, 216, 230);
                plane.pausetime= 0;

            }
        }
    }
    public void fitness(){
        for(int s =0; s<5;s=s+1){ //sprints
            System.out.println("-sprint"+s);
            for(int p=0;p<10;p=p+1){
                System.out.println("-pushup"+p);

            }
        }
    }
}
