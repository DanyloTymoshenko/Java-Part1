public class Main {
    public static void main(String[] args) {

        String stringToRevers = "I'm going to go to school today morning.";
        System.out.println( new StringBuilder(stringToRevers).reverse().toString()); //


        /// ////////// WAY 2
        String r = "";
        char ch;

        for (int i = 0; i < stringToRevers.length(); i++) {

            ch = stringToRevers.charAt(i);


            r = ch + r;
        }

        System.out.println(r);
        /// //////////////////WAY3


        char[] arr = stringToRevers.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }


}