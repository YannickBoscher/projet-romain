public class Centaure {
    static int nbPattes = 4;
    static int nbBras = 2;
    private static int population =0;

    public Centaure() {
        AugmenterPopulation();
    }

    public static int AugmenterPopulation(){
        population++;
        return population;
    }

    public static void AfficherPopulation() {
        System.out.println(Centaure.population);
    }
}
