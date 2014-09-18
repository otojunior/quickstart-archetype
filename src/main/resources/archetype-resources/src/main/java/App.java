package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe principal da aplicação.
 * @author <Author name>
 */
public class App {
	/**
	 * Logger do SLF4J.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Método principal da aplicação.
	 * @param args Argumentos da linha de comando.
	 */
	public static void main(String[] args) {
		App instance = new App();
		instance.aMethod();
	}
	
	/**
	 * A sample method.
	 */
	public void aMethod() {
		LOG.info("App :: Running main application");
	}
}
