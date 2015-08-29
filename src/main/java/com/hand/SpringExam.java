package com.hand;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringExam {
	
	@Autowired
	private static FilmService filmSer;
	public static void setFilmSer(FilmService filmSer) {
		SpringExam.filmSer = filmSer;
	}
	
	@Autowired
	private static Film film;
	public static void setFilm(Film film) {
		SpringExam.film = film;
	}



	public static void main(String[] args) {
		
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/main/java/ApplicationContext.xml");
		((AbstractApplicationContext) context).start();
		System.out.println("请输入电影名称(title)：");
		Scanner scaner1 = new Scanner(System.in);
		film.setTitle(scaner1.next());
		System.out.println("请输入电影描述(description)：");
		Scanner scaner2 = new Scanner(System.in);
		film.setDescription(scaner2.next());
		System.out.println("请输入语言ID(language_id)：");
		Scanner scaner3 = new Scanner(System.in);
		film.setLanguage_id(scaner3.next());
		
		boolean a=filmSer.save(film);
		((AbstractApplicationContext) context).stop();



	}

}
