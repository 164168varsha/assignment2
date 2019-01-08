var express = require('express');
const bodyParser = require("body-parser");
var app = express();



app.use(express.static('public1'));


app.get('/new_name', function (req, res, next) {
    var receivedUsername = req.query.username;
	res.send("receivedUsername");
}).listen(3000);








