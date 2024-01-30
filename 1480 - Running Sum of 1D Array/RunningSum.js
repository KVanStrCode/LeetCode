// https://leetcode.com/problems/running-sum-of-1d-array/

function runningSum1(nums) {
  for (let i = 1; i < nums.length; i++) {
    nums[i] = nums[i - 1] + nums[i];
  }
  return nums;
}

function runningSum(nums) {
  const result = new Array(nums.length);

  result[0] = nums[0];
  for (let i = 1; i < nums.length; i++) {
    result[i] = result[i - 1] + nums[i];
  }
  return result;
}

const arr = [1, 2, 3, 4];
const result = runningSum([...arr]);

console.log(result);
