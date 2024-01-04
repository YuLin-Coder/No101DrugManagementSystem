package com.zcurd.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysDict<M extends BaseSysDict<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setDictType(java.lang.String dictType) {
		set("dict_type", dictType);
		return (M)this;
	}
	
	public java.lang.String getDictType() {
		return getStr("dict_type");
	}

	public M setDictKey(java.lang.String dictKey) {
		set("dict_key", dictKey);
		return (M)this;
	}
	
	public java.lang.String getDictKey() {
		return getStr("dict_key");
	}

	public M setDictValue(java.lang.String dictValue) {
		set("dict_value", dictValue);
		return (M)this;
	}
	
	public java.lang.String getDictValue() {
		return getStr("dict_value");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
