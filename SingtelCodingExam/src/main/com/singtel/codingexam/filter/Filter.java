package com.singtel.codingexam.filter;

import java.util.List;

public interface Filter<T> {
	List<T> filter(List<T> objects);
}
