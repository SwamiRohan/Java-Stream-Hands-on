import java.util.ArrayList;
import java.util.List;

public class StreamSumSqOdd {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
            list.add(20);
            list.add(1);
            list.add(5);
            list.add(7);
            //49+25+1 = 75
        System.out.println("Sum of square of odd number in list is: "+ sumSqOdd(list));
    }

    private static int sumSqOdd(List<Integer> list) {
        return list.stream()
                .filter(n-> n % 2 == 1)
                .map(x-> x * x)
                .mapToInt((x)->x).sum();
    }
}
