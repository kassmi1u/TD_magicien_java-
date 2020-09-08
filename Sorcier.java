public class Sorcier extends Personnage {

  protected float pouvoir; 
  pouvoir = Math.random();
  

  public Sorcier(int point, String nom){
    super(point,nom);
  }
  

  //Attaque 
  public void attaque ( Personnage p){

    if ( p.mort() == false  ) {
      int coup1 = this.getVie()*pouvoir;
      int coup2 = p.subitFrappe(coup1);
      this.addVie(coup2);
    }
 }

  //get Pouvoir 
  public int getPouvoir(){
    return pouvoir;

  //Frappe 
  public int subitFrappe( int coup){
    this.point -= coup;
    if ( this.point > 0 ){
     return - this.point/2; 
    return 0; 
  } 
}
