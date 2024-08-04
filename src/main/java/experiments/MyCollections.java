package experiments;

import java.util.*;

public class MyCollections {

  public static void main(String[] args) {
    mapCollections();
    //setCollections();
    //listCollections();

  }

  public static void mapCollections(){
    Map<Integer, String> integerStringMap = new HashMap<>();
    integerStringMap.put(1, "one");
    integerStringMap.put(2, "one");
    integerStringMap.put(33, "three");
    integerStringMap.put(4, "two");
    integerStringMap.put(9, "nine");

    System.out.println(integerStringMap);
    //------------------------------------
    Map<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();
    integerStringLinkedHashMap.put(1, "one");
    integerStringLinkedHashMap.put(2, "one");
    integerStringLinkedHashMap.put(33, "three");
    integerStringLinkedHashMap.put(4, "two");
    integerStringLinkedHashMap.put(9, "nine");

    System.out.println(integerStringLinkedHashMap);
    //------------------------------------
    Map<Integer, String> integerStringTreeMap = new TreeMap<>();
    integerStringTreeMap.put(1, "one");
    integerStringTreeMap.put(2, "one");
    integerStringTreeMap.put(33, "three");
    integerStringTreeMap.put(4, "two");
    integerStringTreeMap.put(9, "nine");

    System.out.println(integerStringTreeMap);
  }

  public static void setCollections(){
    Set<String> stringSet = new HashSet<>();
    stringSet.add("123");
    stringSet.add("234");
    stringSet.add("2");
    stringSet.add("3");
    stringSet.add("4");
    stringSet.add("2");
    stringSet.add("11");
    stringSet.add("12");
    stringSet.remove("2");
    System.out.println("set --> " + stringSet);
    //------------------------------------
    Set<String> stringLinkedHashSet = new LinkedHashSet<>();
    stringLinkedHashSet.add("123");
    stringLinkedHashSet.add("234");
    stringLinkedHashSet.add("2");
    stringLinkedHashSet.add("3");
    stringLinkedHashSet.add("4");
    stringLinkedHashSet.add("2");
    stringLinkedHashSet.add("11");
    stringLinkedHashSet.add("12");
    stringLinkedHashSet.remove("2");
    System.out.println("linked set --> " + stringLinkedHashSet);
    //------------------------------------
    Set<String> stringTreeSet = new TreeSet<>();
    stringTreeSet.add("123");
    stringTreeSet.add("234");
    stringTreeSet.add("2");
    stringTreeSet.add("3");
    stringTreeSet.add("4");
    stringTreeSet.add("2");
    stringTreeSet.add("11");
    stringTreeSet.add("12");
    stringTreeSet.remove("2");
    System.out.println("tree set --> " + stringTreeSet);
  }

  public static void listCollections(){
    List<String> stringList = new ArrayList<>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("three");
    stringList.add("one");
    System.out.println("list --> " + stringList);
    stringList.add(2, "new");
    System.out.println("list --> " + stringList);
    System.out.println("size --> " + stringList.size());
    System.out.println("--> " + stringList.isEmpty());
    System.out.println("second --> " + stringList.get(1));
    System.out.println("remove --> " + stringList.remove(4));
    stringList.set(1, "newTwo");
    System.out.println("--> " + stringList);
    //----------------------------------------------------
    List<Integer> integerList = new LinkedList<>();

  }
}

