package hitung;
public class Matematika {
    double bil1, bil2;

    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    public double setPengurangan() {
        return bil1 - bil2;
    }

    public double setPerkalian() {
        return bil1 * bil2;
    }

    public double setPembagian() {
        return bil1 / bil2;
    }

    public static void main(String[] args) {
        Matematika math = new Matematika(5.5, 3.2);
        System.out.println("Hasil Penjumlahan: " + math.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + math.setPengurangan());
        System.out.println("Hasil Perkalian: " + math.setPerkalian());
        System.out.println("Hasil Pembagian: " + math.setPembagian());
    }
}
