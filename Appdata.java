package JC_HW5;


import java.util.Arrays;

public class Appdata {
    private String[] header;
    private int[][] data;

    public Appdata(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String toString() {
        return "File " +
                "Header:   " + Arrays.toString(header) +
                ""  +
                " File Data:  " + dataToString();
    }
    private String dataToString() {
        StringBuilder builder = new StringBuilder("[");
        for (int[] values: data) {
            builder.append(dataValuesToString(values)).append(",");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }

    private String dataValuesToString(int[] values) {
        StringBuilder builder = new StringBuilder("[");
        for (int intValue: values) {
            builder.append(intValue).append(",");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }
}

