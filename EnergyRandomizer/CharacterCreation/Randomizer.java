package CharacterCreation;

import java.util.ArrayList;
import java.util.Iterator;

public class Randomizer {
    public static ArrayList<String> random1(ArrayList<String> lt) {
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

    /*def random0(lt)->list:
    lista = lt
    times = np.random.randint(1,31)
    start = np.random.randint(0,50)
    end = np.random.randint(start+1,100)
    if times > 1:
        lista = lista[::-1]
        times -= 1
    lista = lista[start:end] + lista[:start] + lista[end:]
    while times >= 1:
        start = np.random.randint(0,50)
        end = np.random.randint(start,100)
        reverse = np.random.randint(0,2)
        int clase = (int)Math.floor(Math.random() * (2));
        if reverse:
            lista = lista[::-1]
        if times >=25:
            lista = lista[end:] + lista[:start] + lista[start:end]
        elif times >=17:
            lista = lista[end:] + lista[start:end] + lista[:start]
        elif times >=10:
            lista = lista[:start] + lista[end:] + lista[start:end]
        elif times >=3:
            lista = lista[start:end] + lista[end:] + lista[:start]
        else:
            lista = lista[start:end] + lista[:start] + lista[end:]
        times -= 1
    return lista */

    public static ArrayList<String> random0(ArrayList<String> lt) {
        
        return lt;
    }
    //int clase = (int)Math.floor(Math.random() * (max - min + 1) + min);
}
