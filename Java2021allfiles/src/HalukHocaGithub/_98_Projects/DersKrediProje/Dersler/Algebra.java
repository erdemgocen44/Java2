package _98_Projects.DersKrediProje.Dersler;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.ArrayList;

public class Algebra extends DerslerClass {
    private ArrayList<String> topList =new ArrayList<>();

    public Algebra (OgrenciClass ogr1) throws Exception{
        super(ogr1);
    }

    @Override
    public ArrayList<String> topL(){
        topList.add("Algebra 2");
        topList.add("Algebra 3");
        topList.add("Algebra 4");

        return topList;
    }


}
