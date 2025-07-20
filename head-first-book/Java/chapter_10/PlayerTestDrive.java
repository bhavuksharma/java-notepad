class Player{
    static int valueCount;
    private String name;

    Player(String n){
        name = n;
        valueCount++;
    }
}

public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.valueCount);
        Player p = new Player("Billy");
        System.out.println(Player.valueCount);
    }
}
