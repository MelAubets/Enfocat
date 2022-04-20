let diaSemana = Number(prompt("Introduce un numero del 1 al 7"));

function semana(diaSemana){
    switch(diaSemana){
        case 1: alert("Dilluns");break;
        case 2: alert("Dimarts");break;
        case 3: alert("Dimecres");break;
        case 4: alert("Dijous");break;
        case 5: alert("Divendres");break;
        case 6: alert("Dissabte");break;
        case 7: alert("Diumenge");break;
        default:
            alert("No es un numero entre el uno y el siete!");
            semana(Number(prompt("Introduce un numero del 1 al 7")));
    }
}

semana(diaSemana);
