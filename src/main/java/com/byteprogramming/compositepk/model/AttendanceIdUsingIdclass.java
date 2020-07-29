package com.byteprogramming.compositepk.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AttendanceIdUsingIdclass implements Serializable{

	private Long emp_id;
	private Date effective_dt;
}
