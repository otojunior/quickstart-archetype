package ${package};

import static org.junit.Assert.*;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main App test class.
 * @author [Author name]
 */
public class AppTest {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);
	
	/**
	 * Class to be tested.
	 */
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
	 * Main method test.
	 */
	@Test
	public void testMain() {
		App.main(ArrayUtils.EMPTY_STRING_ARRAY);
	}

	/**
	 * aMethod method test.
	 */
	@Test
	public void testAMethod() {
		assertNotNull(app);
		app.aMethod();
	}
}
