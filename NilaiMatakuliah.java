
import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String namaMahasiswa;
    String mataKuliah;
    int SKS;
    int nilai;

    public Mahasiswa(String namaMahasiswa, String mataKuliah, int SKS, int nilai){
        this.namaMahasiswa = namaMahasiswa;
        this.mataKuliah = mataKuliah;
        this.SKS = SKS;
        this.nilai = nilai;
    }
}
public class NilaiMatakuliah{
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        ArrayList<Mahasiswa> data = new ArrayList<>();
        data.add(new Mahasiswa("Deden", "Kalkulus", 2, 80));
        data.add(new Mahasiswa("Dean", "Statistika", 2, 85));
        data.add(new Mahasiswa("Luthfi", "Logika", 2, 90));
        data.add(new Mahasiswa("Dea", "Bahasa Inggris", 1, 90));
        data.add(new Mahasiswa("Gerrald", "Algoritma", 2, 95));

        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Daftar Mahasiswa");
        System.out.println("3. Keluar");
        System.out.println();

        int pilihan;
        do{
            System.out.print("Pilih Menu : ");
            pilihan = masukan.nextInt();
            masukan.nextLine();

            switch (pilihan){
                case 1:
                  System.out.println("Masukkan Nama, Mata Kuliah, SKS, Nilai");
                  System.out.print("Nama Mahasiswa : ");
                  String namaMahasiswa = masukan.nextLine();
                  System.out.print("Mata Kuliah : ");
                  String mataKuliah = masukan.nextLine();
                  System.out.print("SKS : ");
                  int SKS = masukan.nextInt();
                  System.out.print("Nilai : ");
                  int nilai = masukan.nextInt();
                  data.add(new Mahasiswa(namaMahasiswa, mataKuliah, SKS, nilai));
                  System.out.println("Mahasiswa sudah ditambahkan");
                  break;

                case 2:
                  System.out.println("Daftar Mahasiswa");
                  System.out.println("===============================================");
                  System.out.println("No\tNama\tMata Kuliah\tSKS\tNilai");
                  System.out.println("===============================================");
                 

                  for (int i = 0; i<data.size(); i++){
                    Mahasiswa mhs = data.get(i);
                    System.out.println((i + 1) + "\t" + mhs.namaMahasiswa + "\t" + mhs.mataKuliah + "\t" + mhs.SKS + "\t" + mhs.nilai);
                    
                  }

                  System.out.println("===============================================");
                  

                case 3:
                  System.out.println("Done");
                  break;

                default:
                  System.out.println("Pilihan tidak valdi");
                  break;

            }
        } while (pilihan != 3);


       masukan.close();
  }
}
