package sec10;

public class SlimeMian {

	public static void main(String[] args) {
		Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        slime2.attack(slime1);
        System.out.println(slime1.hp);
        System.out.println(slime1.attack);
        System.out.println(slime1.defense);
        
        slime1.attack(slime1);
        System.out.println(slime2.hp);
        System.out.println(slime2.attack);
        System.out.println(slime2.defense);
        
        System.out.println(slime1);
        System.out.println(slime2);
        
	}

}
