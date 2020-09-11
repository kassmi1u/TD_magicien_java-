
public class Magicien extends Sorcier implements SuperPouvoir {


  public Magicien ( int point, String nom){
    super(point,nom);
  }
  

  public double getPouvoir(){
    return this.pouvoir*extra;
  }

  public double sort() {
    return this.getPouvoir()*Math.random();
 
  }

  
  public int subitCharme(int coup){
    if (!this.mort()){
      return -(int)(this.sort()*coup);
    }
    return 0;

  }

}





