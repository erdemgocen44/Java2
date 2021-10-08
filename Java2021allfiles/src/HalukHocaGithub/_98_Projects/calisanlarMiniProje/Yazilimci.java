package _98_Projects.calisanlarMiniProje;

public class Yazilimci extends Calisanlar{


    private String bildigiDiller;

    public Yazilimci(String isim, String soyIsim, int id, String telNo, String bildigiDiller) {
        super(isim, soyIsim, id, telNo);
        this.bildigiDiller=bildigiDiller;
    }

    public void kodYaz(String bilgisayar){
        System.out.println("Kod yazmaniz icin size "+ bilgisayar+" alindi\nKod yazmaya baslayabilirsin");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Developer'in bildigi diller --> "+ bildigiDiller);
    }
}
