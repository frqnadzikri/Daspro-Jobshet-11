1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0?
-Jawaban :Tidak harus berurutan. Elemen array bisa diisi dengan urutan bebas. Misalnya kita bisa langsung mengisi penonton[3][1] terlebih dahulu sebelum mengisi penonton[0][0].
2. Mengapa terdapat null pada daftar nama penonton?
-Jawaban :Karena penonton[3][1] tidak diisi nilai. Ketika array String dideklarasikan, semua elemen secara otomatis diinisialisasi dengan nilai null. Jadi karena penonton[3][1] tidak diberi nilai "Hana", maka tetap null.
4. Penjelasan output nomor 4:
penonton.length = 4 (jumlah baris dalam array)
penonton[0].length = 2 (jumlah kolom di baris ke-0)
penonton[1].length = 2 (jumlah kolom di baris ke-1)
penonton[2].length = 2 (jumlah kolom di baris ke-2)
penonton[3].length = 2 (jumlah kolom di baris ke-3)
Semua penonton[i].length memiliki nilai yang sama yaitu 2 karena setiap baris memiliki 2 kolom.
10. Kekurangan dan kelebihan foreach loop dibandingkan for loop:
-Kelebihan foreach:
Sintaks lebih sederhana dan mudah dibaca
Tidak perlu mengelola indeks secara manual
-Kekurangan foreach:
Tidak bisa mengakses indeks elemen
Tidak bisa memodifikasi array (hanya baca)
11. Berapa indeks baris maksimal untuk array penonton?
-Indeks baris maksimal = 3 (karena ada 4 baris: indeks 0, 1, 2, 3) 
12. Berapa indeks kolom maksimal untuk array penonton?
Indeks kolom maksimal = 1 (karena ada 2 kolom: indeks 0, 1)
13. Apa fungsi dari String.join()?
-String.join() digunakan untuk menggabungkan elemen-elemen array atau collection menjadi satu String dengan pemisah (delimiter) tertentu.