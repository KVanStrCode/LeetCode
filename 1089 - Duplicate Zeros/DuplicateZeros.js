// https://leetcode.com/problems/duplicate-zeros/description/

function duplicateZeros(arr) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 0) {
      for (let j = arr.length - 1; j > i; j--) {
        arr[j] = arr[j - 1];
      }
      i++;
    }
  }
  console.log(arr);
}

const arr = [1, 0, 2, 3, 0, 4, 5, 0];
duplicateZeros(arr);
