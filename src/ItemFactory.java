
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
        Item armor = new Item(0,0,"wizard robes",']',AsciiPanel.white);
        armor.modDefence = 2;
        return armor;
    }

    public Item unholyRobes(){
        Item armor = new Item(0,0,"unholy robes",']',AsciiPanel.brightBlack);
        armor.modHp = rand.nextInt(11);
        armor.modAttack = 2;
        armor.modDefence = 2;
        return armor;
    }

    public Item unholyArmor(){
        Item armor = new Item(0,0,"unholy armor",']',AsciiPanel.brightBlack);
        armor.modHp = rand.nextInt(11);
        armor.modAttack = 5;
        armor.modDefence = 5;
        return armor;
    }

    public Item holyArmor(){
        Item armor = new Item(0,0,"unholy armor",']',AsciiPanel.brightBlack);
        armor.modHp = rand.nextInt(11);
        armor.modAttack = 0;
        armor.modDefence = 10;
        return armor;
    }

    public Item lightArmor(){
        Item armor = new Item(0,0,"light armor",']',AsciiPanel.white);
        armor.modAttack = -1;
        armor.modDefence = 4 + rand.nextInt(5);
        return armor;
    }

    public Item mediumArmor(){
        Item armor = new Item(0,0,"medium armor",']',AsciiPanel.white);
        armor.modAttack = -2;
        armor.modDefence = 6 + rand.nextInt(5);
        return armor;
    }

    public Item heavyArmor(){
        Item armor = new Item(0,0,"heavy armor",']',AsciiPanel.white);
        armor.modAttack = -3;
        armor.modDefence = 8 + rand.nextInt(5);
        return armor;
    }

    public Item weapon(){
        switch (rand.nextInt(3)){
            case 0: return sword();
            case 1: return spear();
            default: return mace();
        }
    }

    public Item mrPointy(){
        Item weapon = new Item(0,0,"wooden stake",')',AsciiPanel.white);
        weapon.modAttack = 5 + rand.nextInt(6);
        weapon.modDefence = 5 + rand.nextInt(6);
        weapon.doesKillVampires = true;
        return weapon;
    }

    public Item lichStaff(){
        Item weapon = new Item(0,0,"skull staff",')',AsciiPanel.white);
        weapon.modHp = + 10;
        weapon.modAttack = 5 + rand.nextInt(6);
        weapon.modDefence = 5 + rand.nextInt(6);
        return weapon;
    }
    
    public Item katana(){
        Item weapon = new Item(0,0,"katana",')',AsciiPanel.white);
        weapon.modAttack = 15 + rand.nextInt(6);
        weapon.modDefence = 5 + rand.nextInt(6);
        weapon.doesDecapitate = true;
        return weapon;
    }

    public Item sword(){
        Item weapon = new Item(0,0,"sword",')',AsciiPanel.white);
        weapon.modAttack = 10 + rand.nextInt(11);
        weapon.modDefence = 5 + rand.nextInt(6);
        weapon.doesDecapitate = true;
        return weapon;
    }

    public Item spear(){
        Item weapon = new Item(0,0,"spear",')',AsciiPanel.white);
        weapon.modAttack = 10 + rand.nextInt(6);
        weapon.modDefence = 5 + rand.nextInt(11);
        weapon.doesDefensiveAttack = true;
        return weapon;
    }

    public Item mace(){
        Item weapon = new Item(0,0,"mace",')',AsciiPanel.white);
        weapon.modAttack = 15 + rand.nextInt(11);
        weapon.modDefence = 1 + rand.nextInt(5);
        weapon.doesKnockback = true;
        return weapon;
    }
}
