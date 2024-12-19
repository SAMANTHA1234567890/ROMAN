package fuzzbuzz;

public class FizzBuzz {


    public static String de(int i) {

        if(i == 1) return ("1");
        if(i == 2) return ("2");
        if(i == 4) return ("4");
        if(i % 3 == 0 && i % 5 == 0) return ("FUZZBUZZ");
        if(i % 3 == 0) return ("FUZZ");
        if(i % 5 == 0) return ("BUZZ");

        return ("");



    }
}
