// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

function findNumbers(nums) {
  let evenNumbers = 0;

  for (let n of nums) {
    let digitCount = 0;

    while (n !== 0) {
      n = Math.floor(n / 10);
      digitCount++;
    }

    if (digitCount % 2 === 0) {
      evenNumbers++;
    }
  }

  return evenNumbers;
}

console.log(findNumbers([14, 3, 26, 12]));
