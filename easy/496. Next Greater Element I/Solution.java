class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        int numToCompare;
        boolean isFoundEqual;
        for(int i=0;i<nums1.length;i++){
            isFoundEqual = false;
            numToCompare = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(!isFoundEqual){
                    if(numToCompare == nums2[j]){
                        isFoundEqual = true;
                    }
                }
                else{
                    if(numToCompare < nums2[j]){
                        answer[i]=nums2[j];
                        break;
                    }
                }
            }
            if(answer[i]==0){answer[i]=-1;}
        }
        return answer;
    }
}