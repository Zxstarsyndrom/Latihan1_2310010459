package hitung;
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika yuli = new Matematika(2, 3);
        System.out.println("Hasil Penjumlahan: " + yuli.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + yuli.setPengurangan());
        System.out.println("Hasil Perkalian: " + yuli.setPerkalian());
        System.out.println("Hasil Pembagian: " + yuli.setPembagian());
    }
}
