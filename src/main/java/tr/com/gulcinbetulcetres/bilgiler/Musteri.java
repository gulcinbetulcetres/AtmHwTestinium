package tr.com.gulcinbetulcetres.bilgiler;

public abstract class Musteri {
    private double tcKimlikNo;
    private String adSoyad;
    private double hesapBakiyesi;

    public Musteri(double tcKimlikNo, String adSoyad, double hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public double getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(double tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "tcKimlikNo=" + (int) tcKimlikNo+
                ", adSoyad='" + adSoyad + '\'' +
                ", hesapBakiyesi=" + hesapBakiyesi +
                '}';
    }
}
