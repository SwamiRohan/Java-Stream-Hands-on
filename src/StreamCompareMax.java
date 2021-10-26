import java.util.ArrayList;
import java.util.List;

public class StreamCompareMax {
    private static int fetchMax(List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .get();
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(3);
        list.add(444);
        System.out.println("Maximum among all is :" + fetchMax(list));
    }
}
