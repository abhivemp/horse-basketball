public class Main {

    public static void main(String[] args) {

    
        List test = new List();
        test.insert(0, "Abhijit");
        test.insert(120, "Surya");
        test.insert(144, "Venkat");
        test.print();

        System.out.println("--------");
        test.remove("Abhijit");
        test.print();


        System.out.println("--------");
        test.remove("Surya");
        test.print();

        System.out.println("--------");
        test.remove("Venkat");
        test.print();
       
        
    }

}