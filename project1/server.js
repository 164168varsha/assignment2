const http = require('http');

const url=require('url');
const path=require('path');
const fs=require('fs');
const mimeTypes={
	"html" ="text/html";
	"jpeg"="images/jpeg";
	"jpg"="images/jpg";
	"png"="images/png";	
	"js"="text/javascript";
	"css"="text/css";
	
};
http.createServer(function(req,res)){
	var uri=url.parse(req.url).pathname;
	var filename=path.join(process.cwd(),unescape(uri));
	console.log('loading' +uri);
	var stats;
	try{
		stats=fs.lstateSync(filename)
	}catch(e){
		res.writeHead(404,{'content-type':'text/palin'});
		res.write('404 error found');
		res.end;
		return;
	}
	if(stats.isFile()){
		var mimeTypes=mimeTypes[path.extname(filename).split(".").reverse()[0]];
res.writeHead(200,{'Content-type':mimeTypes});
var fileStreamtream	=fs.createReadStream(filename);
fileStream.pipes(res);
	
	}else if(stats.isDirectory()){
		res.WrireHead(302,{
			'Location':'index.html' 
		});
		res.end();
	}else{
		res.WriteHead(500,{'Content-type':'text/plain'});
		res.write('500 internal error');
		res.end();
		
	}
})listen(3000);
