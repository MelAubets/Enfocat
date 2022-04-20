var m_name = prompt("Write your name");
var m_surname = prompt("Write your surname");


const nombres = (name, surname) => {
    return (name+" "+surname);
}

function VerdadOMentira(){
    m_bool = prompt("1+2");
    if(isNaN(m_bool)){
        alert("Error, debes introducir un número!!");
        return(VerdadOMentira());
    }else{
        if(Number(m_bool) == 3){
            return(true);
        }else{
            return(false);
        }
    }
}

const numeros = function(...numbers){
    numbers.forEach(element => {
        document.write(element+" ")
    });
}

document.write(nombres(m_name, m_surname)+" "+VerdadOMentira()+" ");
numeros(1,2,3,4,5)