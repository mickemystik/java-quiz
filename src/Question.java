
public class Question {
	private String question, choice1, choiceX, choice2, correctAnswer;
	public Question(String question, String choice1, String choiceX, String choice2, String correctAnswer) {
		this.question = question;
		this.choice1 = choice1;
		this.choiceX = choiceX;
		this.choice2 = choice2;
		this.correctAnswer = correctAnswer;
	}
	//Returns the Question
	public String getQuestion(){return question;}
	//returns the first choice.
	public String getChoice1(){return choice1;}
	//returns the X choice.
	public String getChoiceX(){return choiceX;}
	//returns the second choice.
	public String getChoice2(){return choice2;}
	//returns the correct answer.
	public String getCorrectAnswer(){return correctAnswer;}
}
