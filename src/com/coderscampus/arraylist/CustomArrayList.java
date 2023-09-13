package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int elementCount = 0;

	@Override
	public boolean add(T item) {

		if (elementCount == items.length) {
			Object[] newItems = new Object[items.length * 2];

			System.arraycopy(items, 0, newItems, 0, elementCount);

			items = newItems;
		}

		items[elementCount] = item;

		elementCount++;

		return true;
	}

	@Override
	public int getSize() {
		return elementCount;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= elementCount) {
			throw new IndexOutOfBoundsException("Index is out of bounds");

		}
		@SuppressWarnings("unchecked")
		T element = (T) items[index];
		return element;
	}

}
