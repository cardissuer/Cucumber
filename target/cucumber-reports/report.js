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
  "status": "skipped"
});
formatter.step({
  "name": "user goes to Cybertek training application",
  "keyword": "And "
});
formatter.match({
  "location": "Teacher_Crossvalidation_StepDefs.user_goes_to_Cybertek_training_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user opens teacher profile details page \"2625\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Teacher_Crossvalidation_StepDefs.user_opens_teacher_profile_details_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user cross validates teacher details on API and UI",
  "keyword": "And "
});
formatter.match({
  "location": "Teacher_Crossvalidation_StepDefs.user_cross_validates_teacher_details_on_API_and_UI()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});