class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = numer1 * denom2 + denom1 * numer2;
        int denom = denom1 * denom2;
        int cmm = 1;
        
        for(int i = 1; i <= numer && i <= denom; i++){
            if( numer % i == 0 && denom % i == 0 ){
                cmm = i;
            }
        }
        
        numer = numer/cmm;
        denom = denom/cmm;
        
        int[] answer = {numer, denom};
        return answer;
    }
}