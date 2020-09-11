public class Magicien extends Sorcier implements SuperPouvoir {


  public Magicien ( int point, String nom){
    super(point,nom);
  }
  

  public double getPouvoir(){
    return Math.random()*extra;
  }

  public double Sort() {
    return this.getPourvoir();
 
  }




  public int subitFrappe(int coup){
    super();
  }

  public int subitCharme(int coup){
    return -(int)(coup*this.sort()
  }

}





