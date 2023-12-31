package com.chonamzone.erpproject.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
//DTO는 모델 선언을 하는 곳이다.
//이곳은 휴가신청서 모델 테이블이다.
//컬럼명에 노란줄은 아직 사용전이라 뜨는 것이다.
//컨트롤러 따로 / 모델안에 서비스, DAO, DTO /뷰는 template 이다.
//노션에 공부모음 230830 적어놓았다. 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VacationDTO {
	private int vSeq;
	
	private String vLeaveType;
	
	private String vReason;
	
	private LocalDate vStartDate;
	
	private LocalDate vEndDate;
	
	private String vEmployeeContact;
	
	
	@Getter
	@Setter
	@NoArgsConstructor
	public static class MGVacationDTO {
		private int dSeq;
		private String dDraftingDate;
		private String aprvPa1;
		private String aprvName1;
		private String aprvPa2;
		private String aprvName2;
		private String pName;
		private String uName;
		private String uPosition;
		private String vLeaveType;
		private String vReason;
		private String vStartDate;
		private String vEndDate;
		private String vEmployeeContact;
		
		public void setUserData(UserDTO userDTO) {
			this.dDraftingDate = LocalDate.now().toString();
			this.uName = userDTO.getUName();
			this.uPosition = userDTO.getUPosition();
		}
		
	}
}
