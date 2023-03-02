from flask import Flask,requset


app=Flask(__name__)
app.config['SECRET_KEY']='superkey'
app.config['UPLOAD_FOLDER']='static/files'

mysql=MySQL()
app.config['MYSQL_DATABASE_USER']='root'
app.config['MYSQL_DATABASE_PASSWORD']='password'
app.config['MYSQL_DATABASE_DB']='employee_info'
app.config['MYSQL_DATABASE_HOST']='localhost'
mysql.init_app(app)

@app.route('/new_doc',methods=['GET','POST'])
def new_doc():
    _data = request.files['file']
    if request.method=='POST':
        conn=mysql.connect()
        cur=conn.cursor(pymysql.cursors.DictCursor)
        cur.execute("INSERT INTO files(file_data) values(%s);",_data)
        conn.commit()
        resp=jsonify("DOCUMENT INSERTED SUCCESSFULLY")
        return resp


if __name__ == '__main__':
    app.run(debug=True)