package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "CaT cat Dog DoG";
        int freqDog = 0;
        int freqCat = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String each = str.substring(i, i+3);

            if (each.equalsIgnoreCase("Cat")){
                freqCat++;
            }else if (each.equalsIgnoreCase("Dog")){
                freqDog++;
            }

        }
        System.out.println("freqCat = " + freqCat);
        System.out.println("freqDog = " + freqDog);
    }
}
