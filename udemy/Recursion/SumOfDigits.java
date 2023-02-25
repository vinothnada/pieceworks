package udemy.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(findSumDigits2(-120));
    }

    static int findSumDigits(int num){
        int sum = 0;
        int val = num/10;
        int rem = num%10;
        if(val > 10){
            int val2 = findSumDigits(val);
            sum += val2;
        }else{
            sum += val;
        }
        sum += rem;
        return sum;
    }

    static int findSumDigits2(int num){
        return num%10 + findSumDigits(num/10);
    }
}
