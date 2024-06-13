package Strings.ReverseString;

public class Java002 {
    public static void main(String[] args) {
        String str = "This is me";
        String reverse = "";

        char[] ch = str.toCharArray();
        for (int i=ch.length-1; i>=0; i--){
            reverse = reverse+ch[i];
        }
        System.out.println(reverse);
    }
}
