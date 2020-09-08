public class Magicien extends Sorcier implements SuperPouvoir {


  public Magicien ( int point, String nom){
    super(point,nom);
  }
  

  public int getPouvoir(){
    super();
  }

  public double Sort() {
    return this.getPourvoir()*extra;
 
  }


  public void attaque(Personnage p){
    super();
    if ( this.mort() == false  ) {
      int coup1 = this.sort()*subitFrappe(p.getVie()*pouvoir);
      int coup2 = p.subitFrappe(coup1);
      this.addVie(coup2);

  }

  public int subitFrappe(int coup){
    super();
  }

  public int subitCharme(int coup){
  }

}





