package com.jcLog.core.disruptor;

import java.util.List;

import com.jcLog.bean.LogBean;
import com.lmax.disruptor.RingBuffer;

/**
 * @description: 日志生产者类
 * @author：孙圣然
 * @created: 2013-11-4 下午2:06:56 
 * @version：$Id: DisruptorLogCreate.java 31560 2013-11-05 00:47:27Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class DisruptorLogCreate {
	private RingBuffer<LogEvent> ringbuffer = null;
	
	public DisruptorLogCreate(RingBuffer<LogEvent> rb) {
		ringbuffer = rb;
	}
	
	public void log(List<LogBean> list){
		long sequence = ringbuffer.next();
		ringbuffer.get(sequence).setLogList(list);
		ringbuffer.publish(sequence);
	}
}

