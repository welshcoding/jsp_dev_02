<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href='style.css'>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>
	<header id="header"></header>
	<div style="background-color:#666666;margin:0;">
	    <main style="margin:0 auto;padding-top:70px;">
	        <form name="ticketing_form" id="ticketing_form">
	            <div class="tk_title">
	                <button class="ratebutton" value="이용가" >ALL</button>
	                <strong>영화 제목</strong><br>
	            </div>
	            <div class="ticketing_dt">
	                <i class="bi bi-calendar3"></i>
	                <input type="text" id="datePicker_tk" placeholder="예매 날짜 선택">
	            </div>
	            <div id="screen"><span>SCREEN</span></div>
	            <div id="seatsarea" ></div>
	            <input type="submit" id="submit_tk" value="선택 완료">
	        </form>
	    </main>
	</div>
    <footer id="footer" ></footer>
</body>
<script src='function.js'></script>
<script>
	$(makeseats());
	$(ticketing_dp());
    $('#seatsarea').on('click', (e) => {
        $('#'+e.target.value).toggleClass('seat_clicked')
    })
    
</script>
</html>