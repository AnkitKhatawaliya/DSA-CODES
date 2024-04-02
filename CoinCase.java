import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CoinCase {
    public static void main(String[] args) {
        int[] coins = generateRandomCoins(80);
        System.out.println("Generated coins array: ");
        for (int coin : coins) {
            System.out.print(coin + " ");
        }
        System.out.print("\nGive the total sum: ");
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        ArrayList<Integer> coinsUsed = new ArrayList<>();
        int current = 0;
        int search;

        while (current < total) {
            if((total-current)>=5){
                search =5;
            }else if((total-current)>=2){
                search =2;
            }else{
                search =1;
            }
            int index = findIndexFor(coins,search);
            if (coins[index] == -1) {
                System.out.println("Amount exceed the sum.");
                break;
            }
            coinsUsed.add(coins[index]);
            current += coins[index];
            coins[index] = 0;
        }

        System.out.println("The count is: " + coinsUsed.size());
        System.out.println("Coins used: " + coinsUsed);
    }

    private static int findIndexFor(int[] coins, int denomination) {
        int index = -1;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == denomination) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static int[] generateRandomCoins(int size) {
        Random random = new Random();
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            int randNum = random.nextInt(3);
            switch (randNum) {
                case 0:
                    coins[i] = 1;
                    break;
                case 1:
                    coins[i] = 2;
                    break;
                case 2:
                    coins[i] = 5;
                    break;
            }
        }
        return coins;
    }
}
