let div1 = document.getElementsByClassName("1")[0];
let div2 = document.getElementsByClassName("2")[0];
let div3 = document.getElementsByClassName("3")[0];

let cadena1 = 'hola y adios';
let cadena2 = 'academia';
let cadena3 = 'escuela';
let cadena4 = 'hola';

function aPerO(cadena){
    return cadena.replaceAll('a','o');
}

function acaStart(cadena){
    return String(cadena.startsWith('aca'));
}

function saluda(cadena){
    return cadena.repeat(4);
}
div1.innerHTML += cadena1+"-"+aPerO(cadena1);
div2.innerHTML += cadena2 + "-"+ acaStart(cadena2) + " " +cadena3 + "-"+ acaStart(cadena3);
div3.innerHTML += saluda(cadena4);


