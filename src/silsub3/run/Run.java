package silsub3.run;

import java.util.Scanner;
import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է�: ");
		
		c.setRadius(sc.nextInt());
		System.out.println("���� �ѷ�: "+ 2*c.PI*c.getRadius()+", ���� ����: "+c.PI*c.getRadius()*c.getRadius());
		
		c.incrementRadius();
		System.out.println("������ ���� �ѷ�: "+ 2*c.PI*c.getRadius()+", ������ ���� ����: "+c.PI*c.getRadius()*c.getRadius());
		
	}

}
