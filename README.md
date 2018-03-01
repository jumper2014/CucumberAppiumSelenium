# Maven + Cucumber + TestNG + Appium

* run samples
* cd CucumberTestNgFramework/src/test

#### 下面的冒号:在windows上需要替换成分号;
* java -cp "jars/*" cucumber.api.cli.Main -p pretty --snippets camelcase .
* java -cp "jars/*:." cucumber.api.cli.Main -p pretty --snippets camelcase -g step_definitions features
* java -cp "jars/*:." cucumber.api.cli.Main -p progress --snippets camelcase -g step_definitions features
* javac -cp "jars/*:." step_definitions/CheckoutSteps.java implementation/Checkout.java

#### run test
* mvn clean test -Papptest
* mvn clean test -Pwebtest

#### Appium API
 * removeApp, installApp, startActivity, isAppInstalled
 * swipe, tap, click
 * findElementsById




