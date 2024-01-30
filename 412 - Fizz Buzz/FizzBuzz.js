function fizzBuzz(n) {
  let result = [];

  for (let i = 1; i <= n; i++) {
    const divisibleBy3 = i % 3 === 0;
    const divisibleBy5 = i % 5 === 0;

    let currentString = "";

    if (divisibleBy3) {
      currentString += "Fizz";
    }

    if (divisibleBy5) {
      currentString += "Buzz";
    }

    if (currentString.length === 0) {
      currentString = String(i);
    }

    result.push(currentString);
  }
  return result;
}

console.log(fizzBuzz(15));
