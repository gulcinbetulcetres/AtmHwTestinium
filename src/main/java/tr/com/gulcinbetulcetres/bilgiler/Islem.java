package tr.com.gulcinbetulcetres.bilgiler;

public class Islem {

    public void paraCek(Musteri musteri, double islemTutar){
        musteri.setHesapBakiyesi(musteri.getHesapBakiyesi() - islemTutar);
    }
    public void paraYatir(Musteri musteri, double islemTutar){
        musteri.setHesapBakiyesi(musteri.getHesapBakiyesi() + islemTutar);
    }
}
