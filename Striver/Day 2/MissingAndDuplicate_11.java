public class Solution {
    public int[] repeatedNumber(final int[] arr) {
        int[] result = new int[2];
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[Math.abs(arr[i])-1] > 0){
                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            } else {
                result[0] = Math.abs(arr[i]);
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                result[1] = i+1;
            }
        }
        return result;
    }
}

