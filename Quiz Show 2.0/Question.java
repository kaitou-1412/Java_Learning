class Question
{
	String question;
	int answer;
	String correct_answer;
	Question(String question, int answer, String correct_answer)
	{
		this.question = question;
		this.answer = answer;
		this.correct_answer = correct_answer;
	}
}
// User-Defined Exceptions
class InvalidTelNumException extends Exception
{
	InvalidTelNumException(String s)
	{
		super(s);
	}
}
class InvalidOptionNumException extends Exception
{
	InvalidOptionNumException(String s)
	{
		super(s);
	}
}