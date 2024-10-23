/*
 * Class: Planet.java
 */

 import java.math.BigDecimal;

 public class Planet{

   private String name;
   private BigDecimal circumference;

   // Sun's circumference (in kilometers)
   private static final BigDecimal SUN_CIRCUMFERENCE = new BigDecimal("4370006");


   // Constructor to initialize planet name and circumference
   public Planet(String name, BigDecimal circumference) {
       this.name = name;
       this.circumference = circumference;
   }

   // Method to calculate the size difference relative to the Sun
   public BigDecimal calculateSizeDifference() {
       return SUN_CIRCUMFERENCE.subtract(circumference);
   }

   // Getters
   public String getName() {
       return name;
   }

   public BigDecimal getCircumference() {
       return circumference;
   }
} 
