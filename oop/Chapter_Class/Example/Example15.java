/*
  khái báo hai phương thức của lớp trừu tượng Example15: Phương thức getName()
  trả về tên loài động vật, dù chưa biết tên cụ thể loài nào nhưng kiểu trả về
là String. Phương thức getFeet() trả về số chân của loài động vật, cũng chưa
biết cụ thể là bao nhiêu chân nhưng kiểu trả về là int.
*/


abstract class Example15 {
  abstract String getName();
  abstract int getFeet();
}
