package Lab1;

public class Test {
    public void one(){
        try {
//            throw new ArithmeticException();
            throw  new ArrayStoreException();
        }catch (ArithmeticException e){
            System.out.println("негарно так робити");
            e.printStackTrace();
        }catch (ArrayStoreException e){
            System.out.println("нечимнота ");
            e.printStackTrace();
        }

    }
    public void two(){
        try {
            try {
                throw new NullPointerException();
            }catch (NegativeArraySizeException e){
                e.printStackTrace();
            }
        }catch (NullPointerException e){
            System.out.println("цей кетч зловив помилку яку закладено в вкладеному блоці трай кетч ");
            e.printStackTrace();
        }

    }
    public void three(){
            try {
                throw new NullPointerException();
            }catch (NullPointerException e){
                System.out.println("зловивли ексепшин");
            }finally {
                System.out.println("а тут виконали обовязкову логіку блоку файнал ");
            }
        System.out.println("а тут продовжили виконання тіла методу three");
    }
}
