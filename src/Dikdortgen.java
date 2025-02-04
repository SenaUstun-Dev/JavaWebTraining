/*
a) Dikdörtgen “sınıfının” alan ve çevresini öğrendiğiniz konuları kullanarak
 hesaplayın.
 */
public class Dikdortgen {

    private float yatayKenar;
    private float dikeyKenar;

    public Dikdortgen(float yatayKenar, float dikeyKenar) {
        this.yatayKenar = yatayKenar;
        this.dikeyKenar = dikeyKenar;
    }

    //olan dikdörgen nesnelerinin alan ve çevre hesabını yaparlar vvvvvvvvv
    public float alanHesapla() {
        return this.yatayKenar * this.dikeyKenar;
    }

    public float cevreHesapla() {
        return 2 * (this.yatayKenar + this.dikeyKenar);
    }

    //genel herşey için alan ve çevre hesabı yaparlar vvvvvvvvv
    public static float alanHesapla( float yatayKenar, float dikeyKenar) {
        return yatayKenar * dikeyKenar;
    }

    public static float cevreHesapla(float yatayKenar, float dikeyKenar){
        return 2 * (yatayKenar + dikeyKenar);
    }


}
