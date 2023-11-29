class BarangDiskon extends Barang {
    private double diskon;

    public BarangDiskon(String namaBarang, double hargaBarang, int jumlahBarang, double diskon) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.diskon = diskon;
    }

    @Override
    public double hitungTotalBayar() {
        return super.hitungTotalBayar() * (1 - diskon);
    }
}
