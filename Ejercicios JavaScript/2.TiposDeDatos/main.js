const body = document.querySelector(".body");

var string = "Any Text";
var number = 123.45;
var boolean = true;
var null1 = null;
var undefined1 = undefined;
var sym = Symbol('something');

function array(){
    let arr = [string,number, boolean, null1, undefined1, sym];
    for(var i = 0; i<arr.length; i++){
        body.innerHTML += arr[i]+";"+typeof(arr[i])+"\n";
    }
}


array();

