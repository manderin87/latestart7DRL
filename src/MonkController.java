
public class MonkController extends HeroController {

    public MonkController(Creature c, PathFinder pf) {
        super(c, pf);
    }

    @Override
    public void greet(Creature other){
        target.tell(other, "Hello.");
    }

    @Override
    public void regreet(Creature other){
        target.tellNearby("Glad you're still not a zombie " + other.personalName + ".");
    }

    @Override
    public void onTakeDamage(int amount){
        if (target.hp < target.maxHp / 2
                && rand.nextDouble() < 0.1)
            healSelf();
    }

    @Override
    public void onLowHealth(){
        if (Math.random() < 0.5) {
            healSelf();
        } else {
            target.tellNearby("I need some healing!");
        }
    }

    @Override
    public void onDied(){
        target.tellNearby("Farewell earthly body!");
    }

    @Override
    public void onInflictDamage(Creature other, int damage){
        double r = Math.random();

        if (r < 0.01)
            target.tellNearby("Judo chop!");
        else if (r < 0.05)
            target.tellNearby("Takedown!");
        else if (r < 0.10)
            target.tellNearby("Hiyah!");
        else if (r < 0.15)
            target.tellNearby("Iron Fist!");
        else if (r < 0.20)
            target.tellNearby("Iron Foot!");
        else if (r < 0.25)
            target.tellNearby("Flying armbar!");
        else if (rand.nextDouble() < 0.1)
            quickAttack(other);
    }

    @Override
    public void onKilled(Creature other){
        if (rand.nextDouble() < 0.33)
            target.tellNearby("Victory!");
    }

    @Override
    public void onDecapitated(Creature other){
    }

    @Override
    public void onCounterAttacked(Creature other){
    }

    @Override
    public void onKnockback(int distance){
    }
    


    private void healSelf(){
        target.doAction("draws on inner power");

        target.hp += 5 + rand.nextInt(6);

        if (target.hp > target.maxHp)
            target.maxHp = target.hp;
    }

    private void quickAttack(Creature other){
        target.doAction("attacks quickly");
        target.attack(other);
    }
}