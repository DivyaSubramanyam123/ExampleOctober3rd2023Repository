package com.sgtesting.ParameterizedConstructor;
/*
 * Create a class for product,orders,items and execute each class members
 */
class Product 
{
	String productName;
	String productBrand;
	String productDimensions;
	String ProductWarranty;	
	Product(String pdn,String pdbrand,String pddimension,String pdwarranty)
	{
		productName=pdn;
		productBrand=pdbrand;
		productDimensions=pddimension;
		ProductWarranty=pdwarranty;
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
	Orders(String orderS,String Shipping,int id,Long tamt)
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
	Items(String itemn,int itemc,boolean returnval)
	{
		itemCost=itemc;
		Nameoftheitem=itemn;
		retruavailble=returnval;
		System.out.println("Item Cost:"+itemCost);
		System.out.println("item returnavailable:"+retruavailble);
		System.out.println("Name of the item:"+Nameoftheitem);

	}

}
public class DemoTwo {

	public static void main(String[] args) {
		Product pdt=new Product("Wall Clock", "Titan", "30W x 30H Centimeters", "5 Years");
		Orders ord=new Orders("Delivered","Delivered" , 4567, (long) 5000);
		Items itm =new Items("Amazfit Pop 3S Smart Watch",50, true);
	}

}
