public class java_intiallization_exception {

    //java vs c++ variable intialization :

    // (1). java Exception :
    // Java mein sirf local_var par error aayega. Baaki sabhi variables ko Java apne aap Default Values (0, false, null) de deta hai.

//    class JavaInitializationDemo {
//        // 1. Instance Variable (Heap Memory) - Exception!
//        int instanceVar;
//
//        // 2. Static Variable (Method Area) - Exception!
//        static String staticVar;
//
//        void display() {
//            // 3. Array Elements (Heap Memory) - Exception!
//            int[] myArr = new int[3];
//
//            // 4. Local Variable (Stack Memory) - NO EXCEPTION (Error)
//            int localVar;
//
//            // --- OUTPUTS ---
//            System.out.println(instanceVar); // Output: 0 (Apne aap 0 mila)
//            System.out.println(staticVar);   // Output: null (Object ko null mila)
//            System.out.println(myArr[0]);    // Output: 0 (Array elements ko 0 mila)
//
//            // System.out.println(localVar); //  COMPILE ERROR! Initialize karna hi padega.
//        }
//    }

    //(2).c ++ Exception :
// C++ mein normal local aur class variables mein garbage value aati hai. Lekin Global, Static, aur Empty Brackets {} waale variables exception hain, inme apne aap 0 milta hai.

//    #include <iostream>
//    using namespace std;
//
//    // 1. Global Variable - Exception!
//    int globalVar;
//
//    class CppDemo {
//        public:
//        int classVar; // Class Member Variable - NO EXCEPTION (Garbage)
//    };
//
//    void checkExceptions() {
//        // 2. Static Local Variable - Exception!
//        static int staticVar;
//
//        // 3. Value Initialization (Empty Brackets) - Exception!
//        int uniformVar{};
//
//        // 4. Normal Local Variable - NO EXCEPTION (Garbage)
//        int localVar;
//
//        // --- OUTPUTS ---
//        cout << "Global Var: " << globalVar << endl;     // Output: 0 (Apne aap)
//        cout << "Static Var: " << staticVar << endl;     // Output: 0 (Apne aap)
//        cout << "Uniform Var: " << uniformVar << endl;   // Output: 0 (Brackets ki wajah se)
//
//        cout << "Local Var: " << localVar << endl;       // ⚠️ Output: -858993460 (Garbage Value)
//
//        CppDemo obj;
//        cout << "Class Var: " << obj.classVar << endl;   // ⚠️ Output: 32767 (Garbage Value)
//    }
//
//    int main() {
//        checkExceptions();
//        return 0;
//    }


    // java : Variable agar class ke andar hai ya array hai  Exception (Auto 0/null). Variable agar function ke andar hai  Khatra (Compile Error).
    // C++ Rule: Variable agar function ke bahar (Global) hai ya static hai  Exception (Auto 0). Variable agar normal local ya class member hai  Khatra (Garbage Value).









}
