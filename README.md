package sezorshifr;

import java.util.Scanner;

public class SezorShifr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Gap: ");
    String soz = in.nextLine();
        
        System.out.print("k = ");
    int k = in.nextInt();
    String probel =" ";
        char[] p = probel.toCharArray();
    String shifrlanganSoz = "";
    char[] chars = soz.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           
            if(chars[i]==p[0]){
             chars[i]='*';
             break;
           }
            
            int HaripCod = (int)chars[i] + k;
           
            if(chars[i] < 91){
               if(HaripCod > 90){
                   HaripCod = 65 - 91 + HaripCod;
               }
           }
           
          
           if(HaripCod > 122){
               HaripCod = 97 + HaripCod  - 123;
           }
           char h = (char)HaripCod;
           chars[i] = h;
           shifrlanganSoz += chars[i]; 
        } 
        System.out.println("shifrlangan soz: " + shifrlanganSoz);
        
        
    }
    
}
