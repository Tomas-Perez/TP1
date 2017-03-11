package Search;

public class Search {

    public static int sequentialSearch(int k, int[]a){
        for(int i = 0; i < a.length; i++){
            if(k == a[i]) return i;
        }
        return -1;
    }

    public static int binarySearch(int k, int[] a){
        int start = 0;
        int end = a.length-1;

        int middleIndex = (end+start)/2;
        while(k != a[middleIndex]) {
            if(start < end) {
                if (k < a[middleIndex]) {
                    end = middleIndex-1;
                } else {
                    start = middleIndex+1;
                }
                middleIndex = (end+start) / 2;
            }
            else return -1;
        }
        return middleIndex;
    }
}
