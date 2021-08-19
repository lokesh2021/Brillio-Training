function addDept(empid, name, email, num, role) {
  var dept = {
    id: empid,
    name: name,
    email: email,
    num: num,
    role: role,
  };
  console.log(dept);
  fetch("http://localhost:3000/dept/", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(dept),
  }).then((res) => {
    console.log(res);
  });
}

//Updating the Data in db.json using json server
function editDept(empid, name, email, num, role) {
  let dept = {
    id: empid,
    name: name,
    email: email,
    num: num,
    role: role,
  };
  fetch("http://localhost:3000/dept/" + dept.id, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(dept),
  }).then((res) => {
    console.log(res);
  });
}

//Deleting Data in db.json using json server
function deleteDept(eid1) {
  fetch("http://localhost:3000/dept/" + eid1, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  }).then((res) => {
    console.log(res);
  });
}

//Fetching the Data from db.json using json server
function getDept() {
  fetch("http://localhost:3000/dept")
    .then((res) => {
      return res.json();
    })
    .then((dept) => {
      console.log(dept);
      var res = JSON.stringify(dept, null, 4);
      console.log(res);

      let text =
        '<table border=\'1\' class="table" style="margin-top:2rem"><tr><th>Employee ID</th><th>Employee Name</th><th>Employee Email</th><th>Employee Mobile Number</th><th>Employee Designation</th></tr>';
      for (let x in dept) {
        text +=
          "<tr><td>" +
          dept[x].id +
          "</td><td>" +
          dept[x].name +
          "</td><td>" +
          dept[x].email +
          "</td><td>" +
          dept[x].num +
          "</td><td>" +
          dept[x].role +
          "</td></tr>";
      }
      text += "</table>";
      document.getElementById("student").innerHTML = text;
    });
}
