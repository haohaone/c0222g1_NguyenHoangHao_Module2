package _08_clean_code.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class TennisGame {
    public static String getScore(String player1Name,
                                  String player2Name,
                                  int player1Score,
                                  int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            score = twoPlayerSameScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = onePlayerHave40Score(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    score += "-";
                    tempScore = player2Score;
                }

                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String onePlayerHave40Score(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String twoPlayerSameScore(int player1Score) {
        String score;
        switch (player1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
