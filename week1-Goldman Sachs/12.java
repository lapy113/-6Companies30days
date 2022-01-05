class Solution {
    static Long squaresInChessBoard(Long n) {
        // code here
        return n*(n+1)*(2*n+1)/6;
    }
};