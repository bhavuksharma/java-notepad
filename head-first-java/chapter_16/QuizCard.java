public class QuizCard {

    private String question;
    private String answer;

    public QuizCard(String theQuestion, String theAnswer){
        question = theQuestion;
        answer = theAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }
}
