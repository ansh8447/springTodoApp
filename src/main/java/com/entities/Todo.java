package com.entities;

import java.util.Date;

public class Todo {
	private String todoTitle;
	private String todoContent;
	private Date toDodate;
	public Todo(String todoTitle, String todoContent, Date toDodate) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.toDodate = toDodate;
	}
	
	
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getToDodate() {
		return toDodate;
	}
	public void setToDodate(Date toDodate) {
		this.toDodate = toDodate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTodoTitle() +" : "+ this.todoContent;
	}
	
}
