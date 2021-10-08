package _98_Projects.DersKrediProje.Ogrenci;



import _98_Projects.DersKrediProje.Okul.OkulLokasyon;

import java.util.LinkedHashMap;

public class OgrenciClass extends OkulLokasyon {
    private String userName;
    private String password;
    private LinkedHashMap<String,Integer> klassVeKredi =new LinkedHashMap<>();

    public OgrenciClass(String userName, String password, String lokasyon) throws Exception{
        super(lokasyon);
        this.userName=userName;
        this.password=password;
        setUserNamevePass(userName,password);

    }

    public void setUserNamevePass(String userName, String password){


    }




}
