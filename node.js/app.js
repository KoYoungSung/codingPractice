var express = require('express')
var app = express()
var bodyParser = require('body-parser')

app.listen(3000, function(){
    console.log("start express server on port 3000 !!")
});

app.use(express.static('public'))
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended:true}))

app.get('/', function(req,res){
    res.sendFile(__dirname + "/public/main.html")
})

app.post('/email_post',function(req,res){
    console.log(req.body)
    res.send("<h1>welcome " + req.body.email + "</h1>")
})