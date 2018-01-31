# Simple spring MVC demo
Simple demo for spring mvc using request response.

Config XML path: _src/main/resources/applicationContext.xml_

**For request params and request mappings:**

See controller: _com/learning/spring/HelloWorldController.java_

Views: Simple form and process form view
 - _WEB-INF/view/hello-form.jsp_
 - _WEB-INF/view/process-form.jsp_


**For model data binding and form tags:**

See controller: _com/learning/spring/StudentController.java_

Views: Form tags and model data binding
 - _WEB-INF/view/student/student-form.jsp_
 - _WEB-INF/view/student/student-confirmation.jsp_


**Run application using maven:**
`mvn jetty:run`