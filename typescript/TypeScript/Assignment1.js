var number;
number = [123, 34, 100, 14, 9, 8, 12, 8, 8, 8];
var minumumNumber = function (numArr) {
    var minumumNumber = 0;
    for (var i = 0; i < numArr.length; i++) {
        for (var j = i + 1; j < numArr.length; j++) {
            if (numArr[i] < numArr[j]) {
                minumumNumber = numArr[i];
            }
            else if (numArr[i] > numArr[j]) {
                minumumNumber = numArr[j];
            }
        }
    }
    return minumumNumber;
};
console.log("minimum number is " + minumumNumber(number));
