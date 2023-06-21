/**
 *
 */
var index = 0;
var editableIndex;
var userName,
  userMobileNo,
  userEmailId,
  userDateOfBirth,
  userAbout,
  userPassword,
  userConfirmPassword;

function saveContents() {
  alert("success!!!");
}

function textBoxtoLabelConvert() {
  switch (index) {
    case 0:
      userName = document.querySelector(".userName").value;
      if (userName != null && userName.length != 0) {
        document.querySelector(".userNameDiv").style = "display:none";
        document.querySelector(".setUserName").innerHTML =
          "  " +
          `  ${userName}<i onclick='hideLabels(${0})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userNameText").style = "display:block";
        console.log(userName);
        document.querySelector(".userMobileNoDiv").style = "display:block";
        index++;
        selectingButton();
      } else {
        alert("please!! Enter Valid Name!!!");
      }
      break;
    case 1:
      //   document.querySelector(".userMobileNo").value = "";
      userMobileNo = document.querySelector(".userMobileNo").value;
      if (userMobileNo.length == 10) {
        document.querySelector(".userMobileNoDiv").style = "display:none";
        document.querySelector(".setUserMobileNo").innerHTML =
          "  " +
          `  ${userMobileNo}<i onclick='hideLabels(${1})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userMobileNoText").style = "display:block";
        document.querySelector(".userEmailIdDiv").style = "display:block";
        index++;
        selectingButton();
      } else {
        alert("please!! Enter Correct Mobile Number!!!");
      }
      break;
    case 2:
      //   document.querySelector(".userEmailId").value = "";
      const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      userEmailId = document.querySelector(".userEmailId").value;
      if (userEmailId != null && userEmailId.match(emailPattern)) {
        document.querySelector(".userEmailIdDiv").style = "display:none";
        document.querySelector(".setUserEmailId").innerHTML =
          "  " +
          `  ${userEmailId}<i onclick='hideLabels(${2})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userEmailIdText").style = "display:block";
        document.querySelector(".userDateOfBirthDiv").style = "display:block";
        index++;
        selectingButton();
      } else {
        alert("please!! Enter Email Id!!!");
      }
      break;
    case 3:
      //   document.querySelector(".userDateOfBirth").value = "";
      userDateOfBirth = document.querySelector(".userDateOfBirth").value;
      if (userDateOfBirth != null && userDateOfBirth.length != 0) {
        document.querySelector(".userDateOfBirthDiv").style = "display:none";
        document.querySelector(".setUserDateOfBirth").innerHTML =
          "  " +
          `  ${userDateOfBirth}<i onclick='hideLabels(${3})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userDateOfBirthText").style = "display:block";
        document.querySelector(".userAboutDiv").style = "display:block";
        index++;
        selectingButton();
      } else {
        alert("plss!! select your DOB");
      }
      break;
    case 4:
      //   document.querySelector(".userAbout").value = "";
      userAbout = document.querySelector(".userAbout").value;
      if (userAbout != null && userAbout.length != 0) {
        document.querySelector(".userAboutDiv").style = "display:none";
        document.querySelector(".setUserAbout").innerHTML =
          "  " +
          `  ${userAbout}<i onclick='hideLabels(${4})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userAboutText").style = "display:block";
        document.querySelector(".userPasswordDiv").style = "display:block";
        index++;
        selectingButton();
      } else {
        alert("please!! Enter About!!!");
      }
      break;
    case 5:
      //   document.querySelector(".userPassword").value = "";
      userPassword = document.querySelector(".userPassword").value;
      if (userPassword != null && userPassword.length > 7) {
        document.querySelector(".userPasswordDiv").style = "display:none";
        document.querySelector(".setUserPassword").innerHTML =
          "  " +
          `  ${userPassword}<i onclick='hideLabels(${5})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userPasswordText").style = "display:block";
        document.querySelector(".userConfirmPasswordDiv").style =
          "display:block";
        index++;
        selectingButton();
      } else {
        alert("Password Length must be 8 Characters!!!");
      }
      break;
    case 6:
      //   selectingButton();
      //   document.querySelector(".userConfirmPassword").value = "";
      userConfirmPassword = document.querySelector(
        ".userConfirmPassword"
      ).value;
      if (userConfirmPassword != null && userPassword == userConfirmPassword) {
        document.querySelector(".userConfirmPasswordDiv").style =
          "display:none";
        document.querySelector(".setUserName").innerHTML +=
          "  " +
          `  ${userConfirmPassword}<i onclick='hideLabels(${6})' class='fa fa-pencil editIcon'></i>`;
        document.querySelector(".userConfirmPasswordText").style =
          "display:block";
        // index++;
      } else {
        alert("Wrong Confirm Password!!!");
      }
      break;
  }
  //   console.log(index);
}

function selectingButton() {
  //   console.log(index);
  if (index == 6) {
    document.querySelector(".userNextButtonDiv").style = "display:none";
    document.querySelector(".userSignUpButtonDiv").style = "display:block";
  } else {
    document.querySelector(".userNextButtonDiv").style = "display:block";
    document.querySelector(".userSignUpButtonDiv").style = "display:none";
  }
}

function hideLabels(i) {
  switch (i) {
    case 0:
      document.querySelector(".userNameDiv").style = "display:none";
      document.querySelector(".userNameText").style = "display:none";
    case 1:
      document.querySelector(".userMobileNoDiv").style = "display:none";
      document.querySelector(".userMobileNoText").style = "display:none";
    case 2:
      document.querySelector(".userEmailIdDiv").style = "display:none";
      document.querySelector(".userEmailIdText").style = "display:none";
    case 3:
      document.querySelector(".userDateOfBirthDiv").style = "display:none";
      document.querySelector(".userDateOfBirthText").style = "display:none";
    case 4:
      document.querySelector(".userAboutDiv").style = "display:none";
      document.querySelector(".userAboutText").style = "display:none";
    case 5:
      document.querySelector(".userPasswordDiv").style = "display:none";
      document.querySelector(".userPasswordText").style = "display:none";
    case 6:
      document.querySelector(".userConfirmPasswordDiv").style = "display:none";
      document.querySelector(".userConfirmPasswordText").style = "display:none";
  }
  index = i;
  changeContent();
}

function changeContent() {
  selectingButton();
  switch (index) {
    case 0:
      document.querySelector(".userNameDiv").style = "display:block";
      document.querySelector(".userName").value = userName;
      break;
    case 1:
      document.querySelector(".userMobileNoDiv").style = "display:block";
      document.querySelector(".userMobileNo").value = userMobileNo;
      break;
    case 2:
      document.querySelector(".userEmailIdDiv").style = "display:block";
      document.querySelector(".userEmailId").value = userEmailId;
      break;
    case 3:
      document.querySelector(".userDateOfBirthDiv").style = "display:block";
      document.querySelector(".userDateOfBirth").value = userDateOfBirth;
      break;
    case 4:
      document.querySelector(".userAboutDiv").style = "display:block";
      document.querySelector(".userAbout").value = userAbout;
      break;
    case 5:
      document.querySelector(".userPasswordDiv").style = "display:block";
      document.querySelector(".userPassword").value = userPassword;
      break;
    case 6:
      document.querySelector(".userConfirmPasswordDiv").style = "display:block";
      document.querySelector(".userConfirmPassword").value =
        userConfirmPassword;
      break;
  }
}
function editUserName() {
  editableIndex = 0;
}
function editUserMobileNo() {
  editableIndex = 1;
}
function editUserEmailId() {
  editableIndex = 2;
}
function editUserDateOfBirth() {
  editableIndex = 3;
}
function editUserAbout() {
  editableIndex = 4;
}
function editUserPassword() {
  editableIndex = 5;
}
function editUserConfirmPassword() {
  editableIndex = 6;
}
