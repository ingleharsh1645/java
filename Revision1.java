import java.util.*;
public class Revision1 {
    // static and non-static :

    // why java used the main() declare the static ==> used for the minimized the new memory creation and new object creation and constructor violaion
    // static : used the shared data or we are declare the without creating object
    // non-static : private data for that class and we are declaring the creating the object

    public static  class teacher {
        String name;
        static int salary;

        static void result_display(int marks) {
            System.out.println("your marks are the :" + marks);
        }
    }
    public static void main() {
        int marks = 36;
        // instances :
        teacher t1 = new teacher();
        teacher t2 = new teacher();
        t1.salary = 20_000;
        t1.name = "harsh";
        t2.name = "Ruhi";
        t1.result_display(100);
        t2.result_display(2000);
        teacher.result_display(100);

    }

}

// inner class concept :
// agar static nahi lagata toh inner class me :
 static  class  Bank_Money {
    private int data;
    static String Bank_Name ;

    void consumers(int data){
        System.out.println("your balance is " + this.data);
    }

}

public static void main(String[] args) {
    // they are wrong because of the not add the static keyword in the inner class why :
    //Kyunki normal inner class ka object banane ke liye pehle outer class ka object chahiye.
    //Bank_Money B1 = new Bank_Money();

    Bank_Money B1 = new Bank_Money();
    B1.data=1000;
    B1.consumers(100);

}



