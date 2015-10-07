package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		/**implement here**/ 
		
		discount = 0; //생성자로 초기화
		
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** implement here **/ 
		
		setName(theName); setPrice(thePrice); setDiscount(theDiscount);
		
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** implement here **/ 
		
		if(originalObject==null){
			System.out.println("input errer");
			System.exit(0);
		}
		
		else{
			setName(originalObject.getName());
			setPrice(originalObject.getPrice());
			setDiscount(originalObject.discount);
		}
		
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		/** implement here **/ 
		
		double compute_bill=0;
		compute_bill=( getPrice() * ( (100-discount)*0.01 ) );
		
		return compute_bill;
		
	}
	
	public double getDiscount() {
		/** implement here **/ 
		
		//discount is always nonnegative
		if(discount<0){
			System.out.println("discount is negative");
			System.exit(0); }
		
		return discount;
		
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** implement here**/ 
		
		if(newDiscount >= 0){ //discount is always nonnegative
			discount = newDiscount;}
		else{
			System.out.println("discount is negative");
			System.exit(0);
		}
		
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		/** implement here **/ 
		
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			Sale otherSale = (Sale) otherObject;
			return (getName().equals(otherSale.getName()) && (getPrice() == otherSale.getPrice()));
		}
		
	}
	
	
	public DiscountSale clone() {
		/** implement here 임시생성자 사용 **/ 
		
		return new DiscountSale(this);
		
	}
}
