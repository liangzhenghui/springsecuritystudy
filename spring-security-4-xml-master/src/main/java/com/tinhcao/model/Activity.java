package com.tinhcao.model;

import javax.validation.constraints.NotNull;

public class Activity {
	@NotNull
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
