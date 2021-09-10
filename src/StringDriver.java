import java.util.Scanner;
/**
 * class that contains main method that prompts user to enter their info
 * @author Chad Walker
 * @version 1.0
 */
public class StringDriver {
    public static void main(String[] args) {
        String first, last, fullName;
        Scanner keyboard = new Scanner(System.in);
        //create instance of StringFun class
        StringsFun fun = new StringsFun();
        //prompt user initialize string variables
        System.out.print("enter first name: ");
        first = keyboard.nextLine();
        System.out.print("enter last name: ");
        last = keyboard.nextLine();
        //call concat function to combine first and last and initialize fullName
        fullName = fun.myConcat(first, last);
        //call functions from StringsFun class to manipulate text entered by
        // user
        fun.swap(fullName);
        fun.backWards(fullName);
    }
}
