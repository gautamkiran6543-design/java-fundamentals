import java.util.Scanner;
public class quizquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //this array is for question
        String[][] question = {{"1.what is the brain of computer?",
                "A.CPU",
                "B.RAM",
                "C.DATA",
                "D.MEMORY"},
                {"2.what is my name?",
                        "A.KIRAN",
                        "B.SANDESH",
                        "C.DEWA",
                        "D.DIPESH"},
                {"3.Which is the saddest emojii?",
                        "A.😊",
                        "B.😘",
                        "C.😒",
                        "D.😍"},
                {"4.How many days in a week?",
                "A.5",
                "B.2",
                "C.12",
                "D.7"},
                {"5.What is the formula of force?",
                "A.F=GM",
                "B.F=ma",
                "C.F=dt",
                "D.F=vm"}

        };
        String[]answer={"A","A","C","D","B"}; //this is for correct answer
        boolean flag = true;
        int score=0;
        while (flag) {
            System.out.println("------😱😱😱😱😱WELCOME TO TOUGH QUIZ GAME😱😱😱😱😱-------");
            System.out.println("1.START QUIZ");
            System.out.println("2.SHOW QUESTION");
            System.out.println("3.SHOW RESULT");
            System.out.println("4.EXIT");
            System.out.println("ENTER A CHOICE:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                     score=0;
                    // it show both question and options
                    for (int i = 0; i < question.length; i++) {
                        for (int j = 0; j < question[i].length; j++) {
                            System.out.println(question[i][j]);


                        }
                        System.out.println("Enter a answer:");
                        String correctanswer = sc.next();
                        if(correctanswer.equalsIgnoreCase(answer[i])){
                            System.out.println("😍😍😍😍😍CORRECT ANSWER😍😍😍😍😍");
                            score=score+2;

                        }
                        else {
                            System.out.println("😒😒😒😒😒WRONG ANSWER😒😒😒😒😒");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < question.length; i++) {
                        System.out.println((i + 1) + " " + question[i][0]);
                    }
                    break;
                case 3:
                    System.out.println("=====🤷‍♂️🤷‍♂️🤷‍♂️RESULT🤷‍♂️🤷‍♂️🤷‍♂️=====:");
                    System.out.println("your score="+ score);
                    break;
                case 4:
                    System.out.println("🙉🙉🙉Thank you🙉🙉🙉");
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
        sc.close();
    }
}


