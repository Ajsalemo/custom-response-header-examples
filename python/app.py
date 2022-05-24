from flask import Flask, jsonify, make_response
app = Flask(__name__)

@app.route('/')
def home():
    return jsonify({ "message": "custom-response-header-examples-python" })


@app.route('/api/headers')
def headers():
    json_res = jsonify({ "message": "Adding custom header.." })
    res = make_response(json_res)
    res.headers['Foo'] = 'bar'
    return res