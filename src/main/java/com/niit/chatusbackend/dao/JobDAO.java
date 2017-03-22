package com.niit.chatusbackend.dao;

import java.util.List;

import com.niit.chatusbackend.model.Job;

public interface JobDAO {
	public boolean saveOrUpdate(Job job);
	public boolean delete(Job job);
    public List<Job> list();
}
