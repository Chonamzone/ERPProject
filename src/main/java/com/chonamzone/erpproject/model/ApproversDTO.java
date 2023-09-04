package com.chonamzone.erpproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApproversDTO {
	
	private int aSeq;
	
	private int aOrderNum;
	
	private int aApproverId;
	
	private String aApproverState;
	
	private int dSeq;
	
	
	@Getter
	@Setter
	public static class Details {
		private int aApproverId;
		private String uName;
		private String pName;
	}
}
