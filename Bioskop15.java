public class Bioskop15 {  
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println("Daftar Penonton Bioskop:");
        System.out.println(penonton[0][0] + "\t" + penonton[0][1]);
        System.out.println(penonton[1][0] + "\t" + penonton[1][1]);
        System.out.println(penonton[2][0] + "\t" + penonton[2][1]);
        System.out.println(penonton[3][0] + "\t" + penonton[3][1]);
    }
}
