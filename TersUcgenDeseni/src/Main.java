import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Ladder Count :  ");
        int basamakSayisi = input.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {

            // Empty Spaces

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Stars

            for (int k = i; k <= basamakSayisi; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
