class Netflix{
 public static void main(String n[]){
  
  String topTenMovies[]={"Hit Man", "Four Brothers", "Mission: Impossible-Dead Reckoning", "Mysteries of the Terracotta Warriors", "Safe House", "Ultraman: Rising", "How to Rob a Bank", "Atlas", "Home", "Wonder"};
 
  String englishMovies[]={"Dracula", "Spiderman: No way home", "Safe House", "Extraction ", "Extraction 2", "Venom: Let there be change", "Jason Bourne", "Madame Web", "Damsel","Fast Ans Furious 7","Bad Boys For Life", "The Equalizer 3", "Exodus: Gods and kings", "Red Notice", "Heart Of Stones", "Rush Hour 3", "Interstellar", "Lift", "The Mummy", "Beast", "Army Of Thieves", "Luther: The fallen sun", "Men In Black: International", "The Conjuring 2", "Lords Of The Ring"};

  String cartoonMovies[]={"The Angry Birds Movie", "The Angry Birds Movie 2", "Stuart Little", "Stuart Little 2", "Dora And The Lost City Of Gold", "The Monkey King", "Leo", "Ultraman: Rising", "Pokémon Detective Pikachu", "Peter Rabbit 2", "Madagascar", "The Casagrandes Movie", "Next Gen", "The Boss Baby", "DC League Of Supper-Pets"};
 
  String hindiSeries[]={"Heeramandi: The Diamond Bazaar", "The Great Indian Kapil Show", "Amar Singh Chamkila", "Mission Majnu", "Jaane Jaan", "The Railway Men-The Untold Story Of Bhopal 1984", "Chor Nikal Ke Bhaga", "Ginny Weds Sunny", "Ghoul", "Sacred Games", "Delhi Crime", "Missmatched", "House Of Secrets", "Indian Matchmaking", "Feels Like Ishq"};
  
  String kSeries[]={"Crash Landing on You", "Extraordinary Attorney Woo", "Squid Game", "Kingdom", "Hellbound", "Our Beloved Summer", "Boys Over Flowers", "A Killer Paradox", "Parasyte: The Grey", "The Glory", "Business Proposal", "All of Us Are Dead", "D.P.", "Twenty-Five Twenty-One", "It's Okay to Not Be Okay", "Hometown Cha-Cha-Cha", "Mr.Sunshine", "Sweet Home", "A Time Called You","Little Women"};

 System.out.println("Some movies and series recomendations to watch on Netflix:");
 
 System.out.println("----------------------------------------------------------------------------------------------------------");

   System.out.println("The top 10 movies on netflix are:");
   for(String topTenMovie:topTenMovies){
   System.out.println(topTenMovie);}

 
 System.out.println("----------------------------------------------------------------------------------------------------------");
  
  System.out.println("25 English movies  available on  Netflix:");
  for(String englishMovie:englishMovies){
  System.out.println(englishMovie);}

 System.out.println("----------------------------------------------------------------------------------------------------------");

  System.out.println("15 English cartoon movies  available on Netflix:");
  for(String cartoonMovie:cartoonMovies){
  System.out.println(cartoonMovie);}

 
 System.out.println("----------------------------------------------------------------------------------------------------------");

 System.out.println("15 Hindi series available on Netflix:");
 for(String hindiSerie:hindiSeries){
 System.out.println(hindiSerie);}

 System.out.println("----------------------------------------------------------------------------------------------------------");

 System.out.println("20 Korean series  available on  Netflix:");
 for(String kSerie:kSeries){
 System.out.println(kSerie);}

 System.out.println("----------------------------------------------------------------------------------------------------------");
}
}