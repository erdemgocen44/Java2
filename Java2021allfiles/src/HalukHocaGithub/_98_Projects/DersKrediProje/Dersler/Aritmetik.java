package _98_Projects.DersKrediProje.Dersler;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.ArrayList;

public class Aritmetik extends DerslerClass {
    private ArrayList<String> topList =new ArrayList<>();

    public Aritmetik (OgrenciClass ogr1) throws Exception{
        super(ogr1);
    }

    @Override
    public ArrayList<String> topL(){
        topList.add("Aritmetik 2");
        topList.add("Aritmetik 3");
        topList.add("Aritmetik 4");

        return topList;
    }
}
