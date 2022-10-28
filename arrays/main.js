const strings = ['a', 'b', 'c', 'd'];


strings[2];
console.log(strings[2]);

strings.push('e');
console.log(strings);

strings.pop();
console.log(strings);

strings.unshift('x'); // 0(n)
console.log(strings); 

strings.splice(2, 0, 'alien');

console.log(strings); 