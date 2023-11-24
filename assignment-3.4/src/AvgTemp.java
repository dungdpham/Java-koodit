import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class AvgTemp {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        String line;
        String[] columnNames = new String[0];
        boolean header = true;
        ArrayList<Double> temps = new ArrayList<>();
        double sumTemp = 0;
        double avgTemp;

        try (
                InputStream inputStream = myUrl.openStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader)
        ) {
            do {
                line = reader.readLine();
                if (line != null) {
                    if (header) {
                        columnNames = line.split(";");
                        header = false;
                    } else {
                        String[] columns = line.split(";");
                        if (columns[0].contains("01.01.2023")) {
                            System.out.print(columnNames[0] + ": " + columns[0] + " | " + columnNames[1] + ": " + columns[1]);
                            System.out.println();
                            temps.add(Double.parseDouble(columns[1].replace(",", ".")));
                        }
                    }
                }
            } while (line != null);

            for (double temp : temps) {
                sumTemp += temp;
            }

            avgTemp = sumTemp / temps.size();
            System.out.println("Average temperature: " + avgTemp);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
