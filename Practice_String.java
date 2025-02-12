public class Practice_String {
    public static void main(String args[]) {

        // SubSTring
        String str = "Priyanshu";
        System.out.println(str.substring(0, 5));

        // Largest String
        String str2[] = { "Apple", "Banana", "Mango" };
        String max = str2[0];
        for (int i = 1; i < str2.length; i++) {
            if (max.compareTo(str2[i]) < 0) {
                max = str2[i];
            }
        }
        System.out.println(max);

         

    