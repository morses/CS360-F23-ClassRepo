const data = [
    { name: 'John', age: 25, email: 'jsmith@email.com', balance: 2345.67 },
    { name: 'Johan', age: 35, email: 'johan@email.com', balance: 1234.56 },
    { name: 'Johanna', age: 45, email: 'johanna@email.com', balance: 3456.78 },
    { name: 'Johannes', age: 55, email: 'johannes@email.com', balance: 4567.89 },
    { name: 'Johanan', age: 65, email: 'johanan@email.com', balance: 5678.90 },
    { name: 'Joh', age: 75, email: 'joh@email.com', balance: 6789.01 }
];

/* -------------------------------------------------- */

// Get a list of all the emails -- iterative version
console.log('Email list:');
let emailList1 = [];
for (let i = 0; i < data.length; i++) {
    emailList1.push(data[i].email);
}
console.log(emailList1);

// Get a list of all the emails -- functional version
/* map() https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map */
let emailList2 = data.map((person) => person.email);
console.log(emailList2);

/* -------------------------------------------------- */

// Select all the people over 50 -- iterative version
console.log('People over 50:');
let peopleOver50_1 = [];
for (let i = 0; i < data.length; i++) {
    if (data[i].age > 50) {
        peopleOver50_1.push(data[i]);
    }
}
console.log(peopleOver50_1);

// Select all the people over 50 -- functional version
/* filter() https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter */
let peopleOver50_2 = data.filter((person) => person.age > 50);
console.log(peopleOver50_2);

/* -------------------------------------------------- */

// Select everyone whose name has 5 or more characters and a balance over 3000 -- iterative version
console.log('People with long name and high balance:');
let peopleWithLongNameAndHighBalance1 = [];
for (let i = 0; i < data.length; i++) {
    if (data[i].name.length >= 5 && data[i].balance > 3000) {
        peopleWithLongNameAndHighBalance1.push(data[i]);
    }
}
console.log(peopleWithLongNameAndHighBalance1);

// Select everyone whose name has 5 or more characters and a balance over 3000 -- functional version
let peopleWithLongNameAndHighBalance2 = data.filter((person) => person.name.length >= 5 && person.balance > 3000);
console.log(peopleWithLongNameAndHighBalance2);

/* -------------------------------------------------- */

// Double all the balances, in-place -- iterative version
console.log('Double all balances in-place:');
for (let i = 0; i < data.length; i++) {
    data[i].balance *= 2;
}
console.log([...data]);


// Double all the balances, in-place -- functional version
/* forEach() https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach */
data.forEach((person) => person.balance *= 2);
console.log(data);

/* -------------------------------------------------- */

// Calculate the average balance -- iterative version
console.log('Average balance:');
let totalBalance = 0;
for (let i = 0; i < data.length; i++) {
    totalBalance += data[i].balance;
}
let averageBalance1 = totalBalance / data.length;
console.log(averageBalance1);

// Calculate the average balance -- functional version
/* reduce() i.e. fold  https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce */
let averageBalance2 = data.reduce((total, person) => total + person.balance, 0) / data.length;
console.log(averageBalance2);

/* -------------------------------------------------- */

// Get the name of the person with the highest balance -- iterative version
console.log('Name of person with highest balance:');
let highestBalance = 0;
let highestBalanceName1 = '';
for (let i = 0; i < data.length; i++) {
    if (data[i].balance > highestBalance) {
        highestBalance = data[i].balance;
        highestBalanceName1 = data[i].name;
    }
}
console.log(highestBalanceName1);

// Get the name of the person with the highest balance -- functional version
let highestBalanceName2 = data.reduce((highestBalancePerson, person) => {
    return person.balance > highestBalancePerson.balance ? person : highestBalancePerson;
}).name;
console.log(highestBalanceName2);

/* -------------------------------------------------- */

const data2 = [1, 3.4, true, { a: 5, b: "hello" }, "world", function () { console.log("hi"); }];
// Using map to transform the type of the data -- output value, it's type and string representation
console.log('Map:');
console.log(data2.map((value) => [value, typeof value, value.toString()]));