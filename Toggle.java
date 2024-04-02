public class Toggle {
    public static void main(String[] args) {

        boolean[] data= {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true };

        for(int i = 1; i< data.length;i++){
            data = Toggle.togglefor(i,data);
        }
        for(int i=1;i< data.length;i++){
            System.out.println(data[i]);
        }
    }

    private static boolean[] togglefor(int i, boolean[] data) {
        for (int j = i; j < data.length; j += i) {
            data[j] = !data[j];

        }
        return data;
    }



}
