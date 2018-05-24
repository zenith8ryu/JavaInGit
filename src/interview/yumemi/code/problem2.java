package interview.yumemi.code;

import tools.CsvReader;

import java.util.*;

public class problem2 {
    private static String filePath = "./src/challenge/yumemi/resource/0.csv";


    public static void main(String[] args) {
        ArrayList<String> scoreList = CsvReader.readCsvFile(filePath, true);

        Iterator<Map.Entry<String, Integer>> iter = scoreSearch(scoreList, true).entrySet().iterator();
        Map.Entry entry = iter.next();
        System.out.println((String) entry.getKey());
        System.out.println(entry.getValue());

        System.out.println("id");
        for (String elem : dropoutIdSearch(scoreList)) {
            System.out.println(elem);
        }
    }

    /**
     * Search the highest/lowest score in a score list.
     *
     * @param scoreList   Raw content of score list imported from csv file.
     * @param isMaxSearch : true -> search max score; false -> search min score
     * @return [key] target student id, [val] mean score(highest/lowest)
     */
    public static HashMap<String, Integer> scoreSearch(ArrayList<String> scoreList, boolean isMaxSearch) {
        HashMap<String, Integer> maxScoreMap = new HashMap<>();
        String targetId = null;
        int targetScore = 0;

        Iterator<Map.Entry<String, Integer>> iter = avgScoreCalc(scoreList).entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = iter.next();
            Integer currScore = (Integer) entry.getValue();

            if (targetScore == 0) {
                targetScore = currScore;
            }

            if (isMaxSearch) {
                if (currScore > targetScore) {
                    targetId = (String) entry.getKey();
                    targetScore = currScore;
                }
            } else {
                if (currScore < targetScore) {
                    targetId = (String) entry.getKey();
                    targetScore = currScore;
                }
            }
        }

        maxScoreMap.put(targetId, targetScore);
        return maxScoreMap;
    }

    /**
     * Calc the mean score of every student
     *
     * @param scoreList
     * @return [key] id, [val] mean score.
     */
    public static HashMap<String, Integer> avgScoreCalc(ArrayList<String> scoreList) {
        HashMap<String, Integer> meanScoreList = new HashMap<>();
        String id;
        int sumScore;
        int lectureNums;

        for (String row : scoreList) {
            sumScore = 0;
            lectureNums = 0;
            String[] rowContents = row.split(",");

            id = rowContents[0];
            for (int i = 1, j = rowContents.length; i < j; i++) {
                sumScore += Integer.parseInt(rowContents[i]);
                lectureNums++;
            }

            meanScoreList.put(id, sumScore / lectureNums);
        }

        return meanScoreList;
    }

    public static ArrayList<String> dropoutIdSearch(ArrayList<String> scoreList) {
        ArrayList<String> nameList = new ArrayList<>();
        int dropoutCnts;
        String id;

        for (String row : scoreList) {
            String[] rowContents = row.split(",");
            id = rowContents[0];
            dropoutCnts = 0;


            for (int i = 1, j = rowContents.length; i < j; i++) {
                if (Integer.parseInt(rowContents[i]) < 49) {
                    dropoutCnts++;
                }
            }

            if (dropoutCnts >= 2) {
                nameList.add(id);
            }
        }

        return nameList;
    }

}
