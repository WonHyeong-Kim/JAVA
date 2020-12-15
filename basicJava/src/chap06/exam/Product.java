package chap06.exam;

public class Product {
	private static int productCode;
	private static int productCost;
	private static int numOfPack;
	private static int numOfProduct;
	
	public Product() {
		
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	
	public int getNumOfProduct() {
		return numOfProduct;
	}
	public void setNumOfProduct(int numOfProduct) {
		this.numOfProduct = numOfProduct;
	}
	
	public int getNumOfPack() {
		return numOfPack;
	}
	public void setNumOfPack(int numOfPack) {
		this.numOfPack = numOfPack;
	}
	
}
