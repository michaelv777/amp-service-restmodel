/**
 * 
 */
package com.amp.service.rest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;

/**
 * @author MVEKSLER
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WorkerDataRequestRO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	protected String sourceName = StringUtils.EMPTY;
	protected String targetName = StringUtils.EMPTY;
	protected String workerName = StringUtils.EMPTY;
	protected String threadName = StringUtils.EMPTY;
	protected String opTypeName = StringUtils.EMPTY;
	protected String itemKey    = StringUtils.EMPTY;
	protected String description = StringUtils.EMPTY;
	protected String status      = StringUtils.EMPTY;
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getTargetName() {
		return targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	public String getOpTypeName() {
		return opTypeName;
	}
	public void setOpTypeName(String opTypeName) {
		this.opTypeName = opTypeName;
	}
	public String getItemKey() {
		return itemKey;
	}
	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
