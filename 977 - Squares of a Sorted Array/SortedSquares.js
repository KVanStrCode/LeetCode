// https://leetcode.com/problems/squares-of-a-sorted-array/

function sortedSquares(nums) {
  let result = new Array(nums.length);

  let left = 0;
  let right = nums.length - 1;

  for (let i = result.length - 1; i >= 0; i--) {
    if (Math.abs(nums[left]) > Math.abs(nums[right])) {
      result[i] = nums[left] * nums[left];
      left++;
    } else {
      result[i] = nums[right] * nums[right];
      right--;
    }
  }

  return result;
}

let arr = [-4, -1, 0, 3, 10];
console.log(sortedSquares(arr));
