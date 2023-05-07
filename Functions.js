
const calcAverage = (a, b, c) => (a + b + c)/3;
console.log(calcAverage(3, 4, 5));

//Test one
const scoreDolphins = calcAverage (44, 23, 71);
const scoreKoalas = calcAverage(65, 54, 49);

function checkWinner (avgDolphins , avgKoalas) {
    if (scoreDolphins >= 2 * avgKoalas) {
        console.log('Dolphins win');
    } else if (avgKoalas >= 2 * scoreDolphins ) {
        console.log('Koalas win');
    } else {
        console.log('Sorry there is not a winner');
    }
}

checkWinner(scoreDolphins, scoreKoalas );
checkWinner(576, 111);