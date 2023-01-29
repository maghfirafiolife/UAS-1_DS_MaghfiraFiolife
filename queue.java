import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.InputMismatchException;

public class queue {

    public static void main(String[] args) {
        System.out.println("Nama : Maghfira Fiolife");
        System.out.println("Kelas : TIF PK-22");
        System.out.println("UAS STRUKTUR DATA SEMESTER 1");
        System.out.println("_______________________________________________________________");

        //membuat dan menginisialisasi interface queue menggunakan linked list
        Queue<String> antrianPendaftaran = new LinkedList<>();

        //menambahkan data element baru ke list queue
        antrianPendaftaran.add("Jaemin");
        antrianPendaftaran.add("Haechan");
        antrianPendaftaran.add("Lisa");
        antrianPendaftaran.add("Jisoo");
        antrianPendaftaran.add("Rose");
        antrianPendaftaran.add("Jennie");

        //menampilkan output hasil list queue
        System.out.println("Antrian Seleksi Pendaftaran Idol YG : "+antrianPendaftaran);
        System.out.println("................................................................");

        //menghapus element queue menggunakan metode remove
        String nama = antrianPendaftaran.remove();
        System.out.println("Menghapus dari Antrian Seleksi Pendaftaran YG : "+nama +" | Daftar antrian baru : "+antrianPendaftaran);
        System.out.println("................................................................");


        //menghapus element dari queue menggunakan metode poll {}
        //metode remove {} akan mengembalikan null, jika list queue kosong
        nama = antrianPendaftaran.poll();
        System.out.println("Menghapus dari Antrian Seleksi Pendaftaran Idol YG : "+nama +" | Daftar anrian baru : "+antrianPendaftaran);


    }
}
