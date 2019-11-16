import java.util.Collections;

public class Age {
    public static void main(String[] args) {
        int shesAge = 28;
        //declaration
        int[] ageArray;
        //initialization
        ageArray = new int[3];// dwa elementy w tablicy
        ageArray[0] = 28;
        ageArray[1] = 29;
        ageArray[2] = 1;
        int familyCount = ageArray.length;

        double sum = 0.0;
        int youngest = ageArray[0];
        int oldest = ageArray[0];


        for (int i = 0; i < familyCount; i++) {
            System.out.println(ageArray[i]);
            sum += ageArray[i];

            /*if (ageArray[i] < youngest) {
                youngest = ageArray[i];}*/
            youngest = Math.min(youngest, ageArray[i]);
            if (ageArray[i] > oldest) {
                oldest = ageArray[i];
            }
        }

        double average = sum / familyCount;

       /* for (int i = 0; i < familyCount; i++) {
            }
        }

        for (int i = 0; i < familyCount; i++) {
        }*/
        System.out.println("Average = " + average);
        System.out.println("Youngest = " + youngest);
        System.out.println("Oldest = " + oldest);
    }
}
