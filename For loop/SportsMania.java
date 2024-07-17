class SportsMania{
 public static void main(String s[]){

  String iplTeams[]={"Royal Challengers Bengaluru", "Kolkata Knight Riders", "Rajasthan Royals", "Chennai Super Kings", "Sunrisers Hyderabad", "Lucknow Super Giants", "Delhi Capitals","Mumbai Indians", "Punjab Kings", "Gujarat Titans"};

  String topTenBatsMen[]={"Sachin Tendulkar", "Brian Lara", "Ricky Ponting", "Sir Isaac Vivian Alexander Richards", "Virat Kohli", "Kumar Chokshanada Sangakkara", "Sir Donald George Bradman", "Walter Reginald Hammond", "Sir John Berry Hobbs", "Sunil Gavaskar"};

  String topTenBowlers[]={"Muttiah Muralitharan", "Shane Warne", "Glenn McGrath", "Wasim Akram", "Brett Lee", "Shoaib Akhtar", "Dale Steyn", "Mitchell Starc", "Jasprit Bumrah", "Lasith Malinga"};

  String topTenIccTeams[]={"INDIA", "AUSTRALIA", "SOUTH AFRICA", "PAKISTAN", "NEW ZELAND", "ENGLAND", "SRI LANKA", "BANGLADESH", "AFGHANISTAN", "WEST INDIES"};

 System.out.println("Information about world top ten players and teams in cricket:");
 System.out.println("----------------------------------------------------------------------------------------------------------");

 System.out.println("Top ten IPL teams:");
 for(String iplTeam:iplTeams){
 System.out.println(iplTeam);}
 
 System.out.println("----------------------------------------------------------------------------------------------------------");
  
 System.out.println("World top ten Batsmen:");
 for(String men:topTenBatsMen){
 System.out.println(men);}
 
 System.out.println("----------------------------------------------------------------------------------------------------------");
 
 System.out.println("World top ten Bowlers:");
 for(String topTenBowler:topTenBowlers){
 System.out.println(topTenBowler);}
 
 System.out.println("----------------------------------------------------------------------------------------------------------");

 System.out.println("World top ten ICC teams:");
 for(String topTenIccTeam:topTenIccTeams){
 System.out.println(topTenIccTeam);}
 
 System.out.println("----------------------------------------------------------------------------------------------------------");

 
}
}  


  
 