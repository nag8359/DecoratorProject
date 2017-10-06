/**
 * One of three upgraded ships that players can choose when they reach level
 * 10.  This ship is surrounded by an energy shield that absorbs all incoming
 * damage until the shield is depleted.
 *
 * Created by Bobby on 6/30/2017.
 */
public class Shield extends ShipUpgrade {

    private int shieldHitPoints;
	
    public Shield(Ship ship) {
    	super(ship);
        shieldHitPoints = 500;
    }
    public void deductHitPoints(int amount) {
        if(shieldHitPoints > amount) {
            // the shield absorbs all damage
            shieldHitPoints = shieldHitPoints - amount;
        }
        else if(shieldHitPoints > 0) {
            // the shield absorbs some damage and is depleted.  the remaining
            // damage is dealt to the ship itself.
            super.deductHitPoints(amount - shieldHitPoints);
            shieldHitPoints = 0;
        }
        else {
            // the shield is gone; full damage is dealt
            super.deductHitPoints(amount);
        }
    }

}
