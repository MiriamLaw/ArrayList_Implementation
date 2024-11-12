package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {

		increaseArraySizeIfNeeded();
		items[size] = item;
		size++;
		return true;
	}

	public boolean addAtIndex(int index, T item) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}

		increaseArraySizeIfNeeded(); // Ensure there is enough space

		// Shift elements to the right to make space for the new item
		System.arraycopy(items, index, items, index + 1, size - index);

		items[index] = item; // Insert the new item
		size++; // Increment the size
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");

		}
		@SuppressWarnings("unchecked")
		T element = (T) items[index];
		return element;
	}

	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}

		// Store the element to be removed
		T removedElement = get(index);

		// Shift elements to the left to fill the gap
		System.arraycopy(items, index + 1, items, index, size - index - 1);

		// Nullify the last element to avoid duplication
		items[size - 1] = null;

		// Decrease the size
		size--;

		return removedElement; // Return the removed element
	}

	private void increaseArraySizeIfNeeded() {
		if (size == items.length) {
			Object[] newItems = Arrays.copyOf(items, items.length * 2);
			items = newItems;
		}
	}

}
