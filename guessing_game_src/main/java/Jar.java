import java.util.Random;

class Jar{
  
  public String itemName;
  public int MAX_ITEMS;
  
  
  public Jar (String itemName, int MAX_ITEMS){
    
    this.itemName = itemName;
    this.MAX_ITEMS = MAX_ITEMS;
     
    
  }
  
  
  public int fillJar (){
  
  Random random = new Random();
  int itemsInJar = random.nextInt(MAX_ITEMS)+1;
  return itemsInJar;
  }
 }