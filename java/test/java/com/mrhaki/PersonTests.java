package com.mrhaki;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTests {

  @Test public void testPerson() {
    Person mrhaki = new Person("mrhaki");
    assertEquals("mrhaki", mrhaki.getUsername());
    assertEquals("MRHAKI", mrhaki.getSwappedUsername());
  }
}