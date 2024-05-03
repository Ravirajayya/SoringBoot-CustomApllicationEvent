# SoringBoot-CustomApllicationEvent
Creating custom application event

In Spring applications, a custom application event is a user-defined class that extends the ApplicationEvent class.

**Purpose:**
- Enables loosely coupled communication between components.
- Allows components to react asynchronously to events without tight dependencies.
- Provides a structured way to handle application lifecycle events.

**Usage:**

**Publishing the Event:**

- In the part of your code where you want to trigger the event, you create an instance of your custom event class.
- You then use an ApplicationEventPublisher bean (provided by Spring) to publish the event. This broadcasts the event to any registered listeners.
