public class Boat {
    public static void main(String[] args) {
        int[] people = {3, 2, 1, 3, 2, 1, 3, 2, 1, 2, 3, 1, 2, 2, 2, 3, 3, 1, 1, 2, 3, 2, 1, 1, 2, 2, 1, 1, 1, 2, 2, 3, 1, 1};

        int boatsRequired = 0;

        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == 3) {
                people[i] = 0;
                boatsRequired++;
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] == 2) {
                people[i] = 0;
                boatsRequired++;
            } if (people[i] == 1) {
                people[i] = 0;
            }
        }

        for (int person : people) {
            count += person;
        }
        int a = count/3;
        int b= count%3;
        boatsRequired +=a;
        if(b!=0){
            boatsRequired++;
        }

        System.out.println("Minimum number of boats required: " + boatsRequired);
    }
}
