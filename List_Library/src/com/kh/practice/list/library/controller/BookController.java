package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;


import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
		// ArrayList 객체 생성 
		private List<Book> bookList = new ArrayList();
		// 초기 값 4개 추가 
		{
			bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000)); 
			bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000)); 
			bookList.add(new Book("대화의 기술", "강보람", "인문", 17500)); 
			bookList.add(new Book("암 정복기", "박신우", "의료", 21000)); 
		}
		
		public void insertBook(String title, String author, String category, int price){ 
		//전달 받은 bk를 bookList에 추가 
			Book bk = new Book(title, author, category, price);
			bookList.add(bk);
		} 
		public List<Book> selectList(){
		// 해당 bookList의 주소 값 반환
			return bookList;
		} 
		
		public List<Book> searchBook(String keyword){ 
		// 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성 
		// 반복문을 통해 list의 책 중 책 명에 전달 받은 keyword가 포함되어있는 경우 
		// searchList에 해당 책 추가하고 searchList 반환 
			List<Book> searchList = new ArrayList();
			
			for(int i = 0; i < bookList.size(); i++) {
				Book bk = bookList.get(i);
				if(bk.getTitle().contains(keyword) || bk.getAuthor().contains(keyword) ||
						bk.getCategory().contains(keyword)) {
					searchList.add(bk);
				}
			}
			return searchList;
			
			
		} 
		
		public Book deleteBook(String title, String author){ 
		// 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화 
		// 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고 
		// 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감  
		// 이 때 해당 인덱스 도서를 removeBook에 대입 후 removeBook 반환 
			Book removeBook = null;
			
			int count = 0;
			for(int i = 0; i < bookList.size(); i++) {
				if(title.equals(bookList.get(i).getTitle()) &&
				   author.equals(bookList.get(i).getAuthor())) {	
					bookList.remove(bookList.get(i));
					i--;
					count++;
				}
			}
			return removeBook;
		}
		/*
		public int ascBook(){ 
			// 책 이름으로 오름차순 후 1 반환 
			
		}
		*/
	
}
