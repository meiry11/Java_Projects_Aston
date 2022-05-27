package fr.banque;

public class Run {
    public static void main(String[] args) throws Exception {
        try {

//            Client client = new Client("meiry","cisse",23,41);
//            client.ajouterCompte(new Compte(5,4552));
//            CompteRemunere compteRemunere = new CompteRemunere(5,4552,0.5);
//            compteRemunere.calculerInterets();
//            System.out.println(compteRemunere);
//            CompteASeuil compteASeuil = new CompteASeuil(5,4552,8564);
//            compteASeuil.retirer(456);
//            System.out.println(compteASeuil);

//            CompteRemunere compte2 = new CompteRemunere(5,100,0.5);
//            compte2.verserInteret();
//            compte2.calculerInteret();
//            System.out.println(compte2);
//
            CompteASeuil compteASeuil = new CompteASeuil(500,400,5);
            compteASeuil.retirer(200);
            System.out.println(compteASeuil);
        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println("final /");
        }

    }
}
