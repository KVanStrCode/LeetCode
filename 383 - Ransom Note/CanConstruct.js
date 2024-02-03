// https://leetcode.com/problems/ransom-note/description/

function canConstruct1(ransomNote, magazine) {
  for (let i = 0; i < ransomNote.length; i++) {
    const r = ransomNote.charAt(i);

    const matchingIndex = magazine.indexOf(r);

    if (matchingIndex == -1) {
      return false;
    }

    magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
  }

  return true;
}

function canConstruct2(ransomNote, magazine) {
  const magazineMap = new Map();

  for (const c of magazine) {
    magazineMap.set(c, (magazineMap.get(c) || 0) + 1);
  }

  for (const c of ransomNote) {
    if (!magazineMap.has(c)) {
      return false;
    }

    if (magazineMap.get(c) < 1) {
      return false;
    }

    magazineMap.set(c, magazineMap.get(c) - 1);
  }

  return true;
}

console.log(canConstruct1("ransom", "random"));
