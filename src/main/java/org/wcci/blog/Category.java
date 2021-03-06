package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;


    protected Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }



    public String toString() {
        return "Categories{id=" + this.id + ", name='" + this.name + "'}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Category categories = (Category)o;
            if (this.id != categories.id) {
                return false;
            } else {
                if (this.name != null) {
                    if (!this.name.equals(categories.name)) {
                    }
                } else if (categories.name != null) {
                }

                return false;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = (int)(this.id ^ this.id >>> 32);
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        return result;
    }
}
