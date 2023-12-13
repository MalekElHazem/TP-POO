public class QteArticleException extends Exception{
    int choix;
    QteArticleException(int choix){
        this.choix=choix;
    }
    public String alert() {
        if(choix==1) {
            return"L’espace de stockage est insuffisant.";
        }else if (choix==2) {
            return " la quantité en stock de l’article est insuffisante. !!";

        }
        return null;
    }



}
