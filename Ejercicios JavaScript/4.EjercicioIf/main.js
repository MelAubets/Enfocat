function bulb(){
    return Math.round(Math.random());
}

var light = bulb();

if(light == 0){
    document.write(" ");
}else{
    document.write("💡");
}


