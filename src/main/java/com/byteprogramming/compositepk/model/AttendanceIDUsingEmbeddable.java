package com.byteprogramming.compositepk.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Embeddable
public class AttendanceIDUsingEmbeddable implements Serializable {

	private Long emp_id;
	private Date effective_dt;
}
