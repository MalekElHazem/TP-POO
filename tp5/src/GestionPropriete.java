public interface GestionPropriete {
    public static final int MAX_PROPRIETES = 5;
    void afficherProprietes();
    boolean ajouter(Propriete p);
    boolean supprimer(Propriete p);
}
