public class Monstre extends Personnage {
  
  
  public Monstre ( int point, String nom ){
    super(point,nom);
  }

  //Attaque 
  public void attaque ( Personnage p ){
    
    if ( !(this.mort())  ) {
      
      int coup1 = this.getVie()/2;
      int coup2 = p.subitFrappe(coup1);
      this.addVie(coup2);   
    }
  }

  // Frappe 
  public int subitFrappe(int coup ){
    this.point -= coup;
    if ( this.point > 0){ 
     return -this.point/2; 
    } 
    return 0;
  }


  // Charme 
  public int subitCharme(int coup ){
     this.point -=  coup; 
     if ( this.point > 0){
       return -this.point/2;
     }  
     return 0;
  }
}
