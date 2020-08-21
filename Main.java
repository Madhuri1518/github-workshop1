
public class Main {
    public static void main(String args[]){
	Sumation sm = new Sumation();
	int [] array = new int [] { 1, 2, 3, 4, 5, 6};
	int sum = sm.sum(array);
	System.out.println("Sum of all elemets of the array is : "+sum);
    }
}
