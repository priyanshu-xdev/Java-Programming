// import java.util.*;

public class String_Compressor {
    public static void main(String[] args) {

        String str = "AAABBCCCD";
        StringBuilder str2 = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str2.append(str.charAt(i));
            str2.append(count);
        }
        System.out.println(str2.toString());
    }
}
