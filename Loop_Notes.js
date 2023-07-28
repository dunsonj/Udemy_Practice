/*
for loops:
meaning:
for (initial value; logical condition that is evaluated before iteration of the loop; update the counter after each iteration, increase the counter by one)

for (let i = 1; i <= 10; i++){
return `I love to learn ${i}`;
}

Looping arrays, break and continuing:

const kira = [
   'Kira',
    'Karilen',
   '22',
    'software_developer'
];
for (let i =0; i <= 4 i++) {
return kira[0];

another way can be:
    for (let i =0; i < kira.length ; i++) {
    console.log(kira[i]);
}
 */

const kira = [
   'Kira',
    'Karilen',
   22,
    'software_developer'
];

const types = []; //an empty array needs to be created to pass the elements of the kira array through it

for (let i =0; i < kira.length ; i++) {
    console.log(kira[i], typeof kira[i]);


    //one way of filling an array
    types[i] = typeof kira[i]; //the typeof will create an array that has all the elements of the kira array.
}
console.log(types)


/*
Continue and break

Continue: To continue on to the next one
Break; To finish the loop completely

only for strings

for (let i = 0; i < kira.length; i++){
if(typeof kira[i] !== 'string') continue;

console.log(kira[i], typeof kira[i]);
}

only for numbers

for (let i = 0; i < kira.length; i++){
if(typeof kira[i] === 'number') break;

console.log(kira[i], typeof kira[i]);
}
The break terminates the loop
 */

/*
Looping Backwards and Looping in Loops




 */