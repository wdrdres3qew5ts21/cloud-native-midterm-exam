# cloud-native-midterm-exam
ลุย ลุย ลุย !!! Pivotal X Son.JS
https://www.youtube.com/watch?v=8pCm1mnrVgA
<h1>Config</h1>
<br/>
server.port=9999
<br/>
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
<br/>
spring.datasource.url=jdbc:mysql://cloudnative.coooxnxfhnoi.ap-southeast-1.rds.amazonaws.com:3306/cloudnative
<br/>
spring.datasource.username=linjingyun12
<br/>
spring.datasource.password=lnwzalinjingyun12
<br/>
spring.session.store-type=redis
<br/>
spring.redis.host=18.136.123.171
<br/>
spring.redis.password=lnwzalinjingyun12
<br/>
spring.redis.port=6379 
<br/>

<hr/>
<h1>Class RegisterController</h1>
POST : /register/subject

{ // ID ของวิชาที่ผู้ใช้กดเลือกรายชื่อวิชาเข้ามา
	"id": [
		1, 2	
	],
	"student": { // รูปแบบ Key ที่ต้องใช้ใน student
		"studentId": 59130500097,
		"name": "Supakorn",
	  "surname": "Trakulmaiphol",
	  "department": "IT",
	  "faculty": "SIT",
	  "year": 3
	}
}
<hr/>

<h1>Class RegisterController</h1>
GET : /subjects
แสดงรายชื่อของวิชาออกมาทั้งหมด


<hr/>

<h1>Class RegisterController</h1>
GET : /students
แสดงรายชื่อของนักศึกษาทุกคนออกมา

<hr/>
<h1>Class RegisterController </h1>
GET : /student/{id}
เมื่อใส่ รหัสนักศึกษาจะแสดงรายละเอียดของนักศึกษาออกมาเช่น
/student/59130500097








