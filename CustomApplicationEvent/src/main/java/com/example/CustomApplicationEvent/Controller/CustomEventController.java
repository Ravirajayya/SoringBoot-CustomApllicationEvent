package com.example.CustomApplicationEvent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomApplicationEvent.event.MyCustomEvent;

@RestController
@RequestMapping("/Event")
public class CustomEventController {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	@PostMapping("/start")
	public void startEvent() {
		triggerMyCustomEvent();
	}

	private void triggerMyCustomEvent() {

		MyCustomEvent customEvent = new MyCustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
