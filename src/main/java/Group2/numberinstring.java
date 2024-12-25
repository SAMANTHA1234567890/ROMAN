package Group2;

public class numberinstring {

    public int trans(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1) {
            return Integer.parseInt(s);
        }
if (s.length() > 1) {
    int g = 0;
    for (char ch : s.toCharArray()) {
        if (Character.isDigit(ch)) {
            g += Integer.parseInt(String.valueOf(ch)) ;
        }
        else continue;
 }
    return  g ;
}
return -1;
    }
}


// or u can also use

//if (s.length() > 1) {
// int calc = 0 ;
// int i;
// for( i =0;i<s.length() ; i++){
// calc = calc + s.charAt(i);
// i++ ;
 //     }
  //      return calc ;
// }


