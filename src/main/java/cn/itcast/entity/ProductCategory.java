package cn.itcast.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
	public class ProductCategory {
		@Id
		@GeneratedValue
		private Integer categoryId;
		private String categoryName;
		private String categoryType;
		
		public Integer getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getCategoryType() {
			return categoryType;
		}
		public void setCategoryType(String categoryType) {
			this.categoryType = categoryType;
		}
		@Override
		public String toString() {
			return "ProjectCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryType="
					+ categoryType + "]";
		}
		
	}


