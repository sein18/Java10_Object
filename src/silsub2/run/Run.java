package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pd = new Product();
		pd.setpName("아이폰");
		pd.setPrice(120);
		pd.setBrand("사과");
		
		System.out.println(pd.information());
	}

}
