package JavaPractice;

/*
public class IteratingArrayListUsingIteratorAndEntrySet {

  public static void main(String[] args) throws IOException {


    FileInputStream fis = new FileInputStream("D:\\PracticeAutomation\\src\\main\\java\\Resources\\mapper.json");

    HashMap<String, String> map = new HashMap<String, String>();

    ObjectMapper mapper = new ObjectMapper();

    List<HashMap<String, String>> mapList = new ArrayList<>();
  //  map = mapper.readValue(fis, new TypeReference<Map<String, String>>(){});

    System.out.println(map);

 //   List<Map<String,String>> elements = new ArrayList<Map<String, String>>();

    //elements.add(map);

    // create ArrayList and insert all 5 HashMap into it
  //  List<Map<String, String>> listOfIndianRegions =
    //    new ArrayList<Map<String, String>>();

    // add all 5 regions to AL

//    listOfIndianRegions.add(westIndiaStateCapital);
//    listOfIndianRegions.add(southIndiaStateCapital);
//    listOfIndianRegions.add(eastIndiaStateCapital);
//    listOfIndianRegions.add(northIndiaStateCapital);
//    listOfIndianRegions.add(centralIndiaStateCapital);

/*    // temp variable to indicate zone/region
    int regionIndex = 1;

    // Way 1: Iterate using for-each and
    // loop through Map using entrySet() method
    System.out.println("Way 1: Iterate using for-each and"
                           + " loop through Map using entrySet() method");

    // get Iterator for looping through AL
    Iterator<Map<String, String>> iterator =
        elements.iterator();

    // iterate AL using while-loop
    while(iterator.hasNext()) {

      System.out.println("\nIndia Region - " + regionIndex);
      System.out.println("=========================="
                             + "========================");

      Map<String, String> region = iterator.next();

      // getting entrySet() into Set
      Set<Entry<String, String>> entrySet =
          region.entrySet();

      // for-each loop
      for(Entry<String, String> entry : entrySet) {

        System.out.println(entry.getKey() + " " + entry.getValue());
      }

      // increment region index by 1
     // regionIndex++;*/



