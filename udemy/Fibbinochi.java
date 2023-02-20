package udemy;

public class Fibbinochi {
    public static void main(String[] args) {
        System.out.println(findFibinochi(5));
    }

    static int findFibinochi(int n){
        if(n <0){
            throw new IllegalArgumentException("Input should be greater than 0");
        } else if (n == 0 || n == 1) {
            return n;
        }else{
            return findFibinochi(n-1) + findFibinochi(n-2);
        }
    }
}
