package com.sgtesting.noargsconstructor;
/*
 * Create a class for product,orders,items and execute each class members
 */
class Product 
{
	String productName;
	String productBrand;
	String productDimensions;
	String ProductWarranty;	
	Product()
	{
		productName="Wall Clock";
		productBrand="Titan";
		productDimensions="30W x 30H Centimeters";
		ProductWarranty="5 Years";
		System.out.println("Product Name:"+productName);
		System.out.println("Product Brand name:"+productBrand);
		System.out.println("Product Dimension:"+productDimensions);
		System.out.println("Product Warranty:"+ProductWarranty);
		System.out.println("+++++++++++");
	}

}
class Orders
{
	String OrderStatus;
	String ShipTO;
	int orderid;
	Long orderTotalAmount;
	Orders()
	{
		orderid=4567;
		OrderStatus="Delivered";
		orderTotalAmount= (long) 5000;
		ShipTO="Divya";
		System.out.println("orderId:"+orderid);
		System.out.println("Order Status:"+OrderStatus);
		System.out.println("Order Total amount:"+orderTotalAmount);
		System.out.println("Order Ship To:"+ShipTO);
		System.out.println("+++++++++++");
	}
}
class Items
{
	String Nameoftheitem;
	int itemCost;
	boolean retruavailble;
	Items()
	{
		itemCost=50;
		Nameoftheitem="Amazfit Pop 3S Smart Watch";
		retruavailble=true;
		System.out.println("Item Cost:"+itemCost);
		System.out.println("item returnavailable:"+retruavailble);
		System.out.println("Name of the item:"+Nameoftheitem);

	}

}
public class DemoTwo {

	public static void main(String[] args) {
		Product pdt=new Product();
		Orders ord=new Orders();
		Items itm =new Items();
	}

}
