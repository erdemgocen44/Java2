package _98_Projects.DersKrediProje.Dersler;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.ArrayList;

public class Statistik extends DerslerClass {
    private ArrayList<String> topList =new ArrayList<>();

    public Statistik(OgrenciClass ogr1) throws Exception{
        super(ogr1);
    }

    @Override
    public ArrayList<String> topL(){
        topList.add("Statistik 2");
        topList.add("Statistik 3");
        topList.add("Statistik 4");

        return topList;
    }
}
