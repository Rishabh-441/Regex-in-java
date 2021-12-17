import java.util.Scanner;
import java.util.regex.*;
public class PatternFinder{
    public static void main(String[] args) {
        System.out.println("enter the regex pattern: ");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile(sc.nextLine());
        System.out.println("enter the String: ");
        Matcher m = p.matcher(sc.nextLine());
        boolean found = false;
        while(m.find()){
            System.out.println("found : " + m.group() + " from position " + m.start() + " to " + m.end());
            found = true;
        }
        if (!found){
            System.out.println("not found");
        }
    }
}
