import com.builderbob.Floor;
import com.builderbob.House;
import com.builderbob.Paint;
import com.builderbob.Room;

/**
 * Created by localadmin on 7/27/16.
 */
public class Main {
      public static void main(String[] args){
       Room r1 = new Room("Kitchen", Floor.Carpet, (float) 3.25, Paint.Matte, (float) 2.5, 10, 15, 8);
       Room r2 = new Room("Dining", Floor.Carpet, (float) 1.25, Paint.Matte, (float) 1.25, 5, 25, 8);

//               "Floor f, float floorPrice, Paint p, float paintPrice, int length, int width, int height  );
    float fcost1 = r1.floorcost();
    float fcost2 = r2.floorcost();
    float pcost = r1.paintcost();

      House h1 = new House("myHome");
          h1.addRoom(r1);
          h1.addRoom(r2);

          float hfcost = 0f;
          hfcost = h1.floorCost();


      }
}
