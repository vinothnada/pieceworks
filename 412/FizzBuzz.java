import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String>  output = fizzBuzz(1);
        System.out.println(output.toString());
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=0; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                result.add("FizzBuzz");
            }else if(i%3 == 0){
                result.add("Fizz");
            }else if(i%5 == 0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
