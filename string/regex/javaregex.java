// github.com/dharun-08

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

/*
     [01]?\\d{1,2}   matches numbers 0-199.
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
*/
class MyRegex {
    String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = number + "." +  number + "." +  number + "." + number;
}
