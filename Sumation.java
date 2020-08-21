public class Sumation {
    public int sum(int a, int b){
	return a+b;
    }
    public int sum(int array[]){
	int arrLen = array.length;
	int sum = 0;
	for(int i=0;i<arrLen;i++)
	{
	  sum = sum(sum,array[i]);
	}
	return sum;
    }
}
