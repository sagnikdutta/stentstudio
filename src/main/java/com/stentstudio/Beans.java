package com.stentstudio;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.appfuse.model.LabelValue;

public class Beans {

	public static List<LabelValue> generateLabelValueList(List source) throws Exception {
		List<LabelValue> target = new ArrayList<LabelValue>();
		for (Iterator iterator = source.iterator(); iterator.hasNext();) {
			Object sourceObject = (Object) iterator.next();
			LabelValue labelValue = new LabelValue();
			BeanUtils.copyProperties(labelValue, sourceObject);
			target.add(labelValue);
		}
		return target;
	}
	
}
