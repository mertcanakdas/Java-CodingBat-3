
package codingbat_3; // dizinin ilk iki elemanını toplayıp geri döndüren metot

import java.util.Random;

public class CodingBat_3 {
    
public static int [] Dizi(){
    Random rn = new Random();
    int []dizi = new int[rn.nextInt(10)+1];
    for(int i=0; i<dizi.length;i++){
        dizi[i] = rn.nextInt(10)+1;
        
    }
    
    return dizi;
}

public static int sum2(int []dizi){
    int sum;
    if(dizi.length>=2){
        sum = dizi[0]+dizi[1];
    return sum;
    }else if(dizi.length==0){
        return 0;
    }else{
        sum = dizi[0];
        return sum;
    }
}

    public static void main(String[] args) {
        System.out.println(sum2(Dizi()));
    }
    
}
