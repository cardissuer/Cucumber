Feature: Teacher Deleting Scenario

  @deleteTeacher
    Scenario: User deletes teacher
  Given User deletes Teacher at "/teacher/delete/2708"
  And User gets Teacher at "/teacher/2708"
  Then User verifies response message with "Teacher with ID = 2708 NOT FOUND!"