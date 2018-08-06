import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.ServiceOptions;
import java.io.IOException;

public class Repro {

  public static void main(String[] args) throws IOException {
    System.out.println("ServiceOptions.getDefaultProjectId(): " + ServiceOptions.getDefaultProjectId());
    System.out.println("GoogleCredentials.getApplicationDefault(): " + GoogleCredentials.getApplicationDefault());
  }
}
