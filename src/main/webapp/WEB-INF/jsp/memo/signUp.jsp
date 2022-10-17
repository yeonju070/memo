<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<%-- Ajax를 사용하려면 jquery 원본이 있어야 한다. --%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div id="wrap">
		<header>
			<div class="logo">
				<h1 class="text-center my-3">instagram</h1>
				<hr>
			</div>
		</header>
		<section class="contents d-flex justify-content-center">
			<div class="sign-up-box">
				<div class="subject-text my-2">아이디</div>
				<input id="id" class="form-control">

				<div class="subject-text my-2">비밀번호</div>
				<input id="password" type="password" class="form-control">

				<div class="subject-text my-2">비밀번호 확인</div>
				<input id="confirmPassword" type="password" class="form-control">

				<div class="subject-text my-2">이름</div>
				<input id="name" type="text" class="form-control">

				<div class="subject-text my-2">이메일</div>

				<div class="d-flex mb-3">
					<input id="email" type="text" class="form-control col-5"> <span
						class="mt-2">@</span> <input id="emailDomainInput" type="text"
						class="form-control d-none"> <select id="emailDomain"
						class="form-control">
						<option>naver.com</option>
						<option>nate.com</option>
						<option>google.com</option>
					</select>
				</div>

				<button id="signUpBtn" type="button" class="btn btn-primary w-100">가입하기</button>
			</div>
		</section>
		
		<footer>
			<address class="text-center my-3 text-secondary">
				<small>Copyright 2021. 111st All Rights Reserved.</small>
			</address>
		</footer>
	</div>
</body>
</html>