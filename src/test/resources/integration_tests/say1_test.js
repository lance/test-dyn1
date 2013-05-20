var vertx = require('vertx');
var vertxTest = require("vertx_tests");
var vassert = vertxTest.vassert;

function testNull(){
    var say = new com.mycompany.myproject.Say();
    say.hi();
    vassert.testComplete();
}

vertxTest.startTests(this);