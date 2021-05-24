package tr.com.gulcinbetulcetres.bilgiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Map<Integer, Musteri> musteriMap = new HashMap<Integer, Musteri>();

        musteriMap.put(1234, new BireyselMusteri(
                1235,
                "Gülçin Betül Çetres",
                100,
                "Istanbul"
        ));
        musteriMap.put(1235, new KurumsalMusteri(
                1235,
                "Mehmet Akşahin",
                250,
                "Akşahin A.Ş"
        ));
        musteriMap.put(1236, new KurumsalMusteri(
                1236,
                "Mustafa Deneme",
                300,
                "Denemelik Şirket"
        ));
        musteriMap.put(1237, new BireyselMusteri(
                1237,
                "Mehmet Yılmaz",
                400,
                "Ankara"
        ));
        musteriMap.put(1238, new BireyselMusteri(
                1238,
                "Merve Yılmaz",
                500,
                "İzmir"
        ));


        Scanner myObj = new Scanner(System.in);
        System.out.println("Müşteri numarsını giriniz");

        int musNo = myObj.nextInt();
        Musteri MusteriInfo =  musteriMap.get(musNo);
        if (MusteriInfo == null){
            System.out.println("Yanlış müşteri numarası girdiniz. Güvenlik nedeniyle işleminiz sonlandırılmıştır");
        }
        else{
            System.out.println("Musteri bilgileri : \n" + MusteriInfo);
            System.out.println("Yapmak istediğiniz işlemi giriniz\n 1: Para Yatırma \n 2: Para Çekme");
            int islemTipi = myObj.nextInt();

            Islem islem = new Islem();

            if (islemTipi == 1){
                System.out.println("Yatırmak istediğiniz tutarı giriniz");
                double tutar = myObj.nextDouble();
                islem.paraYatir(MusteriInfo,tutar);
                System.out.println("Yeni hesap bakiyesi : " + MusteriInfo.getHesapBakiyesi());
            }
            else if(islemTipi == 2){
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                double tutar = myObj.nextDouble();
                islem.paraCek(MusteriInfo,tutar);
                System.out.println("Yeni hesap bakiyesi : " + MusteriInfo.getHesapBakiyesi());
            }
            else{
                System.out.println("Böyle bir işlem bulunmamakta. İşleminiz sonlandırılmıştır");
            }
        }



    }
}
