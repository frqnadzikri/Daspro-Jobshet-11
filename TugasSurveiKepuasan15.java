import java.util.Scanner;

public class TugasSurveiKepuasan15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        System.out.println("=== INPUT HASIL SURVEI ===");
        for(int i = 0; i < responden; i++){
            System.out.println("Responden ke-" + (i + 1));
            for(int j = 0; j < pertanyaan; j++){
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n=== NILAI RATA-RATA PER RESPONDEN ===");
        for(int i = 0; i < responden; i++){
            double total = 0;
            for(int j = 0; j < pertanyaan; j++){
                total += survey[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total / pertanyaan));
        }

        System.out.println("\n=== NILAI RATA-RATA PER PERTANYAAN ===");
        for(int j = 0; j < pertanyaan; j++){
            double total = 0;
            for(int i = 0; i < responden; i++){
                total += survey[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + ": " + (total / responden));
        }

        System.out.println("\n=== NILAI RATA-RATA KESELURUHAN ===");
        double totalSemua = 0;
        for(int i = 0; i < responden; i++){
            for(int j = 0; j < pertanyaan; j++){
                totalSemua += survey[i][j];
            }
        }
        double rataKeseluruhan = totalSemua / (responden * pertanyaan);
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);

        input.close();
    }
}

