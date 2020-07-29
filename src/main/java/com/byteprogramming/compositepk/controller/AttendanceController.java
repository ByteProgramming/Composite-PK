package com.byteprogramming.compositepk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byteprogramming.compositepk.model.Attendance;
import com.byteprogramming.compositepk.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
	
	@Autowired
	private AttendanceService attendanceService;

	@GetMapping(value="/allAttendance")
	public List<Attendance> isEmployeePresent() {
		return attendanceService.getAllAttendance();
	}
}
