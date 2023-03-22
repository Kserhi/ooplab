package Lab2.prog2;

public class Two implements Runnable {
    Tree tree;
    Thread t;
    Two(String name, Tree tree){
        this.tree = tree;
        t=new Thread(this,name);
        t.start();
    }
   public void run() {
       System.out.println("Thread "+t.getName());
        tree.metod();
//        synchronized (tree){
//            System.out.println("Thread "+t.getName());
//            tree.metod();
//        }
    }
}
