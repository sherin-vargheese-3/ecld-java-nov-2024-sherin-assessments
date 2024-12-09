public class CountTrueMain {

    public static void main(String[] args) {

        boolean[] array = {true, false, true, true, true, false};
        int count = countTrue(array);
        System.out.println(count);
    }

    public static int countTrue(boolean[] array) {
        int count = 0;
        for(boolean i : array) {
            if(i) {
                count++;
            }
        }
        return count;
    }
}
