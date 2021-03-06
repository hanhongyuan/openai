package com.minivision.ai.rest.result;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.minivision.ai.enumeration.Status;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Rest接口响应通用返回结构
 * @author hughzhao
 * @2017年5月22日
 * @param <T>
 */
@Setter
@Getter
@ToString
@ApiModel(description = "通用返回结构")
@JsonInclude(Include.NON_EMPTY)
public class RestResult<T> {
	
	private String requestId;
	private int timeUsed;
	private int errorCode;
	private String errorMessage;
	private T data;

	public RestResult() {
		this.requestId = UUID.randomUUID().toString();
	}

	public RestResult(T data){
		this.data = data;
		this.requestId = UUID.randomUUID().toString();
	}

	public RestResult(Throwable t){
		this(Status.FAIL.getCode(), t.getMessage());
	}
	
	public RestResult(int code, String msg){
		this.errorCode = code;
		this.errorMessage = msg;
		this.requestId = UUID.randomUUID().toString();
	}
	
	public RestResult(int code, String msg, T data){
		this(code, msg);
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestResult<?> other = (RestResult<?>) obj;
		if (requestId == null) {
			if (other.requestId != null)
				return false;
		} else if (!requestId.equals(other.requestId))
			return false;
		return true;
	}

}
