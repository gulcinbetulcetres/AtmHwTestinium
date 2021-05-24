package tr.com.gulcinbetulcetres.bilgiler;

public class KurumsalMusteri extends Musteri {
    private String sirketAdi;

    public KurumsalMusteri(double tcKimlikNo, String adSoyad, double hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }
    public String getSirketAdi() {
        return sirketAdi;
    }
    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        return super.toString()
                +"KurumsalMusteri{" +
                "sirketAdi='" + sirketAdi + '\'' +
                '}';
    }
}
