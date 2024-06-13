package Strings.ReverseString;

public class Java003 {
    public static void main(String[] args) {
        String str = "This is me";
        String reverse = "";

        String[] st = str.split(" ");
        for (int i = st.length - 1; i >= 0; i--) {
            if (st[i] != " ") {
                reverse = reverse + st[i];
            } else {
                reverse = reverse + " ";
            }

        }
        System.out.println(reverse);
    }
}
