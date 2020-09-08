

public  abstract class Personnage implements Victime{

  protected int point;
  protected String nom;

  public Personnage( int a, String b){
    this.point = a;
    this.nom = b;
  }

  public String getNom(){
    return this.nom;
  }

  public boolean  mort(){
    if ( this.point > 0 ){
      return false ;
    } else {
      return true ; 
    }
  }

  public int getVie(){
    return this.point;
  }

  public void addVie( int num ){
    this.point = this.point + num; 
  }

  public abstract void attaque(Personnage p);

  public abstract int subitFrappe ( int coup );

  public abstract  int subitCharme ( int coup ); 

  public String toString(){
    
    if ( this.point > 0 ) {
      return " je m'appelle " + this.nom + " et j'ai " + this.point + " points de vie ";
    } else {
      return this.nom +  " est mort "; 
    }

  } 

}
