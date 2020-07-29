package com.byteprogramming.compositepk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byteprogramming.compositepk.model.Attendance;
import com.byteprogramming.compositepk.repository.AttendanceRepo;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepo attendanceRepo;
	
	public List<Attendance> getAllAttendance() {
		return attendanceRepo.findAll();
	}
}
