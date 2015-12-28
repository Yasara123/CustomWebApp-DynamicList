package com.custom.model;

import java.sql.Connection;
import java.util.ArrayList;

import com.custom.dao.Database;

import com.custom.dao.Project;
import com.custom.dto.FeedObjects;

public class ProjectManager {
	
	
	public ArrayList<FeedObjects> GetFeeds()throws Exception {
		ArrayList<FeedObjects> feeds = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				Project project= new Project();
				feeds=project.GetFeeds(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return feeds;
	}

}
