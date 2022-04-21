let divWhile = document.getElementsByClassName("while")[0];
let divFor = document.getElementsByClassName("for")[0];

var i=1;


while(i<11){
    divWhile.innerHTML += (i + " I ❤️ code\n");
    i++;
}

for(var ind = 1; ind <11; ind++){
    divFor.innerHTML += (ind + " I ❤️ code\n");
}