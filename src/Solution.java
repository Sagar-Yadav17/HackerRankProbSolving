import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int count1 = 0;
        int count2 = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                count1++;
            } else if (a.get(i) > b.get(i)) {
                count2++;
            }

        }
        result.add(count2);
        result.add(count1);
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {


        List<Integer> result = Result.compareTriplets(List.of(12, 14, 18), List.of(9, 22, 7));

        System.out.println(result);
    }
}
