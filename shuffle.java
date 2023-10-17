import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffle {
    public static void main(String[] args) {
        // Create a list with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);

        // Shuffle the list
        Collections.shuffle(originalList);

        // Convert the shuffled list back to an array if needed
        Integer[] shuffledArray = originalList.toArray(new Integer[originalList.size()]);

        // Print the shuffled array or list
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
