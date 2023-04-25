package employee_publisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	ServiceRegistration serviceReg4;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("### Transport Publisher starts..");
		IEmployee employeeObj = new EmployeeImpl();
		serviceReg4 = context.registerService(IEmployee.class.getName(),employeeObj,null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Transport Publisher stops..");
		serviceReg4.unregister();
	}

}
