package Lab2.prog3;

public class Two implements Runnable {
    Tree tree;
    Thread t;
    Two(String name, Tree tree){
        this.tree = tree;
        t=new Thread(this,name);
        t.start();
    }
   public void run() {
       while (true){
           tree.metod2();
       }
    }
}
