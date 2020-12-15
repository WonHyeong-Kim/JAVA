package chap06.exam;
import java.util.Scanner;

public class Purchase {
	// TODO : 멤버 변수를 선언합니다. (nameOfProduct, totalStockOfPack)

	public static void main(String[] args) throws Exception {
		Purchase purchase = new Purchase();

		Product product = purchase.getProduct();
		double totalPrice = purchase.calcTotalPrice(product);

		StringBuffer sb = new StringBuffer();
		// TODO : 프린트할 결과 문장을 변수 sb에 append 합니다.
		if(totalPrice == -1) {
			sb.append("재고가 없어 "+product.getNumOfPack()+"개의 "+nameOfProduct[product.getProductCode()-1]+" 상품팩에 대한 구매가 불가합니다. 죄송합니다.");
		}
		else {
			sb.append(product.getNumOfPack()+"개의 "+nameOfProduct[product.getProductCode()-1]+" 상품팩을 구매하셨습니다.\n");
			sb.append(nameOfProduct[product.getProductCode()-1]+
					" 한 개의 가격은 "+Math.round(product.getProductCost()/product.getNumOfProduct())+"원이며, 지불해야 할 총 금액은 "+totalPrice+"원입니다.");
		}
		System.out.println(sb.toString());
	}
	private static int totalStockOfPack[] = {3,5,20,1};
	private static String[] nameOfProduct = {"사과","오렌지", "포도", "딸기"};

	public Product getProduct() throws Exception {
		// TODO : 사용자로부터 상품코드, 상품팩에 포함된 상품 개수, 상품팩 가격, 구매할 상품팩의 개수를 
                // 입력받아 Product 객체를 리턴합니다.
		Product newProduct = new Product();
		System.out.print("구매하려는 상품코드를 선택하세요.[1:사과, 2:오렌지, 3:포도, 4:딸기]?");
		Scanner key = new Scanner(System.in);
		int productCode = key.nextInt();
		if(productCode<1 | productCode>4) {
			key.close();
			throw new Exception("상품 코드를 잘못 입력하셨습니다.");
		}
		newProduct.setProductCode(productCode);
		
		System.out.print("상품팩에 포함된 상품의 개수, 상품팩의 가격을 순서대로 입력하세요(구분자:,)?");
		String[] numNCost = key.next().split(",");
		newProduct.setNumOfProduct(Integer.parseInt(numNCost[0]));
		newProduct.setProductCost(Integer.parseInt(numNCost[1]));
		
		System.out.print("구매하려는 상품팩의 개수를 입력하세요 ?");
		int numOfPack = key.nextInt();
		newProduct.setNumOfPack(numOfPack);
		key.close();
		return newProduct;
	}

	public double calcTotalPrice(Product product) throws Exception {
		// TODO : Product 객체로부터 필요한 정보를 추출하여 재고량을 체크하고, 지불해야 할 총 금액을 리턴합니다.
                // 재고량이 부족할 경우 -1을 리턴합니다.
		int code = product.getProductCode();
		int pack = product.getNumOfPack();
		int cost = product.getProductCost();
		if(totalStockOfPack[code-1]-pack>=0) {
			totalStockOfPack[code-1]-=pack;
			return  cost* pack;  
		}
		else {
			return -1;
		}
	}
}
