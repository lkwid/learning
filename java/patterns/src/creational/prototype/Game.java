package creational.prototype;

public class Game implements Cloneable {
	
	private int id;
	private String name;
	private Membership membership;
	
	
	/**
	 * Deep clone concept based on built-in clone.
	 * @return New instance of Membership
	 */
	@Override
	protected Game clone() throws CloneNotSupportedException {
		Game game = (Game) super.clone();
		setMembership(new Membership());
		return game;
	}	
		
	@Override
	public String toString() {
		return String.format("ID: %d, name: %s, membership: %s", this.id, this.name, this.membership);
	}

	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}

	public final Membership getMembership() {
		return membership;
	}

	public final void setMembership(Membership membership) {
		this.membership = membership;
	}

}
