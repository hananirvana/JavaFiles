package com.hana.apps;
import java.text.DecimalFormat;
import java.util.*;

public class SurfaceArea {
  public static void main(String[] args) {
    DecimalFormat df =  new DecimalFormat("####.00");
    Scanner scn = new Scanner(System.in);
    double s1, s2, hP, hT, hyp, height, width, length, ans;
    System.out.println("Math Program: Surface area--- \nWhat would you like to do today? \n Type '1' for Surface Area of Triangular Prism? \n Type '2' for Surface Area of Cube or Rectangular Prism? \n Type '3' for Surface Area of Triangular Pyramid?");
    int uC = scn.nextInt();
     switch(uC) {
     	case 1:
        	//call SAofTriPri(s1,s2,hyp,hT,hP) in this order
     		System.out.println("What is the side length of the triangle?");
     		s1 = scn.nextDouble();
     		System.out.println("What is the other side length of the triangle?");
     		s2 = scn.nextDouble();
     		System.out.println("What is the longest side length of the triangle?");
     		hyp = scn.nextDouble();
     		System.out.println("What is the height of the triangle?");
     		hT = scn.nextDouble();
     		System.out.println("What is the height of the prism?");
     		hP = scn.nextDouble();
     		ans = SAofTriPri(s1,s2,hyp,hT,hP);
     		System.out.println("The surface area of the Triangular prism is: "+ans);
            break;
        case 2: 
        	//call SAofQuad(length,width,height) in this order
        	System.out.println("What is the length of your quadrilateral prism?");
     		length = scn.nextDouble();
     		System.out.println("What is the width?");
     		width = scn.nextDouble();
     		System.out.println("What is the height?");
     		height = scn.nextDouble();
     		ans = SAofQuad(length,width,height);
     		System.out.println("The surface area of the quadrilateral prism is: "+ans);
            break;
        case 3:   
    		//call SAofTriPy(length,width,height) in this order
        	System.out.println("What is the length of your triangular pyramid?");
     		length = scn.nextDouble();
     		System.out.println("What is the width?");
     		width = scn.nextDouble();
     		System.out.println("What is the height?");
     		height = scn.nextDouble();
     		ans = SAofTriPy(length,width,height);
     		System.out.println("The surface area of the triangular prism is: "+ans);
            break;
        default:
        	//You have entered an incorrect option
        	System.out.println("You have entered an incorrect option");
        	break;
      }
        
  }
  
  public static double SAofQuad(double l, double w, double h) {//Cube and rectangular Prism
    double formula = ((l * w) + (w * h) + (h * l)) * 2;
    return formula;
    
   } 
   
   public static double SAofTriPy(double l, double w, double h) {//triangular pyramid
   	double formula1 = l * w;
    double formula2 = ((w * h) / 2) * 4;
    double ans = formula1 + formula2;
    return ans;
    
   }
   
   public static double SAofTriPri(double s1, double s2, double hyp, double hT, double hP) {// triangular prism
   	double formula1 = hT * hyp;//not dividing by 2 because the formula already found the top and the bottom of the prism
    double formula2 = (s1 + s2 + hyp) * hP;
    double ans = formula1 + formula2;
    return ans;
   }
}