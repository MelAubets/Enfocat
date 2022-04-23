let wins = document.getElementById('wins');
let start = document.getElementById('start');
let players = document.getElementById('players');
let play = document.getElementById('play');
let result = document.getElementById('result');
let j = 0;
let k = 0;
let win = 0;
let lose = 0;

wins.innerHTML = 'wins: '+win+' loses: '+lose;
start.innerHTML = '🏁Que comience el juego🏁'
players.innerHTML = 'P1 vs PC'

function turnoPC(){
    num = Math.random()
    if(num < 0.33){
        return ['🌑', -1];
    }else if( num < 0.66){
        return ['🧾', 0];
    }else{
        return ['✂️', 1];
    }
}

function tirada(string, num){
    enemy = turnoPC();
    jugada = enemy[1]-num;
    if(j < 2 && k < 2){
        if(jugada == 0){
            var turn = document.createElement('div');
            turn.innerHTML = string + ' vs '+ enemy[0];
            play.appendChild(turn);
        }else if(jugada == 1 || jugada == -2){
            var turn = document.createElement('div');
            turn.innerHTML = string + ' vs '+ enemy[0];
            play.appendChild(turn);
            j++;
            if(j == 2){
                var result = document.createElement('div');
                result.innerHTML = 'Has perdido!';
                play.appendChild(result);
                var restart = document.createElement('button');
                restart.innerHTML = 'Reiniciar';
                restart.onclick = function(){
                    play.innerHTML = '';
                    j = 0, k = 0,lose++;
                    wins.innerHTML = 'wins: '+win+' loses: '+lose;
                }
                play.appendChild(restart);
            }
        }else{
            var turn = document.createElement('div');
            turn.innerHTML = string + ' vs '+ enemy[0];
            play.appendChild(turn);
            k++;
            if(k==2){
                var result = document.createElement('div');
                result.innerHTML = 'Has ganado!';
                play.appendChild(result);
                var restart = document.createElement('button');
                restart.innerHTML = 'Reiniciar';
                restart.onclick = function(){
                    play.innerHTML = '';
                    j = 0, k = 0, win++;
                    wins.innerHTML = 'wins: '+win+' loses: '+lose;
                }
                play.appendChild(restart);
            }
        }
    }
}
