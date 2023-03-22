package Lab2.prog1;

public class One {
    public static void main(String[] args) {
        Two t1=new Two("one");
        Two t2=new Two("two");
        Two t3=new Two("tree");

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (InterruptedException e){
        }

        System.out.println(t1.t.isAlive());
    }

}
