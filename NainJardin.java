public class NainJardin implements Victime  { 
  
  protected solidite;

  public NainJardin ( int sol ) {
    this.solidite = sol; 
  }


  public subitFrappe ( int coup ) { 
    if ( coup > this.solidite ) { 
      System.out.println ( " la solidite est nulle , le nain de jardin est mort "); 
    }
  }



  public subitCharme ( int coup ) { 
      System.out.println ( " Malin !!  inutile de charmer un nain de Jardin "); 
  }  


