class ShampooRunner{
 
  public static void main(String s[]){
   Shampoo ref = new Shampoo();
   
   int id= 8987;
   String brandName="Head and shoulder";
   double price=89.00;
   String type="Anti dandruf";
   String mgfDate="23/08/2022";
   String expDate="Use before 24 months of mgfDate";
   
   
   
   boolean isShampooAdded=ref.addShampoo(id,brandName,price,type,mgfDate,expDate);
   
   if (isShampooAdded) {
            System.out.println("Product added successfully.");
            ref.displayShampooDetails();
        } else {
            System.out.println("Failed to add. Please check the input values.");
        }
   }
  } 