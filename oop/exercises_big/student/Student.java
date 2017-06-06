class Student implements java.io.Serializable {
  private String id;      // Mã sinh viên
  private String name;    // Tên sinh viên
  private String birthday;// Ngày sinh
  private String sex;     // Giới tính
  private String className;   // Tên lớp
  private String lock;    // Khoá

  public Student() {
    super();
    id       = "";
    name     = "";
    birthday = "";
    sex      = "";
    className    = "";
    lock     = "";
  }

  public Student(String id, String name, String birthday, String className, String lock) {
    this.id        = id;
    this.name      = name;
    this.birthday  = birthday;
    this.sex       = sex;
    this.className = className;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getLock() {
    return lock;
  }

  public void setLock(String lock) {
    this.lock = lock;
  }
}

