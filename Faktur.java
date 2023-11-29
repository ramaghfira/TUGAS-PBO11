class Faktur extends Pelanggan {
    private String noFaktur;
    private Barang barang;

    public Faktur(String noFaktur, String namaPelanggan, Barang barang) {
        super(namaPelanggan);
        this.noFaktur = noFaktur;
        this.barang = barang;
    }

    public void tampilkanInfoFaktur() {
        System.out.println("No. Faktur: " + noFaktur);
        System.out.println("Pelanggan: " + namaPelanggan);
        barang.tampilkanInfo();
        System.out.println("Jumlah Barang: " + barang.jumlahBarang);
        System.out.println("Total Bayar: " + barang.hitungTotalBayar());
    }
}