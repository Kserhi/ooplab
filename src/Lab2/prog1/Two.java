package Lab2.prog1;

public class Two implements Runnable {
    Thread t;
    Two(String name ){
        t=new Thread(this,name);
        t.start();
    }
   public void run(){
        int i=0;
        while (i<10){
            i++;
            try {
                System.out.println(t.getName());
                Thread.sleep(100);

            }catch (InterruptedException e){

            }
        }
    }
}
