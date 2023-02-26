package udemy.Recursion;

public class DecimalBinary {
    public static void main(String[] args) {
        int item = convertDecimaltoBinary(17);
        System.out.println(item);
    }

    static int convertDecimaltoBinary(int num){
        if(num == 0){
            return 0;
        }else{
            return num%2 + 10 * convertDecimaltoBinary(num/2);
        }

    }

}
