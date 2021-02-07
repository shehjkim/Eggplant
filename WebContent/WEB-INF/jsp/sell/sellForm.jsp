<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../main/main.jsp" />


<div class="container">
	<div class="text-center">
		<h1 class="h4 text-gray-900 mb-4">판매글 등록</h1>
	</div>
	<div class="card o-hidden border-0 shadow-lg my-5">
		<div class="card-body p-0">
			<!-- Nested Row within Card Body -->
			<div class="row">
				<div class="col-lg-5 d-none d-lg-block">
				<hr><br />
					<div class="form-group row">
						<div class="col-sm-12 mb-3 mb-sm-0">
							<input type="text" class="form-control form-control-user"
								id="tTitle" name="tTitle" placeholder="제목 입력">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-12 mb-4 mb-sm-10">
							<textarea type="text" class="form-control form-control-user"
								id="tContent" name="tContent" placeholder="내용 입력"
								style="margin-top: 0px; margin-bottom: 0px; height: 340px;"></textarea>
						</div>
					</div>
					<form action="FileUpload" method="post" enctype="multipart/form-data">
<!-- FileUpLoad 서블릿 실행 -->
						<hr>
						<input type="file" class="form-control form-control-user"
							id="tImage" name="tImage"><br> <input
							class="btn btn-primary btn-user btn-block" type="submit"
							value="첨부">
							<p>
							<hr>
					</form>
				</div>
				<div class="col-lg-7">
					<div class="p-5">
						<form class="user" id="frm" name="frm" method="post">
						<hr><br />
							<div class="form-group row">
								<div class="col-sm-3">
									<input type="text" class="form-control form-control-user"
										id="tId" name="tId" placeholder="작성자">
								</div>
								<div class="col-sm-5">
									<input type="text" class="form-control form-control-user"
										id="tDate" name="tDate" placeholder="작성일">
								</div>
									<div class="col-sm-3">
									<input type="text" class="form-control form-control-user"
										id="tAddress" name="tAddress" placeholder="판매지역 입력">
								</div>
							</div>
							<hr><br />
							<div class="form-group row">
								<div class="col-sm-10">
									<input type="text" class="form-control form-control-user"
										id="pName" name="pName" placeholder="품명">
								</div>
							</div>

							<br /><br />
							<div class="form-group row">
								<div class="col-sm-6">
									<input type="text" class="form-control form-control-user"
										id="tVolume" name="tVolume" placeholder="용량">
								</div>
								<div class="col-sm-6 mb-3 mb-sm-0">
									<input type="text" class="form-control form-control-user"
										id="tColor" name="tColor" placeholder="색상">
								</div>
								
								<div class="col-sm-6">
									<input type="hidden" class="form-control form-control-user"
										id="exampleRepeatPassword" name="exampleRepeatPassword"
										placeholder="Repeat Password">
								</div>
							</div><br />
							<hr><br /><br /><br />
							<div class="form-group row">
								<div class="col-sm-6">
									<input type="text" class="form-control form-control-user"
										id="tPrice" name="tPrice" value="${vo.tPrice }"
										placeholder="판매가격 입력">
								</div>
								<div class="form-group row">
									<div class="col-sm-12 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user"
											id="tDiscount" name="tDiscount" placeholder="할인">
									</div>
								</div>
							
							</div><br />
						
							<hr>
							<br />
							<div class="form-group row">
								<div class="col-sm-6 mb-3 mb-sm-0">
									<button type="button" onclick="location.href='sellUpload.do'"
										class="btn btn-primary btn-user btn-block">판매글 등록</button>
								</div>
								<div class="col-sm-6 mb-3 mb-sm-0">
									<button type="button" onclick="location.href='sellList.do'"
										class="btn btn-primary btn-user btn-block">뒤로가기</button>

								</div>
							</div>
							<hr>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>

<!-- End of Main Content -->

<!-- Footer -->
<footer class="sticky-footer bg-white">
	<div class="container my-auto">
		<div class="copyright text-center my-auto">
			<span>Copyright &copy; Your Website 2021</span>
		</div>
	</div>
</footer>
<!-- End of Footer -->




</div>
<!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top"> <i
	class="fas fa-angle-up"></i>
</a>



<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="js/demo/chart-area-demo.js"></script>
<script src="js/demo/chart-pie-demo.js"></script>

</body>

</html>