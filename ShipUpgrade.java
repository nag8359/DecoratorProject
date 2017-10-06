
public abstract class ShipUpgrade implements Ship {
	private Ship ship;
	
    public ShipUpgrade(Ship ship) {
        this.ship = ship;
    }
    public void deductHitPoints(int amount) {
        ship.deductHitPoints(amount);
    }

	public String getName() {
		return ship.getName();
	}

	public int getTotalHitPoints() {
		return ship.getTotalHitPoints();
	}

	public int getCurrentHitPoints() {
		return ship.getCurrentHitPoints();
	}

	public int getDamage() {
		return ship.getDamage();
	}

	public void underAttack(SpaceShip attacker) {
		ship.underAttack(attacker);
	}

	public boolean isDestroyed() {
		return ship.isDestroyed();
	}
}
