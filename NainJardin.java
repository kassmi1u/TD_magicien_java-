public class NainJardin implements Victime  { 
  
  public int solidite;
  public String  name; 

  public NainJardin ( int sol, String name  ) {
    this.solidite = sol; 
    this.name = name ; 
  }



  public String toString(){
    return   this.name + " [cassé]" : this.name + " [" + this.solidite + " solidité]";
  }



  public int subitFrappe(int coup){
    
    int coup2 = - coup;

    if (this.solidite < coup ){
      
      coup2 = 0 - this.solidite;
      this.solidite = 0;
    }
    
    return coup2;
  }



  public int subitCharme(int hit){
    
    return -1;
  }


  public String getNom(){
    return this.name;
  }

}
