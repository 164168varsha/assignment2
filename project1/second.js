var express = require('express');
var app = express();
app.get('/year', function(req, res){
var age=req.query.age;
var date=new Date();
var dt=date.getFullYear();

var bornYear=dt-age;

res.send('you were born in ' + bornYear);
});
app.listen(3000); 
 
