// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

function numberOfSteps1(num) {
  let steps = 0;

  while (num > 0) {
    const isEven = num % 2 === 0;

    if (isEven) {
      num /= 2;
    } else {
      num--;
    }

    steps++;
  }

  return steps;
}

function numberOfSteps2(num) {
  let steps = 0;

  while (num > 0) {
    const isEven = (num & 1) === 0;

    if (isEven) {
      num >>= 1;
    } else {
      num--;
    }

    steps++;
  }

  return steps;
}

console.log(numberOfSteps1(30));
