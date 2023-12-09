<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Hello First HTML With JSP...</b>

	<!-- Declarative tag -->

	<%!public String getList() {

		return "names list";
	}

	class Student {
		public int sno;
		public String name;

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

	}%>

	<!-- Declarative tag -->


	<!-- Scriptlet tag -->

	<%
	int a = 90;
	int b = 60;

	out.println(a + b);
	out.println(getList());

	Student student = new Student(101, "Reddy");
	out.println(student.name);
	out.println(student.sno);
	%>
	<!-- Scriptlet tag -->

	<!-- Expression Tag -->
	<%=student.name%>
	<%=student.sno%>
	<!-- Expression Tag -->

</body>
</html>