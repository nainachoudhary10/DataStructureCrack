public class SumOfNaturalNumbers {
    public static int findSumOfNaturalNumbers(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main (String[] args) {
        System.out.println (findSumOfNaturalNumbers (3));
        System.out.println (findSumOfNaturalNumbers (5));
        System.out.println (findSumOfNaturalNumbers (10));
        System.out.println (findSumOfNaturalNumbers (2));
        System.out.println (findSumOfNaturalNumbers (30));
        System.out.println (findSumOfNaturalNumbers (6));
    }
}
