package challenge.question;

public class ansChooser {
    public static boolean execute(String currentAns, boolean ans1, boolean ans2, boolean ans3, boolean ans4) {
        switch (currentAns) {
            case "A":
                if (ans1 && !ans2 && !ans3 && !ans4) {
                    return true;
                }
                break;
            case "B":
                if (!ans1 && ans2 && !ans3 && !ans4) {
                    return true;
                }
                break;
            case "C":
                if (!ans1 && !ans2 && ans3 && !ans4) {
                    return true;
                }
                break;
            case "D":
                if (!ans1 && !ans2 && !ans3 && ans4) {
                    return true;
                }
                break;
        }

        return false;
    }
}
