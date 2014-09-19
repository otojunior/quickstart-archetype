package ${package};

import static org.junit.Assert.*;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe de teste principal da aplicação
 * @author <author name>
 */
public class AppTest {
	private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);
	
	private App app;

	/**
	 * {@inheritDoc}
	 */
	@Before
	public void setUp() throws Exception {
		LOG.trace("Test setup");
		app = new App();
	}

	/**
	 * {@inheritDoc}
	 */
	@After
	public void tearDown() throws Exception {
		LOG.trace("Test teardown");
		app = null;
	}

	/**
	 * Teste do método main.
	 */
	@Test
	public void testMain() {
		App.main(ArrayUtils.EMPTY_STRING_ARRAY);
	}

	/**
	 * Testa o método aMethod
	 */
	@Test
	public void testAMethod() {
		assertNotNull(app);
		app.aMethod();
	}
}
