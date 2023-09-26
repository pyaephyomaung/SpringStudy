import com.ppm.firstmaven.beans.ProjectConfiguration;
import com.ppm.firstmaven.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name is  "+ vehicle.getName());

        String sayHello = context.getBean(String.class);
        System.out.println(sayHello);
    }
}
