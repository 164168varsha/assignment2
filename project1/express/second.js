var express = require('express');
var app = express();

app.get('/:year/:id', function(req, res) {
   var age=req.params.id;
   var bornYear=req.params.year - age;
   res.send("you born year=" +bornYear)
});
app.listen(3000);