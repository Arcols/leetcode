class Solution {
    public int minAddToMakeValid(String s) {
        int nbToAddAfterOpen = 0;
        int nbToAddBeforeClose = 0;
        int nbParOpen = 0;
        int nbParClose = 0;
        for(char parenthese:s.toCharArray()){
            if(parenthese=='('){nbParOpen++;
            }else{nbParClose++;}
            if(nbParClose-nbToAddBeforeClose>nbParOpen){nbToAddBeforeClose++;}
        }
        int nbToAdd=nbToAddBeforeClose+nbToAddAfterOpen;
        if(nbParOpen>nbParClose-nbToAddBeforeClose){nbToAdd+=nbParOpen-nbParClose+nbToAddBeforeClose;}
        return nbToAdd ;
    }
}