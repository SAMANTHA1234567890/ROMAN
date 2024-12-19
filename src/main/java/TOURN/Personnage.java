package TOURN;

public class Personnage {


    public static String tourner(int i) {
        String G = "NORD";
        if((i - 2 ) % 4 == 0 )
            G="SUD";
        if((i - 1 ) % 4 == 0 )
            G="EST";
        if((i - 3 ) % 4 == 0 )
            G="OUEST";

 return G;
    }



}
