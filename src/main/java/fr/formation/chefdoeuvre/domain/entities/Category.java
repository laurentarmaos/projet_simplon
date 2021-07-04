package fr.formation.chefdoeuvre.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends AbstractEntity {

    @Column(name = "category_name", nullable = false)
    private String categoryName;

    @Column(name = "category_description", nullable = false)
    private String categoryDescription;

    @Column(name = "category_price", nullable = false)
    private long categoryPrice;

    public Category() {

    }

    public String getCategoryName() {
	return categoryName;
    }

    public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
	return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
    }

    public long getCategoryPrice() {
	return categoryPrice;
    }

    public void setCategoryPrice(long categoryPrice) {
	this.categoryPrice = categoryPrice;
    }

    @Override
    public String toString() {
	return "Category [categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
		+ ", categoryPrice=" + categoryPrice + "]";
    }

}
