package edu.kh.oop.practice.model.vo;

public class Book {
	
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	
	// 어노테이션 toString() 오버라이딩
	@Override 
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}
}
