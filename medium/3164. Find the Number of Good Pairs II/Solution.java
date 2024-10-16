
class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        // Étape 1 : Compte les occurrences de chaque valeur dans nums2
        Map<Integer, Long> nums2Map = new HashMap<>();
        for (int num : nums2) {
            int adjustedValue = num * k;
            nums2Map.put(adjustedValue, nums2Map.getOrDefault(adjustedValue, 0L) + 1);
        }

        long totalCount = 0;

        for (int value : nums1) {
            for (int d = 1; d * d <= value; d++) {
                if (value % d == 0) { 
                    // d et value/d sont des diviseurs
                    totalCount += nums2Map.getOrDefault(d, 0L);
                    if (d != value / d) { // éviter de compter deux fois si d * d = value Ex : value = 36 et d = 6, we will not count 6 two times
                        totalCount += nums2Map.getOrDefault(value / d, 0L);
                    }
                }
            }
        }
        return totalCount;
    }
}
