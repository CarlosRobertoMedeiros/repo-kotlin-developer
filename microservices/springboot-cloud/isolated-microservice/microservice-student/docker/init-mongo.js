// init-mongo.js
db.createUser({
  user: "admin",
  pwd: "adminpassword",
  roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
});

db.createUser({
  user: "dbstudentadm",
  pwd: "dbstudentadm",
  roles: [ { role: "readWrite", db: "student_db" } ]
});