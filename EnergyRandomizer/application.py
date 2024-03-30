import CharacterCreation.EnergySelection as ES

running = True

def mainMenu()->int:
    print("1. Create character")
    print("2. Exit")
    option = int(input("Select an option:\n"))
    return option

def creation():
    name = input("Write the name of your charater:\n")
    sex = input("Choose the sex of your character: (M/F)\n")
    energy = ES.getEnergy()
    strEnergy = ""
    for ener in energy:
        strEnergy += "'" + ener + "', "
    strEnergy = strEnergy[:len(strEnergy)-2]
    print("Your energy affinity is " + strEnergy)

while running:
    opt = mainMenu()
    if opt == 1:
        creation()
    if opt == 2:
        running = False