from flask import Flask
import mysql.connector

app = Flask(__name__)
connection = mysql.connector.connect(host="localhost",database="employee",user="root",password="password")
cursor=connection.cursor()

if __name__=="__main__":
    app.run()