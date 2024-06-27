package Fourth;

import java.util.Scanner;

public class Eigteenth {

	public static void main(String[] args) {
		float f,r;
		System.out.println(" Enter the marks scored by a student in 5 subjects: ");
		Scanner m=new Scanner(System.in);
		Scanner n=new Scanner(System.in);
		Scanner o=new Scanner(System.in);
		Scanner p=new Scanner(System.in);
		Scanner q=new Scanner(System.in);
		int a=m.nextInt();
		int b=n.nextInt();
		int c=o.nextInt();
		int d=p.nextInt();
		int e=q.nextInt();
		r=a+b+c+d+e;
		f=r/500*100;
		if(f==100) {
			System.out.println("A+");}
		if(f<100 && f>=95) {
			System.out.println("A");}
		if(f<95 && f>=90) {
			System.out.println("A-");}
		if(f<90 && f>=85) {
			System.out.println("B+");}
		if(f<85 && f>=80) {
			System.out.println("B");}
		if(f<80 && f>=75) {
			System.out.println("B-");}
		if(f<75 && f>=70) {
			System.out.println("C+");}
		if(f<70 && f>=65) {
			System.out.println("C");}
		if(f<65 && f>=60) {
			System.out.println("C-");}
		if(f<60 && f>=55) {
			System.out.println("D+");}
		if(f<55 && f>=50) {
			System.out.println("D+");}
		if(f<50) {
			System.out.println("F");}
	}
}

