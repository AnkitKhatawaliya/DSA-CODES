import java.util.Arrays;
import java.util.Random;

public class Celebrity {
    public static void main(String[] args) {
        boolean[][] maze = generateRandomArray(10, 10);

        for (int i =0;i<maze.length;i++) {
            for (int j =0;j<maze.length;j++) {
                if(i==j){
                    maze[i][j]=false;
                }
            }
        }
        int[] data = {0,0,0,0,0,0,0,0,0,0};

        for(int i =0;i<maze.length;i++){
            data[i]=countFor(i,maze);
        }
        int a = 0,b=0;
        for(int i =0;i<maze.length;i++){
            if(data[i]>b){
                b=data[i];
                a =i;
            }
        }
        for (boolean[] row : maze) {
            for (boolean cell : row) {
                System.out.print(cell ? "1   " : "0   ");
            }
            System.out.println();
        }

        System.out.println("Celebrity is "+a);
        for(int i =0;i<maze.length;i++) {
            System.out.println("Score for " + i + " is " + data[i]);
        }
    }

    private static int countFor(int i, boolean[][] maze) {

        int row =0,col=0;
        for(int j = 0;j<maze.length;j++){
            if(maze[j][i]){
                row++;
            }
            if(maze[i][j]){
                col++;
            }
        }
        return col-row;

    }

    private static boolean[][] generateRandomArray(int rows, int cols) {
        boolean[][] array = new boolean[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextBoolean();
            }
        }
        return array;
    }
}
