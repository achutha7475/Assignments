package Fourth;

import java.util.Scanner;

public class Twentyeth {

	public static void main(String[] args) {
		System.out.println("Enter the numeric grade: ");
		Scanner q=new Scanner(System.in);
		float f=q.nextFloat();
		if(f>=95) {
			System.out.println("A");}
		if(f<95 && f>=91.25) {
			System.out.println("A-");}
		if(f<91.25 && f>=88.75) {
			System.out.println("B+");}
		if(f<88.75 && f>=85) {
			System.out.println("B");}
		if(f<85 && f>=81.25) {
			System.out.println("B-");}
		if(f<81.25 && f>=78.75) {
			System.out.println("C+");}
		if(f<78.75 && f>=75) {
			System.out.println("C");}
		if(f<75 && f>=71.25) {
			System.out.println("C-");}
		if(f<71.25 && f>=68.75) {
			System.out.println("D+");}
		if(f<68.75 && f>=65) {
			System.out.println("D");}
		if(f<65 && f>=61.25) {
			System.out.println("D-");}
		if(f<61.25 && f>=55) {
			System.out.println("E");}
	}

}
