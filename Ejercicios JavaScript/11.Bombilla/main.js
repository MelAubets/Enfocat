let buttOn= document.createElement('img');
buttOn.src = "./Images/bon.jpg";
let buttOff = document.createElement('img');
buttOff.src = "./Images/boff.jpg";
let imgOn= document.createElement('img');
imgOn.src = "./Images/on.jpg";
let imgOff = document.createElement('img');
imgOff.src = "./Images/off.jpg";

let button = document.getElementById("button");
let bulb = document.getElementById("bulb");
let slider = document.getElementById("myRange");

let bool = false;

button.appendChild(buttOff);
bulb.appendChild(imgOff);

function on(){
    if(bool == false){
        button.innerHTML='';
        button.appendChild(buttOn);
        bulb.innerHTML='';
        bulb.appendChild(imgOn);
        bool = true;
    }else{
        button.innerHTML='';
        button.appendChild(buttOff);
        bulb.innerHTML='';
        bulb.appendChild(imgOff);
        bool = false;
    }
}

slider.oninput = function() {
    bulb.innerHTML = '';
    if(this.value < 20){
        button.innerHTML='';
        button.appendChild(buttOff);
        bulb.innerHTML='';
        bulb.appendChild(imgOff).style.opacity = 0.5-(this.value/100);
        bool = false;
    }else{
        bulb.innerHTML='';
        bulb.appendChild(imgOn).style.opacity = this.value/100;
        button.innerHTML = '';
        button.appendChild(buttOn);
        bool = true;
    }
}