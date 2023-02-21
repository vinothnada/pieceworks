package udemy.Recursion;

public class GCDquiz {
    public static void main(String[] args) {
        System.out.println(findGcdNumber(10,0));
    }

    static int findGcdNumber(int num1,int num2){
        if(num1 <0){
            num1 = num1* -1;
        }
        if(num2 <0){
            num2 = num2* -1;
        }
        if(num2 != 0){
            return findGcdNumber(num2, num1%num2);
        }else{
            return num1;
        }

    }
}
