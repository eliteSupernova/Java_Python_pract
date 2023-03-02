# read
from flask import Flask,jsonify,request,json
# import flask_mysqlbd from MySQL
from flask_restful import Api

from app import connection,cursor

app = Flask(__name__)
api = Api(app)

@app.route("/")
# def emp(self):
#     cursor.excute("select * from emp")
#     row=cursor.fetchall()
#     connection.close()
#     return jsonify({"data":row})

if __name__=="__main__":
    app.run()