class Thread_1 extends Thread{

    public void run(){

        System.out.println("Ritwika " + "weds");

    }
}

class Thread_2 extends Thread{

    public void run(){

        System.out.println("Kaustav ");

    }
}




public class ThreadPrac {

    public static void main(String[] hellGay){

        Thread_1 newThr = new Thread_1();
        
        Thread_2 newThr2 = new Thread_2();
        
        newThr.start();
        
        newThr2.start();
        
    }
    
}
