package practice;

public class storeItem {
	
	private String description;
	private int units;
	private double price;
	
	//constructor
	public storeItem(String description,int units,double price)
	{
		this.description=description;
		this.units=units;
		this.price=price;
	}
	//setter
	public void setdescription(String description) {
		this.description=description;
	}
	
	public void setunits(int units) {
		this.units=units;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String getdescription() {
		return description;
	}
	public int getunits() {
		return units;
	}
	public double getprice() {
		return price;
	}
	
	public static boolean inStock(int units)
	{
		if(units>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			storeItem e1 = new storeItem("jacket", 9,670);
			storeItem e2 = new storeItem("pants", 0,690);
			
				// Employee 1
					System.out.println(e1.getdescription());
						System.out.println(e1.getprice());
						System.out.println("------");
						// Employee 2
						System.out.println(e2.getdescription());
						System.out.println(e2.getunits());

						System.out.println(e2.getprice());
						System.out.println("------");
						//after tax
						double jacketWithTax = e1.getprice() * 1.13;
						double pantsWithTax = e2.getprice() * 1.13;
					inStock(e1.getunits());
					System.out.println("jackets in 2"+inStock(e2.getunits()));
						System.out.println("jackets in 1"+inStock(e1.getunits()));
						// 1. Calculate the dollar values of the individual objects
								double jacketValue = e1.getunits() * e1.getprice();
								double pantsValue = e2.getunits() * e2.getprice();
								System.out.println("Dollar values: ");
									System.out.println("Jacket: $" + jacketValue);
										System.out.println("Pants: $" + pantsValue);
						;
				 	}
	}

	

