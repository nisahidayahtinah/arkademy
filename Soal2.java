import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputan = ");
        int n = scanner.nextInt();

        cetak_gambar(n);
    }
    static void cetak_gambar(int n){
        int awal = 1;
        int akhir = n-1;
        System.out.println("---panjang---");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=awal && j<akhir && i!=2 && i!=5){
                    System.out.print("=\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

    }
}
