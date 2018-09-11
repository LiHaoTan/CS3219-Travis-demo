package com.mycompany.app;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void testModulesCount() {
    	ListMultimap<String, String> modules = ArrayListMultimap.create();
    	modules.put("CS", "3219");
    	modules.put("CS", "4218");
    	modules.put("MA", "1101R");
    	modules.put("MA", "1100");
    	modules.put("IS", "1103");

    	assertEquals(modules.get("CS").size(), 2);
    	assertEquals(modules.get("MA").size(), 2);
    	assertEquals(modules.get("IS").size(), 1);
	}
}
