package tp;

public class TestPolymorphisme {

	public static void main(String[] args) {
		Vehicule vehicule = new Vehicule();
        Vehicule voiture = new Voiture();
        Vehicule velo = new Velo();

       
        vehicule.seDeplacer(); 
        voiture.seDeplacer();  
        velo.seDeplacer();     
    }
	}

