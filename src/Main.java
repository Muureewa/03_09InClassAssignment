import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args)
    {
        ArrayList<Integer> limit = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7));
        filterRange(limit, 5, 7);
        System.out.println(limit);


        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> mirroredList = mirror(list);
        System.out.println(mirroredList);


    }

    public static void filterRange(ArrayList<Integer> list, int min, int max) {
        list.removeIf(n -> n >= min && n <= max);
    }


    public static ArrayList<String> mirror(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>(list);
        Collections.reverse(list);
        result.addAll(list);
        return result;
    }

}