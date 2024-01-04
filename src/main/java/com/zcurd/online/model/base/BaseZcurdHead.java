package com.zcurd.online.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseZcurdHead<M extends BaseZcurdHead<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setTableName(java.lang.String tableName) {
		set("table_name", tableName);
		return (M)this;
	}
	
	public java.lang.String getTableName() {
		return getStr("table_name");
	}

	public M setTableNameUpdate(java.lang.String tableNameUpdate) {
		set("table_name_update", tableNameUpdate);
		return (M)this;
	}
	
	public java.lang.String getTableNameUpdate() {
		return getStr("table_name_update");
	}

	public M setFormName(java.lang.String formName) {
		set("form_name", formName);
		return (M)this;
	}
	
	public java.lang.String getFormName() {
		return getStr("form_name");
	}

	public M setIdField(java.lang.String idField) {
		set("id_field", idField);
		return (M)this;
	}
	
	public java.lang.String getIdField() {
		return getStr("id_field");
	}

	public M setIsAuto(java.lang.Integer isAuto) {
		set("is_auto", isAuto);
		return (M)this;
	}
	
	public java.lang.Integer getIsAuto() {
		return getInt("is_auto");
	}

	public M setFormType(java.lang.Integer formType) {
		set("form_type", formType);
		return (M)this;
	}
	
	public java.lang.Integer getFormType() {
		return getInt("form_type");
	}

	public M setDialogSize(java.lang.String dialogSize) {
		set("dialog_size", dialogSize);
		return (M)this;
	}
	
	public java.lang.String getDialogSize() {
		return getStr("dialog_size");
	}

	public M setDbSource(java.lang.String dbSource) {
		set("db_source", dbSource);
		return (M)this;
	}
	
	public java.lang.String getDbSource() {
		return getStr("db_source");
	}

	public M setHandleClass(java.lang.String handleClass) {
		set("handle_class", handleClass);
		return (M)this;
	}
	
	public java.lang.String getHandleClass() {
		return getStr("handle_class");
	}

	public M setDeleteFlagField(java.lang.String deleteFlagField) {
		set("delete_flag_field", deleteFlagField);
		return (M)this;
	}
	
	public java.lang.String getDeleteFlagField() {
		return getStr("delete_flag_field");
	}

	public M setIncludeFunc(java.lang.String includeFunc) {
		set("include_func", includeFunc);
		return (M)this;
	}
	
	public java.lang.String getIncludeFunc() {
		return getStr("include_func");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
