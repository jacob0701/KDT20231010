package ArrayList;

public class moreKeywords {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("장검", 1200 , 10);
		Weapon w2 = new Weapon();
		w1.printInfo();
		w2.printInfo();
	}
}

abstract class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Item() {
			this("이름 없음",-1);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class Weapon extends Item {
	protected int power;
	
	public Weapon(String name, int price, int power) {
		super(name, price);
		this.power = power;
	}

	public Weapon() {
		this("이름 없음",-1,-1);
	}
	
	public void printInfo() {
		System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n", getName(),getPrice(),this.power);
	}
	
}