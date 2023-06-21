function friendMessage(){

    let word = "guru<br>guru<br>guru<br>";
    let height = 3 * 100;
    document.querySelector(".friendMessage").style = "height : ";
}
function showProfile(){

    alert("Profile Clicked!!!");
}
function personalchatclick(){
    document.querySelector(".groupChat").style = "background-color : white";
    document.querySelector(".privateChat").style = "background-color : #3e4e53";
    document.querySelector(".privateChat").style = "border-right : 2px solid white";
    document.querySelector(".usersicon").style = "color : #3e4e53";
    document.querySelector(".usericon").style = "color : white";
    console.log("reach");
    let content= "";
    
    for(let i = 0;i < 15;i++){

        content += `<div class = "contact" onclick = "showPersonalMessages(${i})"><span class = "nameContainer">Name${i+1}</span></div>`;
    }
    if(content.length == 0){
        content += '<div class = "no_contacts_Container"><Span class = "nocontacts">No Contacts</span></div>';
        document.getElementById("chatLists").innerHTML = content;
    }
    else{

        let searchBar = '<div class = "userSearchDiv"><input type = "text" class = "userSearch" placeholder = "Search Friend"></div>';
        content = searchBar + content;
        document.getElementById("chatLists").innerHTML = content;
    }
}
function groupchatclick(){

    // console.log("reach");
    let content= "";
    document.querySelector(".privateChat").style = "background-color : white";
    document.querySelector(".groupChat").style = "background-color : #3e4e53";
    document.querySelector(".groupChat").style = "border-right : 2px solid white";
    document.querySelector(".usericon").style = "color : #3e4e53"
    document.querySelector(".usersicon").style = "color :white"
    for(let i = 0;i < 5;i++){

        content += `<div class = "contact" onclick = "showGroupMessages(${i})"><span class = "nameContainer">Group</span></div>`;
    }
    if(content.length == 0){
        content += `<div class = "no_contacts_Container"><Span class = "nocontacts">No Contacts</span></div>`;
        document.getElementById("chatLists").innerHTML = content;
    }
    else{

        let searchBar = '<div class = "userSearchDiv"><input type = "text" class = "userSearch" placeholder = "Search Group"></div>';
        content = searchBar + content;
        document.getElementById("chatLists").innerHTML = content;
    }
}
function showPersonalMessages(i){

    // document.querySelector(".BackgroundImage").style = "display : none";
    let messages = "";
    messages += '<div class = "messageHeader">'
    messages += `<span class = "chatNameStyle">Name ${i+1}</span>`
    // messages += '</div>'
    messages += '<div class = "messages">'
    messages += '<div class = "messagesAdjustment">'
    // messages += '<p>punitha</p>'
    // messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages += '<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'
    //     messages +='<p>punitha</p>'

    messages += '<div class = "friendChat"><p class = "friendMessage">guru<br>guru<br>guru<br>guru<br></p></div>';
    messages += '<div class = "yourChat"><p class = "yourMessage">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Cupiditate, molestiae! Eveniet alias, blanditiis laboriosam quasi quis harum recusandae! Aut labore voluptatum autem rerum. Iste sapiente quisquam maiores quam, aut voluptatibus nisi minima. Aut amet pariatur inventore ex, natus est nisi consectetur voluptatem consequuntur porro modi, optio mollitia quas accusamus recusandae?</p></div>'
    messages += '<div class = "friendChat"><p class = "friendMessage">guru<br>guru<br>guru<br>guru<br></p></div>';
        messages += '</div>'
     messages += '</div>'
        messages += '<div class = "searchBar">'
        messages += '<input type = "text" class = "searchBarStyle" placeholder = "Enter Message">'
        messages += '</div>'
        document.querySelector(".messagesList").innerHTML = messages;
        console.log(messages);
}