package silsub3.run;

import java.util.Scanner;
import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 입력: ");
		
		c.setRadius(sc.nextInt());
		System.out.println("원의 둘레: "+ 2*c.PI*c.getRadius()+", 원의 넓이: "+c.PI*c.getRadius()*c.getRadius());
		
		c.incrementRadius();
		System.out.println("증가한 원의 둘레: "+ 2*c.PI*c.getRadius()+", 증가한 원의 넓이: "+c.PI*c.getRadius()*c.getRadius());
		
	}

}
