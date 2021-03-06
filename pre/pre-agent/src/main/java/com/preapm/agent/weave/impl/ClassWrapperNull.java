package com.preapm.agent.weave.impl;

import java.util.List;

import com.preapm.agent.constant.BaseConstants;
import com.preapm.agent.weave.ClassWrapper;

public class ClassWrapperNull extends ClassWrapper {

	public String beforAgent(String methodName, List<String> argNameList) {
		return BaseConstants.NULL;
	}

	public String afterAgent(String resultName) {
		return BaseConstants.NULL;
	}

	@Override
	public String doError(String error) {
		return BaseConstants.NULL;
	}

}