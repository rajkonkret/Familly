
public class Age {
    public static void main(String[] args) {
        //declaration

        //initialization
        int[] ageArray = {28, 29, 1, 5};

        int familyCount = ageArray.length;

        //calculation
        double sum = 0.0;
        int youngest = ageArray[0];
        int oldest = ageArray[0];


        for (int age : ageArray) {
            sum += age;
            youngest = youngest(ageArray, age);
            oldest = oldest(ageArray, age);
            /*if (age > oldest) {
                oldest = age;
            }*/
        }

        double ave = average(ageArray, familyCount, sum);
        System.out.println("Average = " + average(ageArray, familyCount, sum));
        System.out.println("Youngest = " + youngest);
        System.out.println("Oldest = " + oldest);
        System.out.format((String.valueOf(ave)));
    }

    public static double average(int[] ageArray, int familyCount, double sum) {
        return sum / familyCount;
    }

    public static int youngest(int[] ageArray, int age) {
        int youngest = ageArray[0];
        youngest = Math.min(youngest, age);
        return youngest;
    }

    public static int oldest(int[] ageArray, int age) {
        int oldest = ageArray[0];
        return Math.max(oldest, age);
    }

}
