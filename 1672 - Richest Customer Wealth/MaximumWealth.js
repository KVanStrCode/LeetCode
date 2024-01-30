// https://leetcode.com/problems/richest-customer-wealth/

function maximumWealth(accounts) {
  let max = Number.MIN_SAFE_INTEGER;

  for (let customer of accounts) {
    let wealth = 0;

    for (let bank of customer) {
      wealth += bank;
    }

    max = Math.max(wealth, max);
  }
  return max;
}

const accounts = [
  [1, 2, 3],
  [3, 2, 1],
  [4, 5, 6],
];

console.log(maximumWealth(accounts)); // 15
