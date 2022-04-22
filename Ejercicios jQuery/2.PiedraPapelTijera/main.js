let start = document.getElementById('start');
let play = document.getElementsByClassName('play');
let tiro = document.getElementsByClassName('tiro');
let result = document.getElementById('result');
let i = 0;
let j = 0;
let k = 0;

start.innerHTML += '🏁Que comience el juego🏁'

function turnoPC(){
    num = Math.random()
    if(num < 0.33){
        return ['piedra', -1];
    }else if( num < 0.66){
        return ['papel', 0];
    }else{
        return ['tijeras', 1];
    }
}

function tirada(string, num){
    enemy = turnoPC();
    jugada = enemy[1]-num;
    if(i<3 && j < 2 && k<2){
        if(jugada == 0){
            tiro[0].innerHTML += enemy[0] +' vs '+string;
        }else if(jugada == 1 || jugada == -2){
            tiro[0].innerHTML += enemy[0] +' vs '+string;
            i++;
            j++;
        }else{
            tiro[0].innerHTML += enemy[0] +' vs '+string;
            i++;
            k++;
        }
    }else if(j>k){
        result.innerHTML = 'Has perdido!';
    }else{
        result.innerHTML = 'Has ganado!';
    }
}

function partida(string, num){
    tiro[0].innerHTML += 'PC' + 'P1'
    while(i < 3){
        tirada(string, num)
        result.innerHTML = i;
    }
    if(j>k){
        result.innerHTML = 'Has perdido!'
    }else{
        result.innerHTML = 'Has ganado!'
    }
}


