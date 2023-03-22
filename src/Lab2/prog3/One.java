package Lab2.prog3;

public class One {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Two t1 = new Two("one", tree);
        Fo fo=new Fo("fo",tree);

        System.out.println("головний");

        try {
            t1.t.join();
            fo.t.join();
        } catch (InterruptedException e) {
        }

    }

}
