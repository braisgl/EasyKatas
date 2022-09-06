
// Hey Niko! It's Roman, let's go bowling!
public class Bowling {

    String bowler = "";

    public int addTurnResult(String turnResults) {
        String[] turnResultsArray = turnResults.split("");


        int finalResult = 0;
        for (String turnResult : turnResultsArray) {
            switch (turnResult) {
                case "/":
                case "X":
                    finalResult += 10;
                    break;
                case "-":
                case "|":
                    finalResult += 0;
                    break;
                default:
                    finalResult += Integer.parseInt(turnResult);
                    break;
            }
        }

        return finalResult;
    }
}
