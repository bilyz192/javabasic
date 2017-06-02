class Book {
  private String isbn;      // Mã Sách
  private String title;     // Tên Sách
  private String subject;   // Chủ Đề
  private String author;    // Tác Giả
  private String publisher; // Nhà Xuất Bản
  private String date;      // Ngày Xuất Bản
  private int pages;        // Số Trang
  private int copies;       // Số Bản Copy

  public Book() {
    super();
    isbn      = "";
    title     = "";
    subject   = "";
    author    = "";
    publisher = "";
    date      = "";
    pages  = 0;
    copies = 0;
  }

  // Phương thức khởi dựng có tham số
  public Book(String isbn, String title,String subject, String author, String publisher, String date) {
    this.isbn      = isbn;
    this.title     = title;
    this.subject   = subject;
    this.author    = author;
    this.publisher = publisher;
    this.date      = date;
  }

  public Book(int pages, int copies) {
    this.pages = pages;
    this.copies = copies;

  }

  /* Phương thức truy nhập thuộc tính isbn */
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /* Phương thức truy nhập thuộc tính title */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /* Phương thức truy nhập thuộc tính subject */
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  /* Phương thức truy nhập thuộc tính author */
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  /* Phương thức truy nhập thuộc tính publisher */
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  /* Phương thức truy nhập thuộc tính date */
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  /* Phương thức truy nhập thuộc tính pages */
  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  /* Phương thức truy nhập thuộc tính copies */
  public int getCopies() {
    return copies;
  }

  public void setCopies(int copies) {
    this.copies = copies;
  }

}
