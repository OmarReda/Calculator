
package javaapplication2;

//Calculations Class



public class Calculations {

     public double summation (double x ,double y) {
            double z = x+y;
            return z;
            
    }
     public double subtraction (double x ,double y) {
            double z = x-y;
            return z;
    }
     public double multiplication (double x ,double y) {
            double z = x*y;
            return z;
    }
     public double division (double x ,double y) {
            double z = x/y;
            return z;
    }
     //display result method
     public String Output (double x ,double y,double z,String f){
     
         String s;
         String res;
         String x1 = String.format("%.3f", x);
         String y1 = String.format("%.3f", y);
         res = String.format("%.3f",z);
         s = " "+x1+f+""+y1+"="+""+res;
         return s;
     }
}