package com.mrhaki.person;

import com.mrhaki.api.Person;

public class PersonService  {

  public boolean checkPerson(Person p) {
    return p.getUsername().length() > 4;
  }
}