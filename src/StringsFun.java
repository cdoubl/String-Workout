/**
 * class that contains a couple of functions to manipulate strings passed in.
 * Writing this for practice working with String objects
 * @author Chad Walker
 * @version 1.0
 */
public class StringsFun {
    /**
     * swap first name last name
     * need to work on accepting more than first and last only
     *
     * @param s
     */
    public static void swap(String s) {
        /* used an instance StringBuilder class instead of String since I'm
        trying to improve my skills with this function.
         */
        StringBuilder swapper = new StringBuilder();
        /*
        split the string where there's white-space iterate through the array of
        strings and populate the instance of StringBuilder object
         */
        String[] r = s.split(" ");
        //for loop for names with more than just first and last
        for (int i = r.length - 1; i >= 0; i--) {
            swapper.append(r[i] + " ");
        }
        System.out.println("First name swapped with last name is:\n" + swapper);

            /* here's very limited solution
            String swapped = r[1] + " " + r[0];
            System.out.print("This is your first and last name swapped: "
                    + swapped);
             */
    }
    /**
     * function to print text backwards
     *
     * @param fullName
     */
    public static void backWards(String fullName) {
        char[] c = fullName.toCharArray();
        System.out.println("Here's your name spelled backwards: ");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
    /**
     * function to concatenate two strings. Reducing functionality in main()
     * @param f
     * @param l
     * @return
     */
    public static String myConcat(String f, String l){
        //make sure there's a space between f and l when concatenated
        String fullName = f.concat(" ").concat(l);
        return fullName;
    }
}

