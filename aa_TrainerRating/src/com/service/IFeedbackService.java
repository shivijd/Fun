package com.service;

import java.util.HashMap;

import com.bean.Trainer;
import com.exception.NoTrainerFoundException;

public interface IFeedbackService 
{
	public Trainer addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList(int rate) throws NoTrainerFoundException;
	public boolean checkRating(int rate);
	public boolean isValidName(String name);
	public boolean isValidCourse(String course);
}
