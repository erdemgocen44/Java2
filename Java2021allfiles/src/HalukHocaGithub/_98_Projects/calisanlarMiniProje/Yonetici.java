package _98_Projects.calisanlarMiniProje;

public class Yonetici extends Calisanlar{
    private int zamMiktari;
    private String sirketAdi = "JAVA";


    public Yonetici(String isim, String soyIsim, int id, String telNo, int zamMiktari) {
        super(isim, soyIsim, id, telNo);
        this.zamMiktari= zamMiktari;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(sirketAdi+" sirketinin yoneticisi");
    }

    public void zamYap(int zamMiktari){
        Yazilimci zamYapilacak = new Yazilimci("Mehmet","BULUTLUOZ",101,"+90 123 456 7890","Java, Selenyum");
        System.out.println(zamYapilacak.getIsim()+" kisisine $"+zamMiktari +"zam yapildi");
    }



}
