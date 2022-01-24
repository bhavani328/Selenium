<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<test name="Test">
<groups>
<run>
<include name="regression"> </include>
</run>
</groups>
<classes>
<class name="Testngproj.Locators"/>
</classes>
</test>
<test name="Test1" parallel="methods"thread-count="2">
<groups>
<run>
<include name="smoke"> </include>
</run>
</groups>
<classes>
<class name="Testngproj.Locators"/>
</classes>
</test>
<!-- Test -->

</suite>