import java.io.*;
import java.util.Arrays;

public class GameCharacter implements Serializable{
    private final int power;
    private final String type;
    private final String[] weapons;

    public GameCharacter(int thePower, String theType, String[] weaponsArray){
        power = thePower;
        type  = theType;
        weapons = weaponsArray;
    }

    public int getPower(){
        return power;
    }

    public String getType(){
        return type;
    }

    public String getWeaponsArray(){
        return Arrays.toString(weapons);
    }
}
