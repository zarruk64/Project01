package CharacterCreation;

import java.util.ArrayList;
import java.lang.Math;

public class EnergySelection {
    /*import numpy as np
import Randomizers

enegryPrcnt = {
"Aura": 27,
"Mana": 27,
"Qi": 27,
"Two": 5,
"Three": 2,
"None": 12
}
energyLst = []
different = ["Two","Three"]

for energy in enegryPrcnt.keys():
    for type in range(enegryPrcnt[energy]):
        energyLst.append(energy)

energyLst = Randomizers.randomize(energyLst)

def getEnergy():
    charEnergy = energyLst[np.random.randint(0,100)]
    ltEnergy = []
    if charEnergy in different:
        cant = 0
        if charEnergy == "Two":
            cant = 2
        else:
            cant = 3
        while len(ltEnergy) != cant:
            ener = energyLst[np.random.randint(0,100)]
            if ener not in different and ener != "None":
                if ener not in ltEnergy:
                    ltEnergy.append(ener)
    else:
        ltEnergy.append(charEnergy)
    return ltEnergy */

    private static String[] energyType = {"Aura", "Mana", "Qi", "Two", "Three", "None"};
    private static int[] enegryPrcnt = {27, 27, 27, 5, 2, 12};
    private static String[] different = {"Two", "Three", "None"};
    private static ArrayList<String> energyList = new ArrayList<String>();
    
    public static void fillList() {
        for (int type = 0; type < energyType.length; type++){
            for (int time = 0; time < enegryPrcnt[type]; time++){
                energyList.add(energyType[type]);
            }
        }
    }

    public static ArrayList<String> getEnergy() {
        fillList();
        energyList = Randomizer.random1(energyList);
        //TO DO: Randomize (Missing randomizer)
        int random = (int)Math.floor(Math.random() * (100));
        String energy = energyList.get(random);
        ArrayList<String> energyLt = new ArrayList<String>();
        //TO DO: Get energies if 'Two' or 'Three'
        int cant = 0;
        if (energy == different[0])
            cant = 2;
        else if (energy == different[1])
            cant = 3;
        else {
            energyLt.add(energy);
        }
        for (int i = 0; i < cant; i++) {
            energy = energyList.get(random);
            if (energy != different[0] && energy != different[1] && energy != different[2])
                energyLt.add(energy);
        }
        return energyLt;
    }

    public static void main(String[] args) {
        getEnergy();
    }
}
