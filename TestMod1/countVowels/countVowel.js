const VOWEL = ['u', 'e', 'o', 'a', 'i'];
const VOWELHIGH = ['U', 'E', 'O', 'A', 'I'];
let str = prompt('input a string: ', ' ');
let rs;


rs = countVovel(str);
alert('có ' + rs + ' nguyên âm trong chuỗi');

function countVovel(string) {
    let count = 0;
    for (let i = 0; i < string.length; i++) {
        if (VOWEL.indexOf(string[i]) !== -1 || VOWELHIGH.indexOf(string[i]) !== -1) {
            count++;
        }
    }
    return count;
}