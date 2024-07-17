class PenRunner{
    
  public static void main(String factory[]){
   
   //className ref = new className(); 
   Pen ref=new Pen();
   //ref.refName=value;
   ref.penBrand="Butterflow";
   ref.id=1;
   ref.color="Blue";
   ref.price=20.00;
   
   System.out.println("Pen brand: "+ref.penBrand);
   System.out.println("Pen color: "+ref.color);
  
   }
  }