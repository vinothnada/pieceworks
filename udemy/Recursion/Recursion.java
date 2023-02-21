package udemy.Recursion;

public class Recursion {

    public static void main(String[] args) {
        recursiveFunction(5);
    }

    private static void recursiveFunction(int n){
        if(n<1){
            System.out.println("N is less than 1");
        }else{
            recursiveFunction(n-1);
            System.out.println("n :" + n);
        }
    }
}
