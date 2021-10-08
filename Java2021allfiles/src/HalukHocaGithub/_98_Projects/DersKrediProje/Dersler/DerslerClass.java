package _98_Projects.DersKrediProje.Dersler;

import _98_Projects.DersKrediProje.Ogrenci.OgrenciClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class DerslerClass {
    private static int totalKredi;
    private LinkedHashMap<String,Integer> klassVeKredi =new LinkedHashMap<>();

    private OgrenciClass ogr1;

    public abstract ArrayList<String> topL();

    public DerslerClass (OgrenciClass ogr1) throws Exception{
        this.ogr1=ogr1;
        setCrediS();
    }

    public void setCrediS() throws Exception{
        ArrayList<String> derslerinIsmi =new ArrayList<>();
        Scanner scan =new Scanner(System.in);

        while (totalKredi<=14) {
            System.out.println("Hangi Dersleri almak istersiniz : Algebra, Aritmetik, Statistik, Kalkulus, Trigonometri ");
            System.out.println(totalKredi);

            String dersAdi = scan.nextLine();
            if (dersAdi.contains(dersAdi)){
                System.out.println("Bu dersi zaten aldınız lütfen baska bir ders secınız");
            }else {
                derslerinIsmi.add(dersAdi);
                totalKredi+=kontrolKredi(dersAdi);
            }

        }
    }

      public int kontrolKredi (String dersinAdi ) throws Exception{
        if (dersinAdi.equalsIgnoreCase("Algebra")){
            klassVeKredi.put(dersinAdi,RandonNo());
            return 5;
        } if (dersinAdi.equalsIgnoreCase("Aritmetik")){
              klassVeKredi.put(dersinAdi,RandonNo());
              return 4;
          } if (dersinAdi.equalsIgnoreCase("Kalkulus")){
              klassVeKredi.put(dersinAdi,RandonNo());
              return 7;
          } if (dersinAdi.equalsIgnoreCase("Statistik")){
              klassVeKredi.put(dersinAdi,RandonNo());
              return 4;
          } if (dersinAdi.equalsIgnoreCase("Trigonometri")){
              klassVeKredi.put(dersinAdi,RandonNo());
              return 5;
          }
        else throw new Exception("Sectiğiniz ders adınız gecerli bir ders adı değildir");


      }

      public int RandonNo (){
        return (int) (Math.random()*100+1);
      }

      public LinkedHashMap<String, Integer> getKlassVeKredi(){
        return klassVeKredi;
      }



}
