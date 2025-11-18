import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] penonton = new String[4][2];
        
        int pilihan;
        
        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            
            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                
                int baris, kolom;
                
                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia! Silakan coba lagi.");
                        continue; 
                    }
                    
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi oleh penonton lain! Silakan pilih kursi lain.");
                        continue; 
                    }
                    
                    break;
                }
                
                penonton[baris-1][kolom-1] = nama;
                System.out.println("Data penonton berhasil disimpan!");
                
            } else if (pilihan == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": " + penonton[i][j]);
                        }
                    }
                }
                
            } else if (pilihan == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;
                
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih 1-3.");
            }
        }
        
        sc.close();
    }
}