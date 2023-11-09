package com.sgtesting.secondPartJava;
/*
 * Create a class for product,orders,items and execute each class members
 */
class Product 
{
	String productName;
	String productBrand;
	String productDimensions;
	String ProductWarranty;	

}
class Orders
{
	String OrderStatus;
	String ShipTO;
	int orderid;
	Long orderTotalAmount;
}
class Items
{
	String Nameoftheitem;
	int itemCost;
	boolean retruavailble;

}
public class DemoTwo {

	public static void main(String[] args) {
		Product pdt=new Product();
		pdt.productName="Wall Clock";
		pdt.productBrand="Titan";
		pdt.productDimensions="30W x 30H Centimeters";
		pdt.ProductWarranty="5 Years";
		Orders ord=new Orders();
		ord.orderid=4567;
		ord.OrderStatus="Delivered";
		ord.orderTotalAmount= (long) 5000;
		ord.ShipTO="Divya";
		Items itm =new Items();
		itm.itemCost=50;
		itm.Nameoftheitem="Amazfit Pop 3S Smart Watch";
		itm.retruavailble=true;
		System.out.println("Product Name:"+pdt.productName);
		System.out.println("Product Brand name:"+pdt.productBrand);
		System.out.println("Product Dimension:"+pdt.productDimensions);
		System.out.println("Product Warranty:"+pdt.ProductWarranty);
		System.out.println("+++++++++++");
		System.out.println("orderId:"+ord.orderid);
		System.out.println("Order Status:"+ord.OrderStatus);
		System.out.println("Order Total amount:"+ord.orderTotalAmount);
		System.out.println("Order Ship To:"+ord.ShipTO);
		System.out.println("+++++++++++");
		System.out.println("Item Cost:"+itm.itemCost);
		System.out.println("item returnavailable:"+itm.retruavailble);
		System.out.println("Name of the item:"+itm.Nameoftheitem);

	}

}
