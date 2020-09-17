import java.util.Scanner;

public class TowerOfHanoi {

    public static void discMoving(int numberOfMoves, char first, char second, char third) {
        if (numberOfMoves == 1) {
            System.out.println("Move disk 1 from " + first + " to " + second);
            return;
        }
        discMoving(numberOfMoves-1, first, third, second );
        System.out.println("Move disk " + numberOfMoves + " from " +  first + " to " + second);
        discMoving(numberOfMoves-1, third, second, first);
    }

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many disks do you want to have on a rod? ");
        int disk = input.nextInt();
        discMoving(disk, 'A', 'B', 'C');
    }
}
