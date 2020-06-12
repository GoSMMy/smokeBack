package com.lopamoko.smoke.category;

import java.util.List;

public class CategoryEntity {
    String name;
    List<CategoryEntity> parentCategory;
    List<CategoryEntity> childCategory;
}
