package com.game.newactivity.message;

import java.util.List;

/**
* @author luminghua,by python
*
* @date 2014-02-25 10:39
*
*/
public class ResGetNewActivityInfo extends Message{


	@Override
	public int getId() {
		return 511002;
	}

	@Override
	public String getQueue() {
		return null;
	}
	
	@Override
	public String getServer() {
		return null;
	}
	private DetailActivityInfo detailInfo;
	public DetailActivityInfo getDetailInfo(){
		return detailInfo;
	}
	public void setDetailInfo(DetailActivityInfo detailInfo){
		this.detailInfo=detailInfo;
	}
	public List<Integer> getCanGet() {
	public boolean read(IoBuffer buff) {
		return true;
	}


	@Override
	public boolean write(IoBuffer buff) {
		return true;
	}
}