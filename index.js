//let arr = ["Aaryan", "Arush", 0, 8]

/* let name1 = arr[0];
let name2 = arr[1];
let a = arr[2];
let b = arr[3]; */

// {} --> objects, [] --> arrays
/* let [name1, name2, a, b] = arr;

function calc(a, b) {
    const add = a + b;
    const sub = a - b;
    const mul = a * b;
    const div = a / b;

    return [add, sub, mul, div];
}

const [add, sub, mul, div] = calc(5, 5)

console.log(add, sub, mul, div); */

// let newarr = ["Nitin", ...arr]
// newarr --> add elements of arr
// ["Nitin", "Aaryan", "Arush" ...]

/* for (let index = 0; index < arr.length; index++) {
    newarr.push(arr[index]);
} */
// console.log(newarr);

/* let a = 5;
let b = 6;

let str = "The value of a = " + a + ", b = " + b;
let str1 = `The value of a = ${a}, b = ${b} and the sum is ${a + b}`

console.log(str1); */

/* setTimeout(() => {
    console.log("ok")
}, 1000);
console.log("Aaryan") */

// Promises --> a --> 1K after 1 month --> response
// calling an API --> took x sec --> wait until the response is fetched
// Promise --> resolve, reject, wait

/* let myPromise = new Promise((res, rej) => {
    let err = 1;

    if(err === 0) {
        console.log("error")
    } else {
        console.log("success");
    }
    /* if(res) {
        console.log("ok")
    } else {
        console.log("error")
    } 
})

myPromise.then(value => console.log(value))
    .catch(err => console.log(err)); */

const url = "https://dog-api.kinduff.com/api/facts"

// javascript object
fetch(url).then(data => data.json())
    .then(value => console.log(value.facts[0]))
    .catch(err => console.log(err));

/* async function getData() {
    let data = await fetch(url);
    data = data.json();

    console.log(data)
}
 */

let obj = {
    a: 5,
    b: 6
}

console.log(obj.a, obj.b);



