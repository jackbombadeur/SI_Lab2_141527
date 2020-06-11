package main.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SILab2Test {
	
	List<String> userNames;
	
	@Before
	public void setUp() {
		userNames = new ArrayList<String>();
        userNames.add("TestUser");
	}
	@Test
	public void pathTest() {
	  Assertions.assertThrows(RuntimeException.class, () -> {
	    SILab2.function(null, userNames);
	  });
	  Assertions.assertThrows(RuntimeException.class, () -> {
		    SILab2.function(new User(null, "Fabio420!", "testmail@gmail.com"), userNames);
		  });
	  boolean result = SILab2.function(new User("TestUser", "TestUser420!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "Fab2!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "FabioRocks!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "fabiorocks4!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "fabiorocks4", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "Fabiorocks4!", "testmail@gmail.com"), userNames);
      assertTrue(result);
	}
	@Test
	public void branchTest() {
	  Assertions.assertThrows(RuntimeException.class, () -> {
	    SILab2.function(null, userNames);
	  });
	  Assertions.assertThrows(RuntimeException.class, () -> {
		    SILab2.function(new User(null, "Fabio420!", "testmail@gmail.com"), userNames);
		  });
	  boolean result = SILab2.function(new User("TestUser", "TestUser420!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "Fab2!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "FabioRocks1!", "testmail@gmail.com"), userNames);
      assertTrue(result);
      result  = SILab2.function(new User("TestUser", "FabioRocks", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "fabiorocks4!", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "Fabiorocks4", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "fabiorocks", "testmail@gmail.com"), userNames);
      assertFalse(result);
      result  = SILab2.function(new User("TestUser", "Fabiorocks4!", "testmail@gmail.com"), userNames);
      assertTrue(result);
	}
}
