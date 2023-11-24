import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.math.BigInteger;

public class CSVWriter {
    private static final String FILENAME = "fibonacci.csv";
    private static final int N = 100;

    public static void main(String[] args) {
        BigInteger[] fibonacci = new BigInteger[N];
        fibonacci[0] = BigInteger.valueOf(0);
        fibonacci[1] = BigInteger.valueOf(1);

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        try (
                Writer writer = new FileWriter(FILENAME);
                BufferedWriter bufferedWriter = new BufferedWriter(writer)
            ) {
            for (BigInteger number : fibonacci) {
                bufferedWriter.write(number + ", ");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
