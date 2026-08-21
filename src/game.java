import java.util.Scanner;
public class game {
    public static void main(String[]args){
        char [][]paper={{'1','2','3'},
                        {'4','5','6'},
                        {'7','8','9'}};
        System.out.println("========TIC-TAC-TOE========");
        System.out.println("---+---+---");
        System.out.println( ""+"|" +paper[0][0] +" | " +paper[0][1] +" | " +paper[0][2] +" | ");
        System.out.println("===+===+===");
                          System.out.println(""+"|"+paper[1][0] +" | " +paper[1][1] +" | " +paper[1][2] +" | ");
                          System.out.println("===+===+===");
                           System.out.println(""+"|" +paper[2][0] +" | " +paper[2][1] +" | " +paper[2][2] +" | ");
                           System.out.println("---+---+---");
    }

}
