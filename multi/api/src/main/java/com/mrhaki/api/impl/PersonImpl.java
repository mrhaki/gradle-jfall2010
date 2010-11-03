package com.mrhaki.api.impl;

import com.mrhaki.api.Person;
import com.mrhaki.shared.Helper;

public class PersonImpl implements Person {
  private String username;

  public PersonImpl(String uname) {
    Helper.pretty(uname);
    username = uname;
  }

  public String getUsername() {
    return username;
  }
}