package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Main Class.
 * @author <Author name>
 */
public class App {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Application main method.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		LOG.info("Example Application starting.");		
		App instance = new App();
		instance.aMethod();
		LOG.info("Example Application terminated.");
	}
	
	/**
	 * A sample method.
	 */
	public void aMethod() {
		LOG.trace("Sample method called.");
	}
}
