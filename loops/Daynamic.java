package loops;
//get -
import java.util.ArrayList;

public class Daynamic {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add("megha");
        ar.add(true);
        System.out.println(ar.get(3));
        //System.out.println(ar.size());
      //  ar.remove(2);

        ArrayList<String> names = new ArrayList<String>();
    names.add("Megha");
    names.add("Pragna");
    for(int i=0; i<names.size(); i++) {
        System.out.println(names.get(i));
    }

    }
}
