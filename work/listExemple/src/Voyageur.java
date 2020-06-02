public class Voyageur {

    int numero;
    int siegeNumber;
    String name;
    Classe classe;

    public Voyageur(int numero, int siegeNumber, String name, Classe classe) {
        this.numero = numero;
        this.siegeNumber = siegeNumber;
        this.name = name;
        this.classe = classe;
    }

    public int getNumero() {
        return numero;
    }

    public int getSiegeNumber() {
        return siegeNumber;
    }

    public String getName() {
        return name;
    }

    public Classe getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "numero=" + numero +
                ", siegeNumber=" + siegeNumber +
                ", name='" + name + '\'' +
                ", classe=" + classe +
                '}';
    }
}
