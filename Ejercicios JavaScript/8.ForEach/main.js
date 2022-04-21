let divforeach = document.getElementsByClassName("forEach")[0];
let divfor = document.getElementsByClassName("for")[0];
let arr=['a','b','c','d','e'];
let num=5;

arr.forEach(element => {
    divforeach.innerHTML += (element+"\n");
});

for(i=0;i<5;i++){
    divfor.innerHTML += (num+"\n");
    num -= 1;
}