public abstract class Sorcier extends Personnage {

  protected double pouvoir;
  
  public Sorcier(int point, String nom){
    super(point,nom);
    this.pouvoir = Math.random();
  }
  
  public int subitFrappe(int coup){
    this.addVie(coup);
    if (this.mort()){                              
      return (int)(-(this.point)*(this.pouvoir));
    }
    return 0;
  }


  public void attaque(Victime v){
    if (this.mort()){
      int coup= (int)(-(this.point)*(this.pouvoir));
      this.point += v.subitCharme(coup);
    }
  }

  public double getPouvoir(){
    return this.pouvoir;
  }

}
