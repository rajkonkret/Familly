import sun.plugin.extension.JavaExtensionInstaller;

import java.util.Map;

public class AgeWithoutArrays {
    public static void main(String[] args) {
        int shesAge = 28;
        int hesAge = 29;
        int childAge = 1;
        //averrage
        double average = (shesAge + hesAge + childAge) / 3.0;

        int almostYoungest = Math.min(shesAge, hesAge);
        int youngest = Math.min(almostYoungest, childAge);

        int almostOldest = Math.max(shesAge, hesAge);
        int oldest = Math.max(shesAge, hesAge);

        System.out.println("Average: " + average);
        System.out.println("Youngest " + youngest);
        System.out.println("Oldest: " + oldest);

    }
}
