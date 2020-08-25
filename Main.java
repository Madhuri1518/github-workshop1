
public class Main {
    public static void main(String args[]){
	Sumation SumOfTwoNumbers = new Sumation();
	int result = SumOfTwoNumbers.sum(12,13);
	System.out.println("Sum of 12 and 13 is : " + result);
	
	Sumation sumOfArray = new Sumation();
        int [] intArray = new int [] {10, 20, 30, 40, 50};
        int totalSum = sumOfArray.sum(intArray);
        System.out.println("Sum of all elemets of the array is : "+ totalSum);
    }
}
