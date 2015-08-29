package com.hand;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class FilmService {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jt; 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jt = new JdbcTemplate(dataSource);
	}
	
	public boolean save(Film film){
//		System.out.println(film.getTitle()+film.getDescription()+film.getLanguage_id());
		String SQL = "insert into Film(title,description,language_id) values (?,?,?)";     
		jt.update( SQL, film.getTitle(), film.getDescription(),film.getLanguage_id());
//		System.out.println(film.getTitle()+film.getDescription()+film.getLanguage_id());
		return true;
		
	}

}
