/*
 * Write a program in Java to create a base class 'Square' having instance variable 'side: double'. Initiate variable using constructor, a method 'getVolume(): double' that calculates volume and print it. Create a derived class 'Cylinder' having instance variable 'height: double'. Initiate variables of both classes through constructor, override method 'getVolume(): double' to calculate volume of cylinder taking 'side' variable of base class as 'radius' and print it.
 * 
 */

 import java.util.Scanner;

class Squre{

    double side;

   public Squre(){
        this.side = side;
    }

    double getVolume(double side){

        return (double) side*side*side;
    }
}


class Cylinder extends Squre{

    double height;

    public Cylinder(){
        this.height = height;
        this.side = side;

    }
  



    double getVolume(double side, double height){

        double res = ((3.14)*side*side)*height; 
        return (double) res;
    }
}



public class volumeCheck {

    public static void main(String[] RitwikaJali){
        
        Scanner jaliScanner =new Scanner(System.in);

        System.out.println("enter the Side");


        double sqr_side = jaliScanner.nextDouble();

        System.out.println("enter the Height");

        double newHeight = jaliScanner.nextDouble();

        Squre newSqr = new Squre();

        Cylinder newCil = new Cylinder();

        double  sqr_vol =  newSqr.getVolume(sqr_side);

        double cilVol =   newCil.getVolume(sqr_side, newHeight);

        System.out.println("Volume of the Squre is "+ sqr_vol);

        System.out.println("Volume of the Cylinder "+cilVol );
        
        jaliScanner.close();

    }
    
}
