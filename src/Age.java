
public class Age {
    public static void main(String[] args) {
        //declaration

        //initialization
        int[] ageArray = {28,29,1};

        int familyCount = ageArray.length;

        //calculation
        double sum = 0.0;
        int youngest = ageArray[0];
        int oldest = ageArray[0];


        for (int age : ageArray) {
            sum += age;
            youngest = Math.min(youngest, age);
            if (age > oldest) {
                oldest = age;
            }
        }

        double average = sum / familyCount;

        System.out.println("Average = " + average);
        System.out.println("Youngest = " + youngest);
        System.out.println("Oldest = " + oldest);
    }
}
