package fr.formation.chefdoeuvre.domain.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategoryCreate {

    @NotBlank
    private String categoryName;

    @NotBlank
    private String categoryDescription;

    @NotNull
    private long categoryPrice;

    public CategoryCreate() {

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
	return "CategoryCreate [categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
		+ ", categoryPrice=" + categoryPrice + "]";
    }

}
