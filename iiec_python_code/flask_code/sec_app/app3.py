from flask import Flask, request, render_template, jsonify

app = Flask("myiiec")


db = [
    {
        # first student
        "id":1,
        "name": "vikash",
        "contact": [
            {
                "name": "landline",
                "number": 1111,
            },
            {
                "name": "mob",
                "number": 2222,
            }
        ]
    } ,
    {
        # sec student
        "id": 2,
        "name": "krish",
        "surname": "abc"
    },
    
]

@app.route('/spost' , methods=["GET"])
def f1():
    return jsonify(db)

@app.route('/spost' , methods=["DELETE"])
def f2():
    return "delete a post"

@app.route('/spost' , methods=["PUT"])
def f3():  
    return "update a post"

@app.route('/spost' , methods=["POST"])
def f4():
    return "create a post"




"""
# static route
@app.route('/form')
def myform():
	return render_template("basic1.html")


# dynamic route
@app.route('/name/<y>')
def myname(y):
	return y


@app.route('/data', methods=['POST'])
def mydata():
	if request.method == 'POST': 
		data = request.args.get("x")
		print(data)
	return data
"""


app.run(port=5555, debug=True)
