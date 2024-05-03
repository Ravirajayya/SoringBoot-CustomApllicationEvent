package com.example.CustomApplicationEvent.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.CustomApplicationEvent.event.MyCustomEvent;

@Component
public class MyCustomEventListener implements ApplicationListener<MyCustomEvent> {

	@Override
	public void onApplicationEvent(MyCustomEvent event) {
		System.out.println("Received MyCustomEvent: " + event.getSource().toString());
	}

}
