package com.paras.springrestmvc.api.v1.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

	private Long id;
	private String name;
}
