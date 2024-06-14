db = db.getSiblingDB("dbstudent");

db.createUser({
    user: "dbstudentadm",
    pwd: "dbstudentadm",
    roles: [
      {
        role: 'readWrite', 
        db: 'dbstudent'
      },
    ],
  });

db.createCollection("student_collection");

db.student_collection.insertMany([
	{
	  "studentId": 1,
	  "cpf": "88888888888",
	  "name": "Lianna",
	  "birthday": "2000-01-03",
	  "gender": "F",
	  "createdAt": "2024-01-03",
	  "updatedAt": "2024-01-03"
	},
	{
	  "studentId": 2,
	  "cpf": "88888888888",
	  "name": "Mauricio",
	  "birthday": "2000-01-03",
	  "gender": "M",
	  "createdAt": "2024-01-03",
	  "updatedAt": "2024-01-03"
	}
])