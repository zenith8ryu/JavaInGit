package problemSet3;

public class LastDigit {
    public int lastDigit(Integer number)
    {
        String numStr = String.valueOf(number);
        int last = Integer.valueOf(numStr.substring(numStr.length() - 1));
        return last;
    }
}
