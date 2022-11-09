package Fp04;

import java.util.List;

class Course{
     private String name;
     private String category;
     private int review;
     private int noOfStudent;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getCategory() {
         return category;
     }

     public void setCategory(String category) {
         this.category = category;
     }

     public int getReview() {
         return review;
     }

     public void setReview(int review) {
         this.review = review;
     }

     public int getNoOfStudent() {
         return noOfStudent;
     }

     public void setNoOfStudent(int noOfStudent) {
         this.noOfStudent = noOfStudent;
     }

     @Override
     public String toString() {
         return "Course{" +
                 "name='" + name + '\'' +
                 ", category='" + category + '\'' +
                 ", review=" + review +
                 ", noOfStudent=" + noOfStudent +
                 '}';
     }

     public Course(String name, String category, int review, int noOfStudent) {
         this.name = name;
         this.category = category;
         this.review = review;
         this.noOfStudent = noOfStudent;
     }
 }

public class CustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("spring", "framework", 98, 20000),
                new Course("spring boot", "framework", 98, 30000),
                new Course("AWS", "DevOps", 95, 10000),
                new Course("Docker", "Cloud repo", 90, 5000),
                new Course("Full Stack", "Full stack", 98, 50000)
        );

    }
}
