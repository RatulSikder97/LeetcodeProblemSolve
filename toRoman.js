let roman = ['I', 'II', "III", 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'];

let n = 22;
// XIX
let noX = parseInt(n / 10);
let noo = n % 10;


if(noX > 0) {
    console.log( Array(noX+1).join('X') +  (noo > 0 ? roman[noo-1]: ''))
} else {
    console.log(roman[noo-1])
}
