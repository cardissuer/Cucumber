$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/api/teacherDataValidationE2E.feature");
formatter.feature({
  "name": "Teacher Details End to End UI vs API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "UI vs API cross data validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@e2e"
    }
  ]
});
formatter.step({
  "name": "user goes to Cybertek training application",
  "keyword": "And "
});
formatter.step({
  "name": "user opens teacher profile details page \"\u003cteacher ID\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user cross validates teacher details on API and UI",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "resource",
        "teacher ID"
      ]
    },
    {
      "cells": [
        "/teacher/2625",
        "2625"
      ]
    }
  ]
});
formatter.scenario({
  "name": "UI vs API cross data validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@e2e"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to Cybertek training application",
  "keyword": "And "
});
formatter.match({
  "location": "Teacher_Crossvalidation_StepDefs.user_goes_to_Cybertek_training_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens teacher profile details page \"2625\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Teacher_Crossvalidation_StepDefs.user_opens_teacher_profile_details_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cross validates teacher details on API and UI",
  "keyword": "And "
});
formatter.match({
  "location": "Teacher_Crossvalidation_StepDefs.user_cross_validates_teacher_details_on_API_and_UI()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat step_definitions.cybertek_training_stepdefs.Teacher_Crossvalidation_StepDefs.user_cross_validates_teacher_details_on_API_and_UI(Teacher_Crossvalidation_StepDefs.java:39)\r\n\tat ✽.user cross validates teacher details on API and UI(src/test/resources/features/api/teacherDataValidationE2E.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utilities.extent.fail(extent.java:33)\r\n\tat step_definitions.Hooks.tearDown(Hooks.java:31)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:48)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\n",
  "status": "failed"
});
});