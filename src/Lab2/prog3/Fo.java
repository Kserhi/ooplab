package Lab2.prog3;

public class Fo implements Runnable{
    Thread t;
    Tree tree;
    Fo(String name,Tree tree){
        this.tree=tree;
        t=new Thread(this,name);
        t.start();
    }

    public void run(){
        while (true){
            tree.metod1();
        }
    }
}
