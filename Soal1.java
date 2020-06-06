import java.util.Arrays;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputan = ");
//        5956560159466056
        long angka = scanner.nextLong();
//        System.out.println(angka);

        String kata = String.valueOf(angka);
        int jumlahangka = kata.length();
//        System.out.println(jumlahangka);

        UrutAngka(angka, jumlahangka);
    }
    static void UrutAngka(long angka, int jumlahangka){
        int bagi = 0;
        String kal1 = "";
        String kal2 = "";
        String kal3 = "";

        for (int i=0; i<jumlahangka;i++){
           String kal = String.valueOf(angka);
           int cekkal = Integer.parseInt(String.valueOf(kal.charAt(i)));
           if(cekkal == 0){
               bagi = bagi + 1;
           }
           if (bagi == 0){
               if(cekkal != 0){
                   kal1 = kal1 + cekkal;
               }
           } else if (bagi == 1){
               if(cekkal != 0){
                   kal2 = kal2 + cekkal;
               }
           } else{
               if(cekkal != 0){
                   kal3 = kal3 + cekkal;
               }
           }

        }
//        System.out.println("Kal1 = "+kal1);
//        System.out.println("Kal2 = "+kal2);
//        System.out.println("Kal3 = "+kal3);

        //Urut1
        char[] kalchar1 = kal1.toCharArray();
        Arrays.sort(kalchar1);
        String kalurut1 = new String (kalchar1);
//        System.out.println(kalurut1);

        //Urut2
        char[] kalchar2 = kal2.toCharArray();
        Arrays.sort(kalchar2);
        String kalurut2 = new String (kalchar2);
//        System.out.println(kalurut2);

        //Urut2
        char[] kalchar3 = kal3.toCharArray();
        Arrays.sort(kalchar3);
        String kalurut3 = new String (kalchar3);
//        System.out.println(kalurut3);

        //Gabungan
        String gabungan = kalurut1 + kalurut2 + kalurut3;
        System.out.println("Output : "+gabungan);




    }
}
