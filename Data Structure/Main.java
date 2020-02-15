public class Main {


    public static void main(String[] args) {
        List test = new List();

//     test.add("Abhijit");
//     test.add("Chetna");
//     test.add("Lakshmi");
//     test.add("Surya");

        // test.singlyAdd("Abhijit");
        // test.singlyAdd("Chetna");
        // test.singlyAdd("Nanamma");
        // test.singlyAdd("Thatha");
        // test.singlyAdd("Lakshmi");
        // test.singlyAdd("Surya");


        // test.print();

        test.add("Thatha");
        test.add("Surya");
        test.add("Abhi");
        
        test.printcircly();
        System.out.println("---------");
        test.remove("Abhi");
        
        test.printcircly();


    }
}