package com.lawencon.community.pojo.report;

import java.util.List;

public class PojoReportIncomesMemberRes {
	private List<PojoReportIncomesMemberResData> data;
	private Long total;
	public List<PojoReportIncomesMemberResData> getData() {
		return data;
	}
	public void setData(List<PojoReportIncomesMemberResData> data) {
		this.data = data;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	

}
