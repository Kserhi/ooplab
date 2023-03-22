package Lab2.prog2;

public class Tree {

    synchronized void metod(){
        try {
            System.out.println("Працює метод");
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        System.out.println("Вже всьо ");
    }

}
