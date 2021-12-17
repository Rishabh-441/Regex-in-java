import java.util.regex.*;

/*Create a regular expression that accepts alphanumeric characters only.
Its length must be six characters long only.*/
public class Q1 {
    public static void main(String[] args) {
        boolean b = Pattern.matches("[a-z0-9]{6}","hell55");
        System.out.println(b);

    }
}
