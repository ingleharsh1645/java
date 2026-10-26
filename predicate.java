public class predicate {
//  interview quation : java me function first class hote hai ke (means,function passed paremeter as argument and they used also)
//        // Predicate(functinal interferance ) :java me method ko function de sakate hai use function ko hum bolte hai functinal interferance
//        // java me function as a first class citesion
//        // stream<T> filter(predicate<? super T> predicates);
//        // Predicate ek functional interface hai jo kisi condition ko check karta hai aur true ya false return karta hai.


 //   predicate actual code :
//        import java.util.function.Predicate;
//
//        public class Main {
//            public static void main(String[] args) {
//
//                Predicate<Integer> p = n -> n > 5;
//
//                System.out.println(p.test(3));
//
//    System.out.println(p.test(10));
//            }
//        }

//Java mein Predicate ek Functional Interface hota hai, jiska use hum kisi condition ko check karne ke liye karte hain. Ye Java ke java.util.function package mein hota hai.

    // why predicate is functional interferance :
    //Kyunki iske andar exactly ek abstract method hota hai, jiska naam test() hai.
    //@FunctionalInterface
    //interface Predicate<T> {
    //    boolean test(T t);
    //}

    // interview quation of the predicate :
    // (1).What is Predicate in Java? ==>
    //Predicate<T> ek functional interface hai jo condition check karke boolean return karta hai.

    // (2).Predicate ka abstract method kya hai?
    //test(T t)

    // (3).Predicate functional interface kyun hai?
    //Kyunki isme sirf ek abstract method hota hai.

    // (4).Predicate aur Function mein difference?
    //Predicate boolean return karta hai; Function value return karta hai.

    //(5).Predicate aur Consumer mein difference?
    //Predicate condition check karta hai; Consumer action perform karta hai aur void return karta hai.

    // (6).Stream mein Predicate ka use?
    //filter() mein elements ko condition ke according select karne ke liye.

    // (7).and() kya karta hai?
    //Dono conditions true honi chahiye.

    //(8).or() kya karta hai?
    //Kam se kam ek condition true honi chahiye.

    //(9).negate() kya karta hai?
    //Condition ka result ulta kar deta hai.

    //(10).Predicate.isEqual() kya karta hai?
    //Kisi object ke saath equality check karne wala Predicate banata hai.

    //(11).Kya Predicate custom class ke saath use hota hai?
    //Haan, jaise Predicate<Employee>.

    //(12).Multiple conditions kaise combine karte hain?
    //and(), or() aur negate() se.

    //(13).Predicate aur BiPredicate mein difference?
    //Predicate ek input leta hai; BiPredicate do inputs leta hai. Dono boolean return karte hain.

    //(14).Predicate mein null handle kaise karein?
    //n -> n != null && n > 5

    //(15).Predicate ka real-world use kya hai?
    //Filtering, validation aur eligibility checks mein.

//    interface	Method	Return type
//    Predicate<T>	test()	boolean
//    Function<T,R>	apply()	R
//    Consumer<T>	accept()	void
//    Supplier<T>	get()	T
//    BiPredicate<T,U>	test()	boolean


    // function ke imp quation :
//    Q1. What is Function in Java?
//    Input leta hai aur usko process karke output return karta hai.

//    Q2. Function ka abstract method kya hai?
//    apply()

//    Q3. Function<T, R> mein T aur R kya hain?
//    T input type hai aur R return type hai.

//    Q4. Function aur Predicate mein difference?
//    Function value return karta hai; Predicate true ya false return karta hai.

//    Q5. Function aur Consumer mein difference?
//    Function result return karta hai; Consumer void return karta hai.

//    Q6. andThen() kya karta hai?
//    Pehle current Function execute hota hai, phir uska result next Function ko milta hai.

//    Q7. compose() kya karta hai?
//    Pehle doosra Function execute hota hai, phir uska result current Function ko milta hai.

//    Q8. Function.identity() kya karta hai?
//    Input ko bina badle return karne wala Function deta hai.

//    Q9. Stream API mein Function kahan use hota hai?
//    map() mein, elements ko transform karne ke liye.

//    Q10. Kya Function lambda expression use karta hai?
//    Haan, example: Function<Integer, Integer> f = n -> n * 2;

    //Consumer = Tum mujhe data do, main us par action karunga.
    //Supplier = Tum mujhe value maango, main tumhe value dunga.

//    Stream.generate(() -> "Hello")  // Supplier
//      .limit(3)
//      .forEach(System.out::println); // Consumer



}
