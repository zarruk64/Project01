package CharacterCreation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Randomizer {
    private static ArrayList<String> reverseLst(ArrayList<String> lt) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int index = lt.size()-1; index >= 0; index--){
            lista.add(lt.get(index));
        }
        return lista;
    }

    private static ArrayList<String> joinLists(List<String> lt0, List<String> lt1, List<String> lt2) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int index = 0; index < lt0.size(); index++){
            lista.add(lt0.get(index));
        }
        for (int index = 0; index < lt1.size(); index++){
            lista.add(lt1.get(index));
        }
        for (int index = 0; index < lt2.size(); index++){
            lista.add(lt2.get(index));
        }
        return lista;
    }

    private static ArrayList<String> changeList(ArrayList<String> lista, int start, int end, int time) {
        List<String> lista0 = (List<String>)lista.subList(0, start);
        List<String> lista1 = lista.subList(start, end);
        List<String> lista2 = lista.subList(end, lista.size()-1);
        lista.clear();
        if (time >=25){
            lista = joinLists(lista2, lista0, lista1);
        }else if (time >=17){
            lista = joinLists(lista2, lista1, lista0);
        }else if (time >=10){
            lista = joinLists(lista0, lista2, lista1);
        }else if (time >=3){
            lista = joinLists(lista1, lista2, lista0);
        }else {
            lista = joinLists(lista1, lista0, lista2);
        }
        return lista;
    }

    private static ArrayList<String> random1(ArrayList<String> lt) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<String> listaRandom = new ArrayList<String>();
        while (lista.size() < lt.size()) {
            int pos = (int)Math.floor(Math.random() * (100));
            boolean esta = false;
            Iterator<Integer> iterator = lista.iterator();
            while (iterator.hasNext()) {
                int index = iterator.next();
                if (pos == index)
                    esta = true;
            }
            if (!esta)
                lista.add(pos);
        }
        int clase = (int)Math.floor(Math.random() * (2));
        if (clase == 1) {
            for (int i = 0; i < 100; i++) {
                listaRandom.add("");
            }
            for (int indice = 0; indice < lista.size(); indice++) {
                listaRandom.set(indice, String.valueOf(lt.get(lista.get(indice))));
            }
        } else {
            for (int indice = 0; indice < lista.size(); indice++) {
                listaRandom.add(String.valueOf(lt.get(lista.indexOf(indice))));
            }
        }
        return listaRandom;
    }

    private static ArrayList<String> random0(ArrayList<String> lt) {
        ArrayList<String> lista = lt;
        int times = (int)Math.floor(Math.random() * (31) + 1);
        if (times > 1){
            lista = reverseLst(lista);
            times -= 1;
        }
        int start = (int)Math.floor(Math.random() * (51));
        int end = (int)Math.floor(Math.random() * (100 - (start + 1) + 1) + (start + 1));
        lista = changeList(lista, start, end, times);
        while (times >= 1) {
            int reverse = (int)Math.floor(Math.random() * (2));
            if (reverse == 1){
                lista = reverseLst(lista);
            }
            start = (int)Math.floor(Math.random() * (51));
            end = (int)Math.floor(Math.random() * (100 - (start + 1) + 1) + (start + 1));
            lista = changeList(lista, start, end, times);
        }
        return lt;
    }
    
    public static ArrayList<String> randomize(ArrayList<String> lt) {
        ArrayList<String> lista = lt;
        lista = random0(lista);
        lista = random1(lista);
        return lista;
    }
}
