public class IOException {
     //IOException = File ko read ya write karte time problem aana.
     //Two Method :
     // (1).Try-Catch Method :
     // try-catch ka kaam hai: program mein error aane par usse handle karna, taaki program achanak band na ho.
     // try → Risky code chalata hai.
     //catch → Exception ko pakadkar programmer ka likha hua code execute karta hai.
     //Solution → Programmer ko catch ke andar likhna padta hai.

     public static void main(String[] args) {
          // if you run this loop java compiler show the ArithmeticException :
//            int n = 5;
//            for(int i=0;i<n/0;i++){
//                System.out.println("crash");
//            }
          // iss ko kaise show kiya ke exception hai :
//         try{
//             int a = 10/0;
//
//         } catch (Exception e) {
//             System.out.println("Error aa gaya hai");
//         }
//         System.out.println("to be continued");
//        }

          // (2).throws :
          // throws IOException → Method bata raha hai ki ismein exception aa sakti hai.
          // try-catch → main() mein us exception ko handle kiya gaya hai.
          // Yaad rakho: throws exception ko solve nahi karta, sirf aage pass karne ki permission/declaration deta hai.
          // try-catch → Exception ko pakadkar handle karte ho.
          //throws → Exception ki responsibility aage pass karte ho.

          //throws ka matlab yeh nahi ki error already aa chuki hai. Iska matlab hai ki exception aa sakti hai.
          //Is method mein file read/open karte waqt exception aa sakti hai.
          // Method khud us exception ko handle nahi kar raha.
          //Exception ko handle karne ki responsibility caller ko ja sakti hai.

//         class Main {
          // yah jimedari leta hai ke iss fiels me error aa sakta hai : ( throws IOException )
//             static void readFile() throws IOException {
//                 FileReader f = new FileReader("abc.txt");
//             }
//
//             public static void main(String[] args) {
//                 try {
//                     readFile();
//                 } catch (IOException e) {
//                     System.out.println("File nahi mili!");
//                 }
//             }
//         }


//Top 7 interview questions :
//1. What is IOException?
//IOException ek exception hai jo input/output operations, jaise file read ya write karte waqt aa sakti hai.

//2. What is try-catch?
//- try — risky code likhte hain.
//- catch — exception aane par usse handle karne ke liye code likhte hain.

//3. What is the difference between throw and throws?
//- throw — manually exception throw karta hai.
//- throws — method declaration mein batata hai ki kaunsi exception aa sakti hai.

//4. What is a checked exception?
//Checked exception ko compiler check karta hai. Use handle karna ya declare karna padta hai.
//Example: IOException.

//5. What is the difference between IOException and FileNotFoundException?
//FileNotFoundException, IOException ki subclass hai. File open karte waqt file na milne ya access na ho paane par yeh aa sakti hai.

//6. Can we handle IOException without try-catch?
//Haan. Method mein throws IOException declare kar sakte hain aur exception ko caller tak propagate kar sakte hain. Lekin aakhir mein use handle karna zaroori ho sakta hai.

//7. What happens if an exception is not handled?
//Agar exception propagate hote-hote kisi bhi jagah handle nahi hoti, toh current thread ka execution terminate ho sakta hai.

     }
}
