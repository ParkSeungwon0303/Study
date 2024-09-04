package chapter5.training.training10;

abstract class PairMap {
    protected String[] keyArray;    // key 들을 저장하는 배열
    protected String[] valueArray;  // value 들을 저장하는 배열
    abstract String get(String key);// key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value);    // key 와 value 를 쌍으로 저장, 기존에 key 가 있으면, 값을 value 로
    abstract String delete(String key); // key 값을 가진 아이템(value 와 함께) 삭제, 삭제된 value 값 리턴
    abstract int length();  // 현재 저장된 아이템의 개수 리턴
}
