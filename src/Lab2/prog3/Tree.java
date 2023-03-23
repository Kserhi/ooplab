package Lab2.prog3;

public class Tree {
    boolean value=false;

    synchronized void metod1(){
        while (!value){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("бека");
            }

        }
        System.out.println("ПАЛЯНИЦЯ");
        value=false;
        notify();



    }
    synchronized void metod2(){
        while (value){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("бека");
            }


        }
        value=true;

        System.out.println("молодиця");
        notify();



    }

}
