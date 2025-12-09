import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int times = Integer.parseInt(reader.readLine());
        System.out.println(StringRepeater.makeRepeatedPrefix(text, times));
        reader.close();
    }
}

class StringRepeater {
    public static String makeRepeatedPrefix(String source, int count) {
        if (source == null || source.isEmpty() || count <= 0) {
            return "";
        }

        // choose up to first three characters
        int end = Math.min(3, source.length());
        String prefix = source.substring(0, end);

        // build result efficiently
        StringBuilder sb = new StringBuilder(prefix.length() * count);
        for (int i = 0; i < count; i++) {
            sb.append(prefix);
        }
        return sb.toString();
    }
}