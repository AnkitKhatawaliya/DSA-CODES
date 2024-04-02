import java.util.Scanner;
import java.util.Stack;

public class Hacker_Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stackOne = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();

        System.out.print("Enter the number of elements for first stack: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element: ");
            int num = scanner.nextInt();
            stackOne.push(num);
        }

        System.out.print("Enter the number of elements for second stack: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element: ");
            int num = scanner.nextInt();
            stackTwo.push(num);
        }

        System.out.print("Enter the maximum sum: ");
        int maxSum = scanner.nextInt();

        int maxPoppedElements = getMaxPoppedElements(stackOne, stackTwo, maxSum);
        System.out.println("Max elements that can be popped: " + maxPoppedElements);
    }

    private static int getMaxPoppedElements(Stack<Integer> stackOne, Stack<Integer> stackTwo, int maxSum) {
        int currSum = 0;
        int count = 0;

        while (!stackOne.isEmpty() && !stackTwo.isEmpty() && (currSum + stackOne.peek() <= maxSum || currSum + stackTwo.peek() <= maxSum)) {
            if (stackOne.peek() < stackTwo.peek()) {
                currSum += stackOne.pop();
            } else {
                currSum += stackTwo.pop();
            }
            count++;
        }

        while (!stackOne.isEmpty() && currSum + stackOne.peek() <= maxSum) {
            currSum += stackOne.pop();
            count++;
        }

        while (!stackTwo.isEmpty() && currSum + stackTwo.peek() <= maxSum) {
            currSum += stackTwo.pop();
            count++;
        }

        return count;
    }
}
