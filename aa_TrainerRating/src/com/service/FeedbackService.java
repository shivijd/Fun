package com.service;

import java.util.HashMap;
import java.util.regex.Pattern;

import com.bean.Trainer;
import com.dao.FeedbackDAO;
import com.dao.IFeedbackDAO;
import com.exception.NoTrainerFoundException;

public class FeedbackService implements IFeedbackService {
	IFeedbackDAO repo = new FeedbackDAO();


	public FeedbackService(IFeedbackDAO repo) {
		super();
		this.repo = repo;
	}


	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rate) throws NoTrainerFoundException 		//Method to check trainers on the basis of rating
	{
		return repo.getTrainerList(rate);
	}

	@Override
	public Trainer addFeedback(Trainer trainer)  			//Copying CollectionUtil default values to new HashMap
	{
		return repo.addFeedback(trainer);
	}


	@Override
	public boolean checkRating(int rate) 					//Method to validate rating
	{
		if(rate>0 && rate<6 )
			return true;
		else
			return false;
	}


	@Override
	public boolean isValidName(String name) {
		if(name==null || name.length()==0)
			return false;
		
		return Pattern.matches("[a-zA-Z\\s]+", name);
	}


	@Override
	public boolean isValidCourse(String course) {
		if(course==null || course.length()==0)
			return false;
//		if(course.toUpperCase().equals("JAVA") || course.equals("PYTHON")){
//			return true;
//		}
		return Pattern.matches("[a-zA-Z.]*", course);
	}
	
//	public boolean isValidMobile(String mobileNumber) {
//		return Pattern.matches("[6-9][0-9]{9}", mobileNumber)
//	}

}
