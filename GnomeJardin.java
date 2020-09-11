

public class GnomeJardin extends NainJardin implements SuperPouvoir{


    public int pouvoir = Math.random();


    public GnomeJardin(int solidte , String name){
        super(solidite, name);
    }


    public int subitCharme(int coup){

        int coup2 = -1;

        if (this.sort() > coup){
            coup2  = - coup;
        }

        return coup2;
    }

    public int subitFrappe(coup){
      super(coup);
    }

    public double sort(){
      return pouvoir*this.solidite; 
    }
    
}
