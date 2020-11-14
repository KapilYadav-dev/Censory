package in.kay.censory;

import android.content.Context;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CensoryLibrary {
    public String defaultCensor(String string, Context context) {
        List<String> words = Arrays.asList(context.getResources().getStringArray(R.array.censored));
        for (String word : words) {
            Pattern rx = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
            string = rx.matcher(string).replaceAll(new String(new char[word.length()]).replace('\0', '*'));
        }
        return string;
    }
    public String customCensor(String string, List<String> list) {
        for (String word : list) {
            Pattern rx = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
            string = rx.matcher(string).replaceAll(new String(new char[word.length()]).replace('\0', '*'));
        }
        return string;
    }
}
