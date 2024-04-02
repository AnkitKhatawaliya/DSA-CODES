import java.util.Arrays;

public class RobberHouse {
    public static void main(String[] args) {

        int[] houses = {5,56,34,2,5,1,45,24,1,6,34,2,6,6,2,4,14,6,34,31,45,6,4,77,34,2,4,2};

        int[] duplicateHouses = Arrays.copyOf(houses, houses.length);

        int totalStolen = 0;

        while (true) {
            System.out.println(totalStolen);
            int maxIndex = findMaxIndex(duplicateHouses);
            if (maxIndex == -1) {
                break;
            }


            totalStolen += duplicateHouses[maxIndex];
            duplicateHouses[maxIndex] = 0;

            if (maxIndex > 0) {
                duplicateHouses[maxIndex - 1] = -1;
            }
            if (maxIndex < duplicateHouses.length - 1) {
                duplicateHouses[maxIndex + 1] = -1;
            }
        }

        System.out.println("Total amount stolen: " + totalStolen);
    }

    public static int findMaxIndex(int[] arr) {
        int maxIndex = -1;
        int maxValue = -2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        if(arr[maxIndex]==0){
            return -1;
        }
        return maxIndex;
    }
}

//public class RobberHouse {
//    public static void main(String[] args) {
//
//        int[] houses = {5,56,34,2,5,1,45,24,1,6,34,2,6,6,2,4,14,6,34,31,45,6,4,77,34,2,4,2};
//
//        int[] theft = new int[houses.length];
//
//        theft[0] = houses[0];
//        theft[1] = Math.max(houses[0], houses[1]);
//
//        for (int i = 2; i < houses.length; i++) {
//            theft[i] = Math.max(theft[i - 1], theft[i - 2] + houses[i]);
//        }
//
//        System.out.println("Maximum amount that can be stolen: " + theft[houses.length - 1]);
//    }
//}
