<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserttitlehere</title>
<style>
#map {
	width: 500px;
	height: 500px;
}
</style>
</head>
<body>

	<div id="map"></div>
	<button id="Magnifymap">Click!</button>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=ca75e97b4081470a345b0d7a909bbb7a&libraries=services"></script>
	<script>
		var container = document.getElementById('map');
		var options = {
			center : new daum.maps.LatLng(33.450701, 126.570667),
			level : 3
		};
		var map = new daum.maps.Map(container, options);

		var geocoder = new daum.maps.services.Geocoder();
		/* 		var marker = new daum.maps.Marker({ 
		 // 지도 중심좌표에 마커를 생성합니다 
		 position: map.getCenter() 
		 }); 
		 // 지도에 마커를 표시합니다
		 marker.setMap(map); */

		// 지도에 클릭 이벤트를 등록합니다
		// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
		daum.maps.event.addListener(map, 'click', function(mouseEvent) {

			// 클릭한 위도, 경도 정보를 가져옵니다 
			var latlng = mouseEvent.latLng;
			var marker = new daum.maps.Marker();

			searchDetailAddrFromCoords(mouseEvent.latLng, function(result,
					status) {
				if (status === daum.maps.services.Status.OK) {
					var detailAddr = !!result[0].road_address ? '<div>도로명주소 : '
							+ result[0].road_address.address_name + '</div>'
							: '';
					detailAddr += '<div>지번 주소 : '
							+ result[0].address.address_name + '</div>';

					var content = '<div class="bAddr">'
							+ '<span class="title">법정동 주소정보</span>'
							+ detailAddr + '</div>';
					// 마커를 클릭한 위치에 표시합니다 
					marker.setPosition(mouseEvent.latLng);
					marker.setMap(map);

					console.log(content);

				}
			});

		});

		function searchDetailAddrFromCoords(coords, callback) {
			// 좌표로 법정동 상세 주소 정보를 요청합니다
			geocoder.coord2Address(coords.getLng(), coords.getLat(), callback);
		}

		/* 클릭 시 지도크기 변경*/
		$('#Magnifymap').bind("click", function(event) {
			$('#map').animate({
				width : "100%",
				height : "1000px"
			});
			setTimeout(function asd() {
				map.relayout();
			}, 500);
		})
	</script>
</body>
</html>