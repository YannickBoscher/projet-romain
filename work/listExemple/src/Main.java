import jdk.nashorn.internal.codegen.Compiler;

import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        List<Character> listString = new ArrayList<>();
        listString.add('t');
        listString.add('b');
        //ajout de plusieurs éléments
        Collections.addAll(listString,'c','d','e');
        //methode while pour iterer
        Iterator<Character> iterator = listString.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.sort(listString);

        //methode for pour iterer
        for(Character caractere : listString){
            System.out.println( caractere);
        }
        System.out.println("set");
        Set<Character> characterSet = new TreeSet<>();
        characterSet.add('f');
        characterSet.add('e');
         Collections.addAll(characterSet,'e', 'r', 'a');
        Iterator<Character> iterator1 = characterSet.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        List<List<Integer>> listDeuxD = new ArrayList<List<Integer>>();
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 4 ,5 ,6 );
        listDeuxD.add(integerList);
        List<Integer> integerList2 = new ArrayList<>();
        Collections.addAll(integerList2, 1, 2, 4 ,5 ,6,41,5 ,6 );
        listDeuxD.add(integerList2);
        integerList.add(5);
        listDeuxD.add(integerList);

        for(List<Integer> integerList1 : listDeuxD) {
            for(Integer a : integerList1){
                System.out.print(a);
            }
            System.out.println();
        }

        Voyageur voyageur1 = new Voyageur(4,25,"Toto",Classe.Business);
        Voyageur voyageur2 = new Voyageur(8,22,"Titi",Classe.Premiere);
        Voyageur voyageur3 = new Voyageur(9,5,"Totl",Classe.seconde);
        Voyageur voyageur4 = new Voyageur(10,12,"Titu",Classe.Business);
        Voyageur voyageur5 = new Voyageur(9,44,"Tota",Classe.Business);
        Voyageur voyageur6 = new Voyageur(18,27,"Tite",Classe.Premiere);
        Voyageur voyageur7 = new Voyageur(1,31,"Tjk",Classe.Business);
        Voyageur voyageur8 = new Voyageur(100,2,"Hhgjkti",Classe.seconde);
        List<Voyageur> listVoyageur= new ArrayList<>();
        listVoyageur.add(voyageur1);
        Collections.addAll(listVoyageur,voyageur2,voyageur3,voyageur4,voyageur5, voyageur6,voyageur7,voyageur8);
        for(Voyageur listVoyageurs: listVoyageur  ){
            System.out.println(listVoyageurs.toString());
        }


        Collections.sort(listVoyageur, new voyageurComparator());
        System.out.println("liste triée");
        for(Voyageur listVoyageurs: listVoyageur  ){
            System.out.println(listVoyageurs.toString());
        }

        Collections.sort(listVoyageur,new voyageurComparatorName());
        System.out.println("list trié par name");
        for(Voyageur listVoyageurs: listVoyageur){
            System.out.println(listVoyageurs.toString());
        }

    }
}
