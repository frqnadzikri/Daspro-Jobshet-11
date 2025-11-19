public class Numbers15 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
    
        myNumbers[0] = new int[5];
        
        myNumbers[1] = new int[3];
        
        myNumbers[2] = new int[1];
        
        System.out.println("Jumlah baris: " + myNumbers.length);
        System.out.println("Jumlah kolom baris ke-1: " + myNumbers[0].length);
        System.out.println("Jumlah kolom baris ke-2: " + myNumbers[1].length);
        System.out.println("Jumlah kolom baris ke-3: " + myNumbers[2].length);
    }
}