public class zoo{
  
  public static void main(String args[]){
    
    Animal[] zoo = new Animal[5];
    zoo[0] = new Animal("dog","mongmong");
    zoo[1] = new Animal("forg","geagulgeagul");
    zoo[2] = new Animal("dragon","kyaoh");
    zoo[3] = new Animal("elk","kayaa");
    zoo[4] = new Animal("phoenix","yeehyuk");
      
      
    all_sounds(zoo);
  }
  
  public static void all_sounds(Animal[] zoo){
    
    for(int i = 0; i < zoo.length; i++){
      System.out.printf("%s goes %s%n",zoo[i].name, zoo[i].sound);
    }
  }
}