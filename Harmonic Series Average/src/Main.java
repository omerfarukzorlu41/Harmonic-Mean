public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double harmonicSeries = 0.0;

        for (int i = 0; i < array.length; i++) {
            harmonicSeries += (1.0 / array[i]);
            System.out.println(1.0 / array[i]);
        }

        double harmonicAverage = array.length / harmonicSeries;
        System.out.println("average: " + harmonicAverage);
    }
}
