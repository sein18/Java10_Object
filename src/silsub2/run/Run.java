package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pd = new Product();
		pd.setpName("������");
		pd.setPrice(120);
		pd.setBrand("���");
		
		System.out.println(pd.information());
	}

}
