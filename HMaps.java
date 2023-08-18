import java.util.HashMap;

public class HMaps {
  public static void main(String[] args) {
    HashMap<String, Integer> concessionaria = new HashMap<String, Integer>();
    
    concessionaria.put("amarok", 100000);
    concessionaria.put("palio", 14000);
    concessionaria.put("doblo", 50000);

    // saldao

    concessionaria.forEach((car, value) -> {
      concessionaria.replace(car, value, value - 20000);
    });

    System.out.println(concessionaria.toString());

  }
}
