package cleanwheels.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not found")
public class EmployeeNotFoundException extends RuntimeException {
	private final Logger logger = LoggerFactory.getLogger(EmployeeNotFoundException.class);
	private static final long serialVersionUID = 100L;

	public EmployeeNotFoundException(String id) {
		super(""+id  +" not found");
		logger.error("Employee with employeeId '" + id + "' not found");
	}
}
