package module;
import java.lang.Math;

public class Main {
  
  public static void main(String[] args) {
    Personnage[] tab = new Personnage [12];
    for (int i=0; i<4;i=i+1){
      tab[i]= new Monstre((int)(100*Math.random()), "Monstre"+ i);
      tab[4+i]= new Sorcier((int)(100*Math.random()), "Sorcier"+ i);
      tab[8+i]= new Magicien((int)(100*Math.random()), "Magicien"+ i);
    }
    for(int j=0;j<tab.length;j++){
      System.out.println("\t Position : "+ j +" Il y a "+tab[j]);
    }
    while ( nombreMonstreVivant(tab) > 0 && nombreVivant(tab)>1 )
    {
      int joueur1 = (int)(Math.random()*10);
      int joueur2 = (int)(Math.random()*10);
      if(joueur1!=joueur2){
	System.out.println("\n"+ tab[joueur1].getNom()+"attaque" + tab[joueur2].getNom());
	tab[joueur1].attaque(tab[joueur2]);
	for(int j=0; j< tab.length;j++){
	  System.out.println("En position"+ j + "Il y a" + tab[j]);
	}
      }
	    	
    }
    if (nombreVivant(tab)- nombreMonstreVivant(tab)>=1){
      System.out.println("\n Les sorciers sont gagnes");
    } else{
      int vainqueur = 0 ;
      int j;
      for (j=0;j<4;j++){
	if (!(tab[j].mort())){
	  vainqueur = j;
	}
      }
      System.out.println("\n Le grand gagnand est " + tab[vainqueur].getNom());
    }
  }
  public static int nombreMonstreVivant(Personnage[]tab) {
    int compteur = 0;
    for(int j=0 ; j<12 ; j++){
      if (tab[j].getVie()>0){
	compteur++;
      }
    }			
    return compteur;
  }

  public static int nombreVivant(Personnage[]tab) {
    int compteur = 0;
    for(int j=0 ; j<12 ; j++)
    {
      if (tab[j].getVie()>0){
	compteur++;
      }
    }			
    return compteur;
  }
}
