package 作业.作业3_1;

import java.util.*;

// 观察者接口
interface Observer {
    void update(Subject subject);
}

// 主题接口
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

// 可编辑文本区
class EditTextArea implements Subject {
    private String text;
    private Set<Observer> observers = new HashSet<>();

    public EditTextArea(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
        notifyObservers();
    }

    public String getText() {
        return text;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

// 单词总数量和字符总数量统计器
class WordCharCounter implements Observer {
    private EditTextArea editTextArea;
    private int totalWordCount = 0;
    private int totalCharCount = 0;

    public WordCharCounter(EditTextArea editTextArea) {
        this.editTextArea = editTextArea;
        calculateCounts();
    }

    private void calculateCounts() {
        String text = editTextArea.getText();
        totalCharCount = text.length();
        totalWordCount = text.split("\\s+").length;
        display();
    }

    @Override
    public void update(Subject subject) {
        if (subject == editTextArea) {
            calculateCounts();
        }
    }

    public void display() {
        System.out.println("单词总数: " + totalWordCount);
        System.out.println("字符总数: " + totalCharCount);
    }
}

// 单词去重后按照字典序排序统计器
class WordSorter implements Observer {
    private EditTextArea editTextArea;
    private List<String> wordList = new ArrayList<>();

    public WordSorter(EditTextArea editTextArea) {
        this.editTextArea = editTextArea;
        sortWords();
    }

    private void sortWords() {
        String[] words = editTextArea.getText().split("\\s+");
        wordList = Arrays.asList(words);
        wordList = new ArrayList<>(new HashSet<>(wordList));
        Collections.sort(wordList);
        display();
    }

    @Override
    public void update(Subject subject) {
        if (subject == editTextArea) {
            sortWords();
        }
    }

    public void display() {
        System.out.println("单词列表: " + wordList);
    }
}

// 按出频次降序显示单词统计器
class WordFrequencyCounter implements Observer {
    private EditTextArea editTextArea;
    private Map<String, Integer> wordFreqDict = new HashMap<>();

    public WordFrequencyCounter(EditTextArea editTextArea) {
        this.editTextArea = editTextArea;
        countWordFreq();
    }

    private void countWordFreq() {
        wordFreqDict.clear();
        String[] words = editTextArea.getText().split("\\s+");
        for (String word : words) {
            wordFreqDict.put(word, wordFreqDict.getOrDefault(word, 0) + 1);
        }
        display();
    }

    @Override
    public void update(Subject subject) {
        if (subject == editTextArea) {
            countWordFreq();
        }
    }

    public void display() {
        List<Map.Entry<String,Integer>> sortedWordFreq = new ArrayList<>(wordFreqDict.entrySet());
        Collections.sort(sortedWordFreq, new WordFreqComparator());
        System.out.println("单词频率:");
        for (Map.Entry<String,Integer> entry : sortedWordFreq) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    class WordFreqComparator implements Comparator<Map.Entry<String,Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            return e2.getValue().compareTo(e1.getValue());
        }
    }
}

// 测试
public class Main {
    public static void main(String[] args) {
        EditTextArea editTextArea = new EditTextArea("This is a test. It is only a test.");
        WordCharCounter wordCharCounter = new WordCharCounter(editTextArea);
        WordSorter wordSorter = new WordSorter(editTextArea);
        WordFrequencyCounter wordFreqCounter = new WordFrequencyCounter(editTextArea);

        editTextArea.attach(wordCharCounter);
        editTextArea.attach(wordSorter);
        editTextArea.attach(wordFreqCounter);
    }
}