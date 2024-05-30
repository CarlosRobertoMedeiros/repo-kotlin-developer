// init-mongo.js
db.createUser({
  user: "dbstudentadm",
  pwd: "dbstudentadm",
  roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
});