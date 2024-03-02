import java.util.Scanner;

public enum Days {
 MONDAY("Дуйшомбу куну джаваны окуйм"),
 TUESDAY("Шейшемби куну англис тил сабагын окуйм"),
 WEDNESDAY("Шаршемби куну джаваны окуйм"),
 THURSDAY("Бейшемби куну джаваны окуйм"),
 FRIDAY("Жума куну джаваны окуйм"),
 SATURDAY("Ишемби  куну англис тил сабагын окуйм"),
 SUNDAY("Жекшемби куну джаваны окуйм");

 private String week;

 Days(String week) {
  this.week = week;
 }

 public String getWeek() {
  return week;
 }
}