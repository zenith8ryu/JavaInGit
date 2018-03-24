package tools;

import java.io.*;
import java.util.ArrayList;

public class CsvReader {
    /**
     * Tool provide basic function of import files(csv, txt, etc...).
     *
     * @param filePath The path of target input files.
     * @param rmvHead  A trigger of remove the first line of a csv file, or not.
     * @return
     */
    public static ArrayList<String> readCsvFile(String filePath, boolean rmvHead) {
        ArrayList<String> csvContents = new ArrayList<>();

        try {
            File file = new File(filePath);
            BufferedReader br;
            String row;
            int rowCnt = 0;

            br = new BufferedReader(new FileReader(file));

            while ((row = br.readLine()) != null) {
                rowCnt++;
                if (rmvHead && rowCnt == 1) {
                    continue;
                }
                csvContents.add(row);
            }
            br.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return csvContents;
    }

}
