import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        long n = 61960;
        int intsize = 0;
        List<Long> listN= new ArrayList<>();
        //for (int i = 0; i <=intsize;i++){

        while (n !=0){

            listN.add(n%10);
            n= (n - n%10)/10;
            intsize++;
        }
        long[] intN= new long[intsize];
        for (int i = 0; i <=listN.size() -1 ; i++) {
            intN[i]= listN.get(i);

        }

        boolean nReturn= false;
        long interchange;
        for (int i = 0; i <=intsize;i++){
            if (intN[i]> intN[i+1]){
                nReturn=true;
                
                for (int j= i;j >=0;j--){
                    if (intN[i]> intN[i+1]) {
                        interchange = intN[j + 1];
                        intN[j + 1] = intN[j];
                        intN[j] = interchange;
                    }
                    else{
                        break;
                    }
                }
               // interchange=intN[i];
            //    intN[i]=intN[i+1];
             //   intN[i+1]=interchange;
                break;
            }
        }
        if (nReturn ==false){
            n=-1;
        }
        else{
            n=0;
            for (int i = intsize-1; i > -1;i--){
                n=n*10+intN[i];
            }
        }








        System.out.println("valeur" + n);
    }



}
