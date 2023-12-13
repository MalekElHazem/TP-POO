// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            // Create Stock object
            Stock stock = new Stock(0);é

            // Create Article objects
            Article ar1 = new Article(1, "TV", 30, 100);
            Article ar2 = new Article(2, "LaveVaisselle", 5, 20);

            // Add operations to the stock
            stock.addOperation(new Achat(ar1, 700, 20));
            stock.addOperation(new Achat(ar2, 1600, 15));
            stock.addOperation(new Vente(ar1, 800, 20));
            stock.addOperation(new Vente(ar2, 1800, 10));
            stock.addOperation(new Vente(ar2, 1900, 5));

            // Display details of all purchase operations
            for (Operation op : stock.getOperations()) {
                if (op instanceof Achat) {
                    System.out.println(op);
                }
            }

            // Display the best selling price for ar2
            double bestPrice = 0;
            for (Operation op : stock.getOperations()) {
                if (op instanceof Vente && op.getArticle().equals(ar2) && op.getPrix() > bestPrice) {
                    bestPrice = op.getPrix();
                }
            }
            System.out.println("Best selling price for ar2: " + bestPrice);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}