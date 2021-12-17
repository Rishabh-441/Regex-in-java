import java.util.regex.Pattern;

/*Create a regular expression that accepts 10 digit numeric characters
 starting with 7, 8 or 9 only.*/
public class Q2 {
    public static void main(String[] args) {
        boolean b = Pattern.matches("[789][0-9]{9}","9953038949");
        System.out.println(b);
    }
}
