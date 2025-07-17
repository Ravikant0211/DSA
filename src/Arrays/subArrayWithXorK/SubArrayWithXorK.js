module.exports = { 
 //param A : array of integers
 //param B : integer
 //return an integer
	solve : function(A, B){
        // TC: O(N^3)
        // let n = A.length, count = 0;
        // for (let i = 0; i < n; i++) {
        //     for (let j = i; j < n; j++) {
        //         let xor = 0;
        //         for (let k = i; k <= j; k++) {
        //             xor = xor ^ A[k];
        //         }
        //         if (xor === B)
        //             count++;
        //     }
        // }
        // return count;
        
        // TC: O(N^2)
        // let n = A.length, count = 0;
        // for (let i = 0; i < n; i++) {
        //     let xor = 0;
        //     for (let j = i; j < n; j++) {
        //         xor = xor ^ A[j];
        //         if (xor === B) 
        //             count++;
        //     }
        // }
        // return count;
        
        // TC: O(N) or O(N*logN)
        // SC: O(N)
        let map = new Map();
        map.set(0, 1);
        let count = 0, xor = 0;
        for (let a of A) {
            xor = xor ^ a;
            let x = xor ^ B;
            count = count + (map.get(x) || 0);
            map.set(xor, (map.get(xor) || 0) + 1);
        }
        return count;
	}
};
