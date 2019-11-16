import sun.plugin.extension.JavaExtensionInstaller;

import java.util.Map;

public class AgeWithoutArrays {
    public static void main(String[] args) {
        int shesAge = 28;
        int hesAge = 29;
        //averrage
        double average = (shesAge + hesAge) / 2.0;

        int youngest = Math.min(shesAge, hesAge);

        int oldest = Math.max(shesAge, hesAge);
        System.out.println("Average: " + average);
        System.out.println("Youngest " + youngest);
        System.out.println("Oldest: " + oldest);

    }
}
