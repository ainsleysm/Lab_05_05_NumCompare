public class Main {
    public static void main(String[] args) {
       int num1 = 12;
       int num2 = 12;

       if(num1 == num2) {
           System.out.println(num1 + " is equal to " + num2);
       } else if(num1 > num2) {
           System.out.println(num2 + " is less than " + num1);
       } else if(num2 > num1) {
           System.out.println(num1 + " is less than " + num2);
       } else {
           System.out.println("Terminate and try again.");
       }
    }
}