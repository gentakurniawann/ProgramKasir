package ProgramKasir;
import java.util.Scanner;
/**
 *
 * @author genta
 */
public class ProgramKasir {
    double harga, total, bayar, kembalian;
    int pil, jumlah;
    
    double HitungJumlah(int jml){
        jumlah=jml;
        switch(pil){
            case 0:
                System.exit(0);
                break;
            case 1:
                harga=15000;
                total=total+(harga*jml);
                break;
            case 2:
                harga=15000;
                total=total+(harga*jml);
                break;
            case 3:
                harga=12000;
                total=total+(harga*jml);
                break;
            case 4:
                harga=12000;
                total=total+(harga*jml);
                break;
            case 5:
                harga=12000;
                total=total+(harga*jml);
                break;
            case 6:
                harga=5000;
                total=total+(harga*jml);
                break;
            case 7:
                harga=8000;
                total=total+(harga*jml);
                break;
            case 8:
                harga=10000;
                total=total+(harga*jml);
                break;
            case 9:
                break;
            default:
                System.out.println("ERROR : Input yang anda masukkan salah");
                break;
    }
        return total;
    }
    
    void LihatTotal(){
        System.out.println("====================");
        System.out.println("Total : Rp"+total);
    }
    void HasilBayar(){
        if(bayar==total){
            System.out.println("Uang Pas");  
        }
        else if(bayar<total){
            System.out.println("Uang Kurang");
        }
        else if(bayar>total){
            kembalian=bayar-total;
            System.out.println("Kembalian Anda " +kembalian);
        }else{
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ProgramKasir in = new ProgramKasir();
        System.out.println("==========KEDAI ENAK==========");
        do{
            System.out.println("==========MENU==========");
        System.out.println("1. Nasi Goreng Rp15.000");
        System.out.println("2. Mie Goreng Rp15.000");
        System.out.println("3. Roti Bakar Rp12.000");
        System.out.println("4. Siomay Rp12.000");
        System.out.println("5. Batagor Rp12.000");
        System.out.println("6. Hot/ice tea Rp5.000");
        System.out.println("7. Hot/ice Orange Juice Rp8.000");
        System.out.println("8. Hot/ice Black coffee Rp10.000");
        System.out.println("9. Selesai dan Hitung pembayaran ");
        System.out.println("0. Close Program");
        System.out.println("");
        System.out.println("====================");
        System.out.print("Masukkan Pilihan : ");
        in.pil= input.nextInt();
        if(in.pil >= 1 && in.pil <= 8){
            System.out.print("Masukkan Jumlah Beli : ");
            in.jumlah = input.nextInt();
        }else{
        }
        in.HitungJumlah(in.jumlah);
        }while(in.pil != 9);
        in.LihatTotal();
        System.out.print("Bayar : Rp");
        in.bayar=input.nextDouble();
        in.HasilBayar();
       
    }
    
}
