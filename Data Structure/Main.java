public class Main {

    public static void main(String[] args) {

    
        List test = new List();
        test.insert(0);
        test.insert(120);
        test.insert(144);
        test.print();

        System.out.println("--------");
        test.remove(144);
        test.print();


        System.out.println("--------");
        test.remove(120);
        test.print();

        System.out.println("--------");
        test.remove(0);
        test.print();
       
    }

}