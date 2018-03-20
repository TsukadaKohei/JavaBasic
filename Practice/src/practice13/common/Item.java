package practice13.common;

public class Item {
	private String name;
	private int additionalDamage;

	public void setName(String name) {
		this.name=name;

	}
	public String getName() {
		return name;

	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage=additionalDamage;

	}
	public int getAdditionalDamage() {
		return additionalDamage;
	}




	 public Item(String name,int additionalDamage){
		this.name = name;

		this.additionalDamage = additionalDamage;
	}
}
