package _98_Projects.DersKrediProje.Data;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.LinkedHashMap;

public class OgrenciData {

    private LinkedHashMap<String,String> UsernameAndPass = new LinkedHashMap<>();

    public OgrenciData() {
        EkleUservePassword();
    }

    public LinkedHashMap<String,String> EkleUservePassword(){
        UsernameAndPass.put("Alper","Alp123");
        UsernameAndPass.put("Aslan","Aslan12345");
        UsernameAndPass.put("Kartal","Kar123");
        UsernameAndPass.put("Emily","Emily123");
        UsernameAndPass.put("Stephanie","Stephanie123");

        return UsernameAndPass;
    }


}
