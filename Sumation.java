public class Sumation {
    public int sum(int a, int b){
       return (a+b);
    }
    public int sum(int array[]){
       int totalSum = 0;
       int length = array.lenght;
       for(int i=0; i<length; i++){
          totalSum = sum(array[i], totalSum);
       }
       return totalSum;
    }
}
