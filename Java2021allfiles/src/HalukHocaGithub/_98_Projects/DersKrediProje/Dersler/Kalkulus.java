package _98_Projects.DersKrediProje.Dersler;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.ArrayList;

public class Kalkulus extends DerslerClass {
    private ArrayList<String> topList =new ArrayList<>();

    public Kalkulus(OgrenciClass ogr1) throws Exception{
        super(ogr1);
    }

    @Override
    public ArrayList<String> topL(){
        topList.add("Kalkulus 2");
        topList.add("Kalkulus 3");
        topList.add("Kalkulus 4");

        return topList;
    }
}
