import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCalculator {
    public static void main(String[] args) {

        String text = "";

        if(args.length == 1){
            text = args[0];
        } else {
            System.err.println("Please enter in text between two double quotes after calling the program. i.e. [JAVA -jar WordFrequencyCalculator.jar \"this is sample text\"]");
        }

        Arrays.asList(text.split(" ")).stream()
            .filter(v -> v.matches(".*[a-zA-Z].*"))  //Remove only numbers, spaces, or characters
            .map(String::toLowerCase) //Lower case all words for match equality
            .map(v -> v.replaceAll("[^a-zA-Z\\d\\s'\\-:]","")) //Replace all characters in words except for apostrophe and hyphen
            .collect(Collectors.groupingBy(  //Group by word
            Function.identity(),  //word
            Collectors.counting())).entrySet().stream()  //Count
            .sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.<String,Long>comparingByKey()))  //Then sort the map, value then key
            .forEach(v1 -> System.out.println(String.format("%d %s", v1.getValue(), v1.getKey()))); //Print results

    }
}
