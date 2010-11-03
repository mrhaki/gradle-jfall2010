package com.mrhaki.person;

import org.junit.*;
import static org.junit.Assert.*;

import com.mrhaki.api.Person;
import com.mrhaki.api.impl.PersonImpl;

public class PersonServiceTests {
  private PersonService service = new PersonService();

  @Test public void testCheckValid() {
    Person person = new PersonImpl("mrhaki");
    assertTrue(service.checkPerson(person));
  }

  @Test public void testCheckInvalid() {
    Person person = new PersonImpl("piet");
    assertFalse(service.checkPerson(person));
  }
}