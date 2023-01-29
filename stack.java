import java.util.*; //importing the stack class
class stack{
    public static void main (String[] args)
    {
        System.out.println("Nama : Maghfira Fiolife");
        System.out.println("Kelas : TIF PK-22");
        System.out.println("UAS STRUKTUR DATA SEMESTER 1");
        System.out.println("//////////////////////////////////////////////////////");

        // membuat stack
        Stack<Integer> even = new Stack<>();
        // memasukkan nilai-nilai ke dalam stack
        even.push(8);
        even.push(2);
        even.push(66);
        even.push(77);
        even.push(845);
        even.push(1);
        even.push(9);
        even.push(43);
        even.push(37);

        //menampilakan stack
        System.out.println("Menampilkan Stack Sebelum pop:");
        System.out.println(even);
        System.out.println(".........................................................");
        //mengembalikan nomer di bagian atas stack dan remove
        System.out.println("pop => " + even.pop());
        System.out.println("pop => " + even.pop());
        System.out.println("pop => " + even.pop());
        System.out.println(".........................................................");
        //menampilkan stack
        System.out.println("Menampilkan Stack Setelah pop:");
        System.out.println(even);
        System.out.println(".........................................................");
        //memasukan nomor paling atas Stack tetapi tidak menghapusnya
        System.out.println("Nomor Paling Atas di Stack Adalah : => " + even.peek());
        //memeriksa apakah stack kosong atau tidak
        System.out.println("Apakah Stack Kosong?  Ans:" + even.empty());
        //memeriksa posisi 2 di stack
        System.out.println("Posisi Nomor 2 di Stack yaitu : " + even.search(2));
        //memeriksa apakah 55 ada di Stack
        System.out.println("Posisi Nomor 55 di Stack yaitu : " + even.search(55));
    }
}
