class Solution {
    public long minimumSteps(String s) {
        String[] arr = s.split("");
        long resultat = 0;
        long countZero = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i].equals("0")){
                countZero ++;
            }
            if(arr[i].equals("1")&& i!=arr.length-1){
                if(!(arr[i+1].equals("1"))){
                    resultat+=countZero;
                    arr[i]="0";
                }
            }
        }
        return resultat;
    }
}