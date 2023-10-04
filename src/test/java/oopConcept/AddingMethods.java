package oopConcept;

public class AddingMethods {
    public static void main(String[] args) {
        alinanPuan("Cem", 90);
        alinanPuan("Can", 35);
    }

    public static void alinanPuan(String ogrenciAdi, int score) {
        String puan;
        if (score >= 90 && score <= 100) {
            puan = "A";
        } else if (score >= 80 && score < 90) {
            puan = "B";
        } else if (score >= 70 && score < 80) {
            puan = "C";
        } else {
            puan = "D";
        }
        System.out.println("Ogrenci: " + ogrenciAdi + ". Aldıgi not: " + puan);


    }
}
