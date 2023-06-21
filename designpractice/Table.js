var datas = [];
console.log("s");
function addData(){
    let name = document.getElementById("name");
    let age = document.getElementById("age");
    let mark = document.getElementById("mark");
    let data = [name,age,mark];
    datas.addData(data);
}
function showData(){
    console.log('i');
    let s = '<div class = "InputDatas"> <input type = "number" id = "age" placeholder = "Enter Your Name"></div>';
    s += '<div class = "InputDatas"> <input type = "number" id = "age" placeholder = "Enter Your Age"></div>';
    s += '<div class = "InputDatas"><input type = "number" id = "mark" placeholder = "Enter Your Mark"></div>';
    s += '<div class="InputDatas"> <input type="submit" onClick = "addData()"class = "SubmitButton" value = "Add Data"></div>';
    document.getElementById("getInputs").innerHTML = s;
}