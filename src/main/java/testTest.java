import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class testTest {

    public static void main (String [] args) throws IOException {
        System.out.println(isNumeric() + ", the string entered is not a number");
        System.out.println("here is your string with flipped case: "+SwapCase());
        System.out.println("here is the string reversed: "+ reverse());
    }

    public static boolean isNumeric() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string please: ");
        String str = scanner.next();
        return StringUtils.isNumeric(str);
    }

    public static String SwapCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string please: ");
        String str = scanner.nextLine();
        return StringUtils.swapCase(str);
    }

    public static String reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string please: ");
        String str = scanner.next();
        return StringUtils.reverse(str);
    }
}
