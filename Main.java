public class Main {
    static int[] BubblSort(int[] ar){
        int i= ar.length -1;
        boolean swap=false;
        do{
            swap = false;
            for(int j = 0; j<i;j++){
                if (ar[j]>ar[j+1]){
                    swap=true;
                    int t= ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=t;
                }
            }
            i--;
        }
        while (swap);
        return ar;
    }
    static int[] SelectionSort(int[] ar){
        for ( int i =ar.length-1;i<1;i--){
            int maxpos = 0;
            for(int  j= 0; j<=i;j++){
                if( ar[j]>ar[maxpos]){
                    maxpos = j;
                }
            }
            int t =ar[maxpos];
            ar[maxpos]= ar[i];
            ar[i]=t;
        }
        return ar;

    }
    public static void Main (String[] args){

    }
}
