import com.google.cloud.ServiceOptions;

public class Repro {

  public static void main(String[] args) {
    System.err.println("ServiceOptions.getDefaultProjectId(): " + ServiceOptions.getDefaultProjectId());
  }
}
