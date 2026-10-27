public class BcryptHash {

    // method user ke plain-text password ko BCrypt hash mein convert karta hai, taaki database mein original password store na karna pade.
//    public static String hashpassword(String plainPassword) {
//        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
//    }

    //(1).String plainPassword :
    //Ye method ka parameter hai, jisme original password aata hai.
    //Example: "Harsh@123"

    //(2).BCrypt.hashpw(plainPassword, BCrypt.gensalt())
    //- BCrypt.gensalt() → hashing ke liye random salt generate karta hai.
    //- BCrypt.hashpw() → password aur salt ka use karke hash banata hai.
    //- return → generated hash ko caller ko wapas deta hai.

//hashpw() → password ka hash banakar database mein save karo.
//checkpw() → entered password ko saved hash se verify karo


    //(1).hashpw(): Yeh plain password ko ek secure hashed password mein badal deta hai.
//(2).Yeh check karta hai ki user ka dala hua password aur database wala hashed password same hai ya nahi (true ya false deta hai).
//(3).gensalt(): Yeh ek random key (ya random data/string) banata hai, jise hashpw() ke sath use karke password ko aur zyada secure banaya jata hai.
//    static void main() {
//
//        String originalpassword = "Harshingle1645@";
//        System.out.println("--------Regestration Pages---------");
//        // create the key :
//        String randomkey =Bcrypt.gensalt();
//        System.out.println("Generated the random key "+randomkey);
//
//        // combined both :
//        String securepassword=Bcrypt.hashpw(randomkey,originalpassword);
//        System.out.println("final hashpassword" + securepassword);
//
//        //login page sahi hai kya nahi :
//        String Loginpass = "Harshingle1645@";
//
//
//        Boolean  ismatched = Bcrypt.checkpw(securepassword,Loginpass);
//        System.out.println("my login password" + Loginpass);
//        System.out.println("can these password is true/false" + ismatched);
//



    }

}