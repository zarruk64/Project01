import numpy as np
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
    return ltEnergy