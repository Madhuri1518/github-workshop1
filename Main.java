
public class Main {
    public static void main(String args[]){
       Sumation total = new Sumation();
       int [] intArray = new int [] {10, 20, 30, 40, 50};
       int totalSum = total.sum(intArray);
       System.out.println("Sum of all elemets of the array is : "+ totalSum);
    }
}
