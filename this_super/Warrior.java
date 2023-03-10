package oop.this_super;
/** 
230306 
 */

public class Warrior extends Player{
	int rage;

	Warrior(String name){
		//모든 생성자에는 super()가 내장되어 있다.
		//자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려줄 수가 있기 때문이다.
		super(name);
		this.name = name;
		this.rage = 60;
	}
	
	@Override   //오버라이드 문법 맞는지 확인해주는 기능이 있는 주석 alt+shift+s
	//override/implement methods
	void characterInfo() {
		super.characterInfo();
		System.out.println("#분노: " + rage);
	}
	
}
