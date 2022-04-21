let numero = 1;
let i = 0;
do{
    //Primero hará este paso
    if(i===0){
        //Aquí i pasará a valer 1
        i++;
        //numero pasará a 0
        numero--;
        console.log(numero);
    //El siguiente paso será este,
    //y i se mantendrá en 1.
    }else{
        //Numero aumentará en uno
        //a cada iteración
        numero++;
        console.log(numero);
    }
//Realizará este proceso hasta que
//numero llegue a 5.
}while(numero<5);