package Lab2.prog2;

public class One {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Two t1 = new Two("one", tree);
        Two t2 = new Two("two", tree);


        try {
            t1.t.join();
            t2.t.join();

        } catch (InterruptedException e) {
        }

    }

}
