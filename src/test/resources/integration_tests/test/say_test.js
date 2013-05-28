var vertx = require('vertx');
var vertxTest = require("vertx_tests");

var vassert = vertxTest.vassert;


function test1(){
    var Say = require("src/main/resources/say.js").Say;
    var say = new Say();
    say.hi({name: 'something'});
    vassert.testComplete();
}


vertxTest.startTests(this);