class Shampoo{

  int id;
  String brandName;
  double price;
  String type;
  String mgfDate;
  String expDate;
  
  
  public boolean addShampoo(int id,String brandName,double price,String type,String mgfDate,String expDate){
	  
	  boolean isShampooAdded=false;
	  if(id>0){
		  this.id=id;
		  this.brandName=brandName;
		  this.price=price;
		  this.type=type;
		  this.mgfDate=mgfDate;
		  this.expDate=expDate;
		  isShampooAdded=true;
	  }
	  return isShampooAdded;
    }  
	
	public void displayShampooDetails(){
		System.out.println("Shampoo Id:"+this.id);
		System.out.println("Brand name:"+this.brandName);
		System.out.println("Price:"+this.price);
		System.out.println("Type:"+this.type);
		System.out.println("Manufactured date:"+this.mgfDate);
		System.out.println("Expairy date:"+this.expDate);
	}
	    
  }