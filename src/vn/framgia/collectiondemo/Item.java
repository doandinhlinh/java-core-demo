package vn.framgia.collectiondemo;

public class Item implements Comparable<Item>{
	private int itemId;
	private String content;

	public Item() {
		super();
	}

	public Item(int itemId, String content) {
		super();
		this.itemId = itemId;
		this.content = content;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", content=" + content + "]";
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return o.itemId-this.itemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		return true;
	}

}
