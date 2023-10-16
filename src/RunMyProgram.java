

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new B3_HalfTheRed()   );
        run.planeIcon = "plane.png";
        run.pictureFileName="fourred.png";
        run.pictureFileName="IMG_0705.JPG";
        run.HEIGHT=800;
        run.WIDTH=1000;
        run.Refresh();

        //new Thread(run).start();
    }
}
