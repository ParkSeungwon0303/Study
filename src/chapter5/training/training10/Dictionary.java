package chapter5.training.training10;

public class Dictionary extends PairMap {
    private int count;

    public Dictionary(int num) {
        keyArray = new String[num];
        valueArray = new String[num];
        count = 0;
    }

    @Override
    String get(String key) {
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = value;
            }

        }
        keyArray[count] = key;
        valueArray[count]= value;
        count++;
    }

    @Override
    String delete(String key) {
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) {
                String str = valueArray[i];
                valueArray[i] = null;
                return str;
            }
        }
        return null;
    }

    @Override
    int length() {
        return count;
    }
}
