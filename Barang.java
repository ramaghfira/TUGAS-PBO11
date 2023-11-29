class Barang implements HitungTotalBayar {
    protected String namaBarang;
    protected double hargaBarang;
    protected int jumlahBarang;

    public Barang(String namaBarang, double hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBarang;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
    }
}