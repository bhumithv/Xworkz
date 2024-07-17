class Saree{
 
 public static void main(String s[])
 {

  String silkName="Banaras Silk";
  String silkName1="Mysore Silk";
  String silkName2="Kanchi Silk";
  String silkSarees[]={silkName, silkName1, silkName2};
  System.out.println("The silk sarees available are:"+silkSarees.length);
  for(String sName:silkSarees){
  System.out.println(sName);}

}
}