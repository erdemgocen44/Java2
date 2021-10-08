package _98_Projects.DersKrediProje.Dersler;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.ArrayList;

public class Trigonametri extends DerslerClass {
    private ArrayList<String> topList =new ArrayList<>();

    public Trigonametri(OgrenciClass ogr1) throws Exception{
        super(ogr1);
    }

    @Override
    public ArrayList<String> topL(){
        topList.add("Trigonametri 2");
        topList.add("Trigonametri 3");
        topList.add("Trigonametri 4");

        return topList;
    }
}
