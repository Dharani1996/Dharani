package org.book1;

import javax.persistence.Id;

public class Ebook extends Book {
	@Id
	private String downloadURL;
	private float size;
		public Ebook() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Ebook(Integer id, String title, String author, double price, long iSBNnumber, String publisher,
				String edision) {
			super(id, title, author, price, iSBNnumber, publisher, edision);
			// TODO Auto-generated constructor stub
		}

		public Ebook(String downloadURL, float size) {
			super();
			this.downloadURL = downloadURL;
			this.size = size;
		}

		public String getDownloadURL() {
			return downloadURL;
		}
		public void setDownloadURL(String downloadURL) {
			this.downloadURL = downloadURL;
		}
		public float getSize() {
			return size;
		}
		public void setSize(float size) {
			this.size = size;
		}
		

}