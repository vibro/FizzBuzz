public class FizzBuzz{
  
  //Call fizzBuzz on 1 - 100
  public static void runFizzBuzz(){
    for (int i = 1; i <= 100; i++){
      fizzBuzz(i);
    }
  }
    
  public static void fizzBuzz(int n){
    //test if divisible by 3
    boolean test3 = n % 3 == 0;
    //test if divisible by 5
    boolean test5 = n % 5 == 0;
     
    
    if (test3 == true) {
      if (test5 == true) {
        //divisible by both 3 and 5
        System.out.println("FizzBuzz");
      } else {
        //only divisible by 3
        System.out.println("Fizz");
      }
    }
    if (test5 == true) {
      //only divisible by 5
      System.out.println("Buzz");
    } else {
      //divisibly by neither
      System.out.println(n);
    }
  }
  
  public static void main(String[] args){
    runFizzBuzz();
    
  }
}