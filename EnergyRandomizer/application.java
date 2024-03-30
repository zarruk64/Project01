import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import CharacterCreation.Character;
import CharacterCreation.EnergySelection;

public class application {
    /*running = True

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
        running = False */
    
    public int mainMenu() {
        System.out.println("1. Create character");
        System.out.println("2. Exit");
        int option = Integer.parseInt(input("Select an option"));
        return option;
    }

    public void creation() {
        String name = input("Write the name of your charater\n");
        String sex = input("Choose the sex of your character (M/F)");
        ArrayList<String> energy = EnergySelection.getEnergy();
        Character player = new Character(name, sex, energy);
        System.out.println("Your energy affinity is " + player.getEnergy());
    }

    public String input(String mensaje){
		try {
			System.out.print(mensaje + ":\n");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e){
			System.out.println("There was a mistake reading the console");
			e.printStackTrace();
		}
		return null;
	}
        public static void main(String[] args) {
        boolean running = true;
        while (running) {
            int opt = 0;
            if (opt == 1){

            }
        }
    }
}
