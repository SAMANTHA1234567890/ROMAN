package ROMAN;

import java.util.ArrayList;
import java.util.List;

public class ArabianRoman {

    public static List<String> transfer(int n) {
        List <String>  a= new ArrayList<>();
        while (n >= 10) {
            a.add("X");
            n -= 10;
        }
if(n == 1) a.add("I");
if(n==2) a.add("II");
if(n==3) a.add("III");
if(n == 4){ a.add("I");  a.add("V");  }
if(n == 9) { a.add("I"); a.add("X"); }
if(5 <= n && n <=8 ){
          a.add("V");
          int c=1;
          int g = n - 5;
          while(c<=g){
              a.add("I");
              c++;
          }
      }

      return(a);
    }
}
