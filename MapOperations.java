// import java.time.LocalDateTime;
// import org.json.simple.JSONObject;
// import java.time.ZoneId;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

// public class MapOperations {
    
//     public static void main(String args[]){
//         var map = new HashMap<String, HashMap<String, TotalAndValidForSeal>>();
        
//         var someObjects = new ArrayList<SomeObject>();
        
//         someObjects.add(new SomeObject(1, 2, "Himadri", "10220", "outpost"));
//         someObjects.add(new SomeObject(12, 4, "Sonali", "10220", "outpost"));
//         someObjects.add(new SomeObject(18, 1, "Kinjal", "18765", "outpost"));
//         someObjects.add(new SomeObject(10, 3, "Riri", "18765", "outpost"));
//         someObjects.add(new SomeObject(2, 2, "Nikhilesh", "87345", "no-more-chocolate"));
//         someObjects.add(new SomeObject(11, 8, "Koushani", "15462", "mon-diye-poro"));
//         someObjects.add(new SomeObject(4, 4, "Pashmi", "12786", "kothai-thako", LocalDateTime.of(2022, 02, 12, 23, 20, 5)));
//         someObjects.add(new SomeObject(8, 3, "Ratul", "12876", "hote-parto-ei-naam"));
//         someObjects.add(new SomeObject(4, 1, "Trisha", "12876", "ki-je-kore", LocalDateTime.of(2022, 03, 18, 8, 10, 5)));
//         var date = LocalDateTime.of(2022, 05, 20, 18, 4, 4);
//         String policy = "outpost";
//         someObjects.stream().filter(x -> date.compareTo(x.getDate()) < 0 ).forEach(x -> {

//             if(policy.equals(x.getPolicy()) && map.containsKey(policy)){
//                 var innerMap = map.get(x.getPolicy());
//                 if(innerMap.containsKey(x.getSeal())){
//                     var obj = innerMap.get(x.getSeal());
//                     obj.setCount(obj.getCount() + x.getVal());
//                     obj.setValid(obj.getValid() + x.getValid());
//                 }else{
//                     innerMap.put(x.getSeal(), new TotalAndValidForSeal(x.getVal(), x.getValid(), x.getSeal()));
//                 }
                
//             }else{
//                 map.put(x.getPolicy(), new HashMap<String, TotalAndValidForSeal>(){{put(x.getSeal(), new TotalAndValidForSeal(x.getVal(), x.getValid(), x.getSeal()));}});
//             }
//         });

//         var list = map.values().stream().flatMap(x -> x.values().stream()).collect(Collectors.toList());
//         list.stream().forEach(System.out::println);

//         // map.entrySet().forEach(x-> {
//         //     System.out.print("Policy: " + x.getKey());
//         //     x.getValue().values().forEach(y -> {
//         //         System.out.println("\t");
//         //         System.out.print(" Seal: " + y.getSeal() + " Count: " + y.getCount() + " Valid: " + y.getValid());
//         //     });
//         //     System.out.println();
//         // });

//         // JSONObject json =  new JSONObject();
//         // json.putAll(map);
//         // //var json = new ObjectMapper();
//         // //json.writeValueAsString(map);
//         // System.out.printf( "%s", json);

//     }

    
// }



// class SomeObject{
//     private int val;
//     private int valid;
//     private String name;
//     private String seal;
//     private String policy;
//     private LocalDateTime date = LocalDateTime.now(ZoneId.systemDefault());

//     public SomeObject(int val, int valid, String name, String seal, String policy){
//         this.val = val;
//         this.valid = valid;
//         this.name = name;
//         this.seal = seal;
//         this.policy = policy;
//     }

//     public SomeObject(int val, int valid, String name, String seal, String policy, LocalDateTime date){
//         this.val = val;
//         this.valid = valid;
//         this.name = name;
//         this.seal = seal;
//         this.policy = policy;
//         this.date = date;
//     }

//     public int getVal(){
//         return val;
//     }

//     public int getValid(){
//         return valid;
//     }

//     public String getName(){
//         return name;
//     }

//     public String getPolicy(){
//         return policy;
//     }

//     public String getSeal(){
//         return seal;
//     }

//     public LocalDateTime getDate(){
//         return date;
//     }
// }


// class TotalAndValidForSeal{
//     int count;
//     int valid;
//     String seal;

//     public TotalAndValidForSeal(int count, int valid, String seal){
//         this.count = count;
//         this.valid = valid;
//         this.seal = seal;
//     }

//     public int getCount(){
//         return count;
//     }
//     public int getValid(){
//         return valid;
//     }
//     public String getSeal(){
//         return seal;
//     }

//     public void setCount(int count){
//         this.count = count;
//     }
//     public void setValid(int valid){
//         this.valid = valid;
//     }
//     public void setSeal(String seal){
//         this.seal = seal;
//     }
// }
