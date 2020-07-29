package com.byteprogramming.compositepk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byteprogramming.compositepk.model.Attendance;
import com.byteprogramming.compositepk.model.AttendanceIDUsingEmbeddable;

public interface AttendanceRepo extends JpaRepository<Attendance, AttendanceIDUsingEmbeddable>{

}
