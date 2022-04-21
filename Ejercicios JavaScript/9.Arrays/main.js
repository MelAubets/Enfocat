let div1 = document.getElementsByClassName("1")[0];
let div2 = document.getElementsByClassName("2")[0];
let div3 = document.getElementsByClassName("3")[0];
let div4 = document.getElementsByClassName("4")[0];
let div5 = document.getElementsByClassName("5")[0];
let div6 = document.getElementsByClassName("6")[0];

let array1=['🍔','🌯','🍣','🍕','🍜','🍱','🍙','🍘','🥩'];
let array2=['🍕','🍕','🍍','🍕','🍕'];
let array3=['🍕','🍕','🍍','🍕','🍕'];
let array4=['🍓','🍋','🍓','🍋','🍓'];
let array5=['🌶️','🥛','🌶️','🥛','🌶️','🥛'];
let array6=['🎴','🎴','🎴','🃏','🎴','🎴','🎴'];

array1.fill('🍺', array1.indexOf('🍕')+1, array1.length);
div1.innerHTML += array1;

if(array2.includes('🍍')){
    div2.innerHTML += "Array includes a pinneapple";
}else{
    div2.innerHTML += "Array not includes a pinneapple";
}

array3.splice(array3.indexOf('🍍'), 1);
div3.innerHTML += array3;

while(array4.includes('🍓')){
    array4.splice(array4.indexOf('🍓'), 1, '🍄');
}
div4.innerHTML += array4;

for( i = 0; i<array5.length; i++){
    if(array5[i] == '🌶️'){
        array5.splice(i+1,0,'🥵');
    }
}
div5.innerHTML += array5;

for( i = 0; i<array6.length; i++){
    if(array6[i] == '🎴' && array6[i+1]=='🎴'){
        array6.splice(i+1,0,'🃏');
    }
}
div6.innerHTML += array6; 



