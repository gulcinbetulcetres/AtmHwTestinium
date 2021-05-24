package tr.com.gulcinbetulcetres.bilgiler;

public class BireyselMusteri extends Musteri {
    private String evAdresi;

    public BireyselMusteri(double tcKimlikNo, String adSoyad, double hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "BireyselMusteri{" +
                "evAdresi='" + evAdresi + '\'' +
                '}';
    }
}
