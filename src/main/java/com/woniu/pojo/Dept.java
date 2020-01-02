package com.woniu.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
	private Integer deptno;
	private String dname;
	private String loc;
}
