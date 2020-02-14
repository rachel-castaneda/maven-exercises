import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class testTest {

    public static void main (String [] args) throws IOException {
        System.out.println(isNumeric());
        System.out.println("here is your string with flipped case: "+SwapCase());
        System.out.println("here is the string reversed: "+ reverse());
    }

    public static boolean isNumeric() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string please: ");
        String str = scanner.next();
        for ( char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
            System.out.println("this is number, not a string. you sneaky sob");
        }
        return true;
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
