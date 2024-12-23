import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter array size");

        int size = s.nextInt();

        int[] array = new int[size];
        int i=0;

        System.out.println("Please enter numbers");

        for(i=0; i<size; i++){ array[i] = s.nextInt(); }
        boolean sorted = true;



        for(i=1; i<size; i++){
                if(array[i] < array[i - 1]){
                    sorted = false;
                    break;
                }
            }
        System.out.println(sorted);

    }
}