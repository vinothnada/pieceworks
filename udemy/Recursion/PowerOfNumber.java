package udemy.Recursion;

public class PowerOfNumber {

    public static void main(String[] args) {
        System.out.println(findPowerOfRecursion(1,3));
    }

    static int findPowerOfRecursion(int number, int power){
        if(power == 0){
            return 1;
        }else{
            return number * findPowerOfRecursion(number , power-1);
        }
    }
}
