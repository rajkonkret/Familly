public class Age {
    public static void main(String[] args) {
        int shesAge = 28;
        //declaration
        int[] ageArray;
        //initialization
        ageArray = new int[2];// dwa elementy w tablicy
        ageArray[0] = 28;
        ageArray[1] = 29;

        for (int i = 0; i < ageArray.length; i++) {
            System.out.println(ageArray[i]);
        }


    }
}
