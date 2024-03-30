package CharacterCreation;

import java.util.ArrayList;

public class Character {
    private String name;
    private String sex;
    private ArrayList<String> energy;

    public Character(String nombre, String sexo, ArrayList<String> energia) {
        name = nombre;
        sex = sexo;
        energy = energia;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEnergy() {
        String ener = "'";
        for (int i = 0; i <= energy.size(); i++){
            ener += energy.get(i) + "', '";
        }
        ener = ener.substring(0, ener.length()-2);
        return ener;
    }
}