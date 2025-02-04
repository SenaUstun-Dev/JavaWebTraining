public class Item {

    private String urunAdi;
    private String tedarikciAdi;
    private float satisFiyati;
    private float alisFiyati;

    public Item(String urunAdi, String tedarikciAdi, float satisFiyati, float alisFiyati) {
        this.urunAdi = urunAdi;
        this.tedarikciAdi = tedarikciAdi;
        this.satisFiyati = satisFiyati;
        this.alisFiyati = alisFiyati;
    }

    public void satisFiyatiYuzdeYirmiArttir() { // ürünün satış fiyatını, %20 fazlası ile günceller
        satisFiyati *= 1.20;
    }

    public float karHesapla() { //üründen elde edilen karı hesaplar
        return (satisFiyati - alisFiyati);
    }

    @Override //ürün bilgileri yazdırılmak istenirse
    public String toString() {
        return "Ürün: " + urunAdi + ", Fiyat: " + satisFiyati + " TL";
    }

    //get-set fonksiyonları vvvvvvvvvvvvvvv
    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getTedarikciAdi() {
        return tedarikciAdi;
    }

    public void setTedarikciAdi(String tedarikciAdi) {
        this.tedarikciAdi = tedarikciAdi;
    }

    public float getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(float satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public float getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(float alisFiyati) {
        this.alisFiyati = alisFiyati;
    }
}