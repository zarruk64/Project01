import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import CharacterCreation.Character;
import CharacterCreation.EnergySelection;

public class application {
    public static int mainMenu() {
        System.out.println("1. Create character");
        System.out.println("2. Exit");
        int option = Integer.parseInt(input("Select an option"));
        return option;
    }

    public static void creation() {
        String name = input("Write the name of your charater");
        String sex = input("Choose the sex of your character (M/F)");
        ArrayList<String> energy = EnergySelection.getEnergy();
        Character player = new Character(name, sex, energy);
        System.out.println("Your energy affinity is " + player.getEnergy());
    }

    public static String input(String mensage){
		try {
			System.out.print(mensage + ":\n");
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
            int opt = mainMenu();
            if (opt == 1){
                creation();
            }
        }
    }
}