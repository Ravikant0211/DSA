/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */

// TC: O(nlogn) + O(n)
// SC: O(n)
var merge = function(intervals) {
    intervals.sort((a, b) => a[0] - b[0]);
    const res = [];
    intervals.forEach((interval) => {
        if (res.length == 0 || interval[0] > res.at(-1)[1]) {
            res.push(interval);
        } else {
            res.at(-1)[1] = Math.max(res.at(-1)[1], interval[1]);
        }
    })
    return res;
};
