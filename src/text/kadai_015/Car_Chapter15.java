package text.kadai_015;

public class Car_Chapter15 {	
	// 内部データ
	private int gear = 1; // ギア　1～5速を表す
	private int speed = 10;// ギアチェンジ後の速度を表す
	
//	初期化
	public Car_Chapter15() {
		
	}
	
//	ギアの値により速度を変える
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		switch(afterGear) {
		case 1  -> this.speed = 10;
		case 2  -> this.speed = 20;
		case 3  -> this.speed = 30;
		case 4  -> this.speed = 40;
		case 5  -> this.speed = 50;
		default -> this.speed = 10;
		}
	}
	
//	ギアチェンジ後の速度を表示
	public void run() {
		System.out.println("ギア：" + this.gear + "　速度：" + this.speed);
	}
		
}


