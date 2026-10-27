public class optional {

    //Optional Java 8 ka class hai jo value present ya absent hone ko represent karta hai. Isse null handling easy hoti hai.

    // Method	         Example	           Meaning
    // of()	        Optional.of("Harsh")	   Non-null value
    // ofNullable()	Optional.ofNullable(null)	Null allowed
    // empty()	     Optional.empty()	         No value
    // isPresent()	  name.isPresent()	       Value hai?
    // orElse()	     name.orElse("Guest")	    Default value
    // ifPresent()	 name.ifPresent(System.out::println)	Value ho toh print
    // orElseThrow()	  name.orElseThrow()	       Value nahi toh exception


    //op 12 Interview Questions
    //Q1. What is Optional in Java?
    //Optional Java 8 class hai jo value present ya absent hone ko represent karta hai.

    //Q2. Why do we use Optional?
    //null handling ko explicit aur safer banane ke liye.

    //Q3. What is the difference between of() and ofNullable()?
    //- of() → null allowed nahi hai.
    //- ofNullable() → null allowed hai; null hone par empty Optional milta hai.

    //Q4. What is Optional.empty()?
    //Ek empty Optional create karta hai.
    //Optional<String> s = Optional.empty();

    //Q5. What does isPresent() do?
    //Check karta hai ki value present hai ya nahi. Result true ya false hota hai.

    //Q6. What is orElse()?
    //Value absent hone par default value return karta hai.
    //Optional<String> s = Optional.empty();
    //System.out.println(s.orElse("Guest")); // Guest

    //Q7. Difference between orElse() and orElseGet()?
    //orElse() ka default expression eagerly evaluate hota hai; orElseGet() ka supplier sirf value absent hone par execute hota hai.

    //Q8. What is orElseThrow()?
    //Value absent hone par exception throw karta hai.
    //String s = Optional.<String>empty()
    //                   .orElseThrow();

    //Q9. What is ifPresent()?
    //Value present hone par action execute karta hai.
    //Optional.of("Harsh")
    //        .ifPresent(System.out::println);

    //Q10. What is map() in Optional?
    //Present value ko transform karta hai.
    //Optional<String> name = Optional.of("harsh");
    //Optional<String> upper = name.map(String::toUpperCase);
    //// HARSH

    //Q11. Can Optional contain null?
    //Optional.ofNullable(null) empty Optional deta hai. Optional.of(null) NullPointerException throw karta hai.

    //Q12. Should we use Optional everywhere?
    //Nahi. Iska common use method ke return type mein missing result represent karna hai. Fields aur method parameters mein ise har jagah use karna recommended nahi hai.


    // optional method :
    //import java.util.Optional;

    //1. Optional.of() — value present hai

    //Optional<String> name = Optional.of("Harsh");
    //System.out.println(name.get());
    //// Output: Harsh
    //null pass karoge toh NullPointerException aayega.

    //2. Optional.ofNullable() — value null ho sakti hai
    //Optional<String> name = Optional.ofNullable(null);
    //System.out.println(name.isPresent());
    //// Output: false

    //3. Optional.empty() — empty Optional
    //Optional<String> name = Optional.empty();
    //System.out.println(name.isEmpty());
    //// Output: true
    //isEmpty() Java 11+ mein available hai.

    //4. isPresent() — value hai ya nahi
    //Optional<Integer> age = Optional.of(21);
    //System.out.println(age.isPresent());
    //// Output: true

    //5. orElse() — default value
    //Optional<String> name = Optional.empty();
    //System.out.println(name.orElse("Guest"));
    //// Output: Guest

    //6. orElseGet() — supplier se default value
    //Optional<String> name = Optional.empty();
    //String result = name.orElseGet(() -> "Guest");
    //System.out.println(result);
    //// Output: Guest
    //Supplier tabhi execute hota hai jab Optional empty ho.

    //7. orElseThrow() — value na ho toh exception
    //Optional<String> name = Optional.empty();
    //String result = name.orElseThrow(
    //    () -> new RuntimeException("Name not found")
    //);
    //Empty hone par RuntimeException throw hoga.

    //8. ifPresent() — value ho toh action
    //Optional<String> name = Optional.of("Harsh");
    //name.ifPresent(System.out::println);
    //// Output: Harsh

    //9. map() — value transform karna
    //Optional<String> name = Optional.of("harsh");
    //Optional<String> result = name.map(String::toUpperCase);
    //System.out.println(result.get());
    //// Output: HARSH

    //10. filter() — condition check karna
    //Optional<Integer> age = Optional.of(21);
    //Optional<Integer> result = age.filter(a -> a >= 18);
    //System.out.println(result.get());
    //// Output: 21
    //Condition false hone par empty Optional milega.



}
