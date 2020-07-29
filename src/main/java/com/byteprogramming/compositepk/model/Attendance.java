package com.byteprogramming.compositepk.model;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="attendance", schema ="oper")
@Data
@NoArgsConstructor
@IdClass(AttendanceIdUsingIdclass.class)
public class Attendance {
	
	@Id
	private Long emp_id;
	@Id
	private Date effective_dt;
    private boolean fl_present;
    
}
