package com.ums.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RoleId")
	private Long roleId;
	
	@Column(name="RoleName")
    private String roleName;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="IsActive")
	private boolean isActive;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", description=" + description + ", isActive="
				+ isActive + "]";
	}
	
}
