package com.example.CustomApplicationEvent.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class MyCustomEvent extends ApplicationEvent {

  private static final long serialVersionUID = 1L;

  public MyCustomEvent(Object source) {
    super(source);
  }

  public Object getSource() { 
	  return source; 
  }

}
