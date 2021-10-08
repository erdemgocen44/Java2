package _98_Projects.calisanlarMiniProje;

public class Calisanlar {



    private String isim;
    private String soyIsim;
    private int id;
    private String telNo;

    public Calisanlar(String isim, String soyIsim,int id,String telNo) {
        this.isim = isim;
        this.soyIsim=soyIsim;
        this.id=id;
        this.telNo=telNo;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }


    public void bilgileriGoster(){
        System.out.println("Isim --> "+ getIsim());
        System.out.println("Soyisim --> "+ getSoyIsim());
        System.out.println("ID --> "+ getId());
        System.out.println("Telefon numarasi --> "+ getTelNo());

    }




}
