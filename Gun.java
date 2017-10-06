/**
 * One of three upgraded ships that players can choose when they reach level
 * 10.  This ship does 50% more damage with its upgraded weapons.
 *
 * Created by Bobby on 6/30/2017.
 */
public class Gun extends ShipUpgrade {

	
    public Gun(Ship ship) {
    	super(ship);
    }

	@Override
	public int getDamage() {
		return (int)(super.getDamage() * 1.5);
	}

}
