public class Age {
    public static void main(String[] args) {
        int shesAge = 28;
        //declaration
        int[] ageArray;
        //initialization
        ageArray = new int[2];// dwa elementy w tablicy
        ageArray[0] = 28;
        ageArray[1] = 29;
        int familyCount = ageArray.length;

        double sum = 0.0;
        for (int i = 0; i < familyCount; i++) {
            System.out.println(ageArray[i]);
            sum += ageArray[i];
        }
        double average = sum / familyCount;
        System.out.println("Average = " + average);

    }
}
