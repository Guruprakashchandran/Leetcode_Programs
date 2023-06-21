/**
 * 
 */
// i = 0;
var questions = [{
		"question" : "What is National Game of india? ",
		"option1" : "Hockey",
		"option2" : "Cricket",
		"option3" : "Volly ball",
		"option4" : "None",
		"answer" : 4 
	},
	{
		"question" : "What is National Bird ? ",
		"option1" : "Crow",
		"option2" : "Peacock",
		"option3" : "Duck",
		"option4" : "Eagle",
		"answer" : 2 
	},
	{
		"question" : "who is the Best cricket captain in the world? ",
		"option1" : "MS Dhoni",
		"option2" : "Ricky Ponding",
		"option3" : "Steve Fleming ",
		"option4" : "Mark Wagg",
		"answer" : 2 
	},
	{
		"question" : "Best Kabaddi defence player in india ? ",
		"option1" : "Surjeeth Singh",
		"option2" : "Surendar Nada",
		"option3" : "Ravinder Pahal",
		"option4" : "Mohith Chiller",
		"answer" : 4
	},
	{
		"question" : "How many days in week ?",
		"option1" : "8 Days",
		"option2" : "6 Days",
		"option3" : "7 Days",
		"option4" : "4 Days",
		"answer" : 3
	},
	{
		"question" : "How many days in leap year ?",
		"option1" : "365 Days",
		"option2" : "366 Days",
		"option3" : "367 Days",
		"option4" : "364 Days",
		"answer" : 2
	}
	];
	var mark = 0 ,i=0;
	function question(){

		let value = 0;
		if(questions.length>i){

			if(i>0){

				let output = document.querySelectorAll('input[name = "num"]');
				// let btn = document.querySelector("#btn");
				output.forEach( radioButton =>{

					if(radioButton.checked){

						value = radioButton.value;
					}
				});
				if(questions[i-1].answer ==  value){

					mark++;
				}
			}
			document.getElementById("ptag").innerHTML = '<div class = "ques">'+(i+1)+' ) '+questions[i].question+'</div>' 
						+'<br><br><div class = "optionalignment">'+'<input type="radio" name = "num" value = "1" name = "quiz"> '+questions[i].option1+'</div>'
						+'<br><div class = "optionalignment">'+'<input type="radio" name = "num" value = "2" name = "quiz"> '+questions[i].option2+'</div>'
						+'<br><div class = "optionalignment">'+'<input type="radio" name = "num" value = "3" name = "quiz"> '+questions[i].option3+'</div>'
						+'<br><div class = "optionalignment">'+'<input type="radio" name = "num" value = "4" name = "quiz"> '+questions[i++].option4+'</div>'
						+'<br>'
						if(i == questions.length){

							document.getElementById("ptag").innerHTML+='<div class = "emptyspace"><input class = "buttontype" id = "btn" type = "submit" onclick = "question()" value = "Finish"/></div>';
						}
						else{

							document.getElementById("ptag").innerHTML+='<div class = "emptyspace"><input class = "buttontype" id = "btn" type = "submit" onclick = "question()" value = "next"/></div>';
						}
		}
	 	else {

			let output = document.querySelectorAll('input[name = "num"]');
			let btn = document.querySelector("#btn");
			output.forEach( radioButton =>{

				if(radioButton.checked){

					value = radioButton.value;
				}
			});
			if(questions[i-1].answer == value){
	
				mark++;
				console.log(mark);
			}
			let print = 'Answers submit successfully!!!<br><br>';
			if(mark == questions.length){

				print += '<div class = styleforbrilliantword>You are Brilliant Student!!!</div><br>';
			}
			print += '<br><br><div class = "styleformark"> mark : '+mark+'/'+questions.length+'</div>';
			document.getElementById("quesionid").style.display = "none";
			document.getElementById("ptag").innerHTML = print;
		}
	}
