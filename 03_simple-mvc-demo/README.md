# Simple spring MVC demo
Simple demo for spring mvc using request response.

Config XML path: _webapp/WEB-INF/spring-mvc-demo-servlet.xml_

**For request params and request mappings:**

See controller: _src/main/java/com/learning/spring/HelloWorldController.java_

Views: Simple form and process form view
 - _webapp/WEB-INF/view/hello-form.jsp_
 - _webapp/WEB-INF/view/process-form.jsp_


**For model data binding and form tags:**

See controller: _src/main/java/com/learning/spring/StudentController.java_

Views: Form tags and model data binding
 - _webapp/WEB-INF/view/student/student-form.jsp_
 - _webapp/WEB-INF/view/student/student-confirmation.jsp_


**For form validation using hibernate validator:**

See dependency for library in _pom.xml_

See controller:
 _src/main/java/com/learning/spring/CustomerController.java_

Validator annotations:
 _src/main/javacom/learning/spring/models/Customer.java_

**Run application using maven:**
`mvn jetty:run`