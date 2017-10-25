package com.bz.framework.util.validate;

import java.io.Serializable;

/**
 * <p>Description: 元组类 </p>
 * @author 罗家友
 */
public class TwoItem<A,B> implements Serializable{
	private static final long serialVersionUID = -699005894233740741L;
	public final A first;
	public final B second;
	
	public TwoItem(A a,B b) {
		first=a;
		second=b;
	}

	@Override
	public String toString() {
		return "TwoTuple [first=" + first + ", second=" + second + "]";
	}
	
}

