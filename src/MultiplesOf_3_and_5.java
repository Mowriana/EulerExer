import java.util.stream.IntStream;

public class MultiplesOf_3_and_5 {
    public static void main(String[] args) {
        Integer sum = IntStream.range(1, 1000) // create range
                .filter(i -> i % 3 == 0 || i % 5 == 0) // filter out
                .sum(); // output: 233168
        System.out.println(sum);
    }
}
