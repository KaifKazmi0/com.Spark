package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Parentheses {



    public static void main(String[] args) {
//        String p = "(()())(())";
//        System.out.println(p);



        StringBuilder sb = new StringBuilder();
        String num = "1234";
        char[] ch = num.toCharArray();
        int n = Integer.parseInt(num);
        int eg = n;
        int maxOdd = 0;
        while(eg>0){
            if(eg%2!=0){
                if (maxOdd<eg) maxOdd = eg;
            }
            eg/=10;
        }
        eg = n;
        int m = 0;
        while(eg!=m){
            m = (m*10)+eg%10;
            if(m%2!=0){
                if (maxOdd<m) maxOdd = m;
            }
            eg/=10;
        }

        System.out.println(maxOdd);

    }
}
