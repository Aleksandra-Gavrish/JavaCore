package JC_HW5;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
            File file = new File("./newfile.csv");
            if (file.exists()) {
                file.createNewFile();
            }
            List<String> stringList = new ArrayList<>();
            stringList.add("Value 1; Value 2; Value 3;");
            stringList.add("100; 200; 123;");
            stringList.add("300; 400; 500;");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String w: stringList) {
                    writer.write(w);
                    writer.newLine();
                }

                try (BufferedReader reader = new BufferedReader(new FileReader("newfile.csv"))) {
                    String r;
                    while ((r = reader.readLine()) != null) {
                        System.out.println(r);
                    }
                }
                System.out.println(getAppData(stringList));
            }
        }
        public static Appdata getAppData (List<String> stringList) {
            String headersString = stringList.get(0);
            String[] headers = headersString.split(";");
            int[][] data = new int[headers.length][stringList.size() - 1];
            List<String[]> listOfArrays = new ArrayList<>(stringList.size() - 1);
            for (int i = 1; i < stringList.size(); i++) {
                String s = stringList.get(i).trim();
                String[] values = s.split(";");
                listOfArrays.add(values);
            }
            for (int i = 0; i < listOfArrays.size(); i++) {
                String[] values = listOfArrays.get(i);
                for (int j = 0; j < values.length; j++) {
                    data[j][i] = Integer.parseInt(values[j].trim());
                }
            }
            return new Appdata(headers, data);
        }
    }

