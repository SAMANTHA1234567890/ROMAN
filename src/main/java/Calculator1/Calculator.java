package Calculator1;

public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public String DIV(int aa, int bb) {
            if (bb != 0) {
                int ddii= aa/bb ;
                String di=String.valueOf(ddii);
                return di;
            }
            else {
      String  ans="opsi we can not help u ";
      return  ans ;
            }


        }
    }



