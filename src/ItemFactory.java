
import java.util.Random;


public class ItemFactory {
    Random rand;

    public ItemFactory() {
        rand = new Random();
    }

    public Item armor(){
        switch (rand.nextInt(3)){
            case 0: return lightArmor();
            case 1: return mediumArmor();
            default: return heavyArmor();
        }
    }

    public Item robes(){
        Item armor = new Item(0,0,"robes",']',AsciiPanel.white);
        armor.modDefence = 2;
        return armor;
    }

    public Item lightArmor(){
        Item armor = new Item(0,0,"light armor",']',AsciiPanel.white);
        armor.modAttack = -1;
        armor.modDefence = 5 + rand.nextInt(5);
        return armor;
    }

    public Item mediumArmor(){
        Item armor = new Item(0,0,"medium armor",']',AsciiPanel.white);
        armor.modAttack = -1;
        armor.modDefence = 10 + rand.nextInt(5);
        return armor;
    }

    public Item heavyArmor(){
        Item armor = new Item(0,0,"heavy armor",']',AsciiPanel.white);
        armor.modAttack = -3;
        armor.modDefence = 15 + rand.nextInt(5);
        return armor;
    }

    public Item weapon(){
        switch (rand.nextInt(4)){
            case 0: return sword();
            case 1: return spear();
            case 2: return club();
            default: return mace();
        }
    }

    public Item knife(){
        Item weapon = new Item(0,0,"knife",')',AsciiPanel.white);
        weapon.modAttack = 1 + rand.nextInt(4);
        weapon.modDefence = 1 + rand.nextInt(4);
        return weapon;
    }

    public Item sword(){
        Item weapon = new Item(0,0,"sword",')',AsciiPanel.white);
        weapon.modAttack = 5 + rand.nextInt(5);
        weapon.modDefence = 5 + rand.nextInt(10);
        return weapon;
    }

    public Item spear(){
        Item weapon = new Item(0,0,"spear",')',AsciiPanel.white);
        weapon.modAttack = 5 + rand.nextInt(10);
        weapon.modDefence = 5 + rand.nextInt(5);
        return weapon;
    }

    public Item club(){
        Item weapon = new Item(0,0,"club",')',AsciiPanel.white);
        weapon.modAttack = 10 + rand.nextInt(10);
        weapon.modDefence = rand.nextInt(5);
        return weapon;
    }

    public Item mace(){
        Item weapon = new Item(0,0,"mace",')',AsciiPanel.white);
        weapon.modAttack = 10 + rand.nextInt(10);
        weapon.modDefence = rand.nextInt(5);
        return weapon;
    }
}
