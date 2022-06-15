package com.animal;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        /**
        City деген класс тузунуз. (code, name, ...)
        Эгерде code так сан болсо TreeSetke салыныз.
                Аларды чонунан кичинесине караган тартипте чыгарыныз.
         */
        Set<City>cities=new HashSet<>();
        cities.add(new City(31,"Bishkek","Magistral","Yntymak"));
        cities.add(new City(44,"Jalal abad","Chapaev","Baichechekey"));
        cities.add(new City(11,"Kol","Sadyr","Kogultur"));
        cities.add(new City(77,"Naryn","Make","Naryn National Part"));
        cities.add(new City(37,"Talas","Fasol","Manas ordo"));
        cities.add(new City(17,"Batken","Batken","Aigul National Par"));
        cities.add(new City(77,"Osh","Absamat","Sulaiman too"));


        TreeSet<City>treeSet=new TreeSet<>(cities);
        for (City c:treeSet) {
          if (c.getCode()%2==1){
              treeSet.add(c);
              System.out.println(c);
          }

        }


    }
}
