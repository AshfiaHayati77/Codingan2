package latihanpraktikum;
import java.util.Scanner;
public class PercobaanIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = null;
        int pilihan, harga=0, porsi;
        System.out.println("----Menu Makanan----");
        System.out.println("1. Bakso\n2. Mie Ayam\n3. Rujak");
        System.out.print("Pilih\t\t: ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            menu = "Bakso";
            harga = 8000;
        } else if (pilihan == 2){
            menu = "Mie Ayam";
            harga = 9000;
        } else if (pilihan == 3){
            menu = "Rujak";
            harga = 6000;
        }
        if (menu == null){
            System.out.println("Pilihan Salah");
        }else{
            System.out.print("Jml porsi\t: "); 
            porsi = input.nextInt();
            System.out.println("====================");
            System.out.println("Menu dipesan\t: ");
            System.out.println(menu + " - Rp. " + harga + "/porsi");
            harga = harga * porsi;
            System.out.println("Total bayar \t: Rp. " +harga);
        }
       
    }
    
}
