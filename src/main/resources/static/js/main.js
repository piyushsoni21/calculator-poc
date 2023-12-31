$(document).ready(function() {

	$("#search-form").submit(function(event) {

		//stop submit the form, we will post it manually.
		event.preventDefault();

		fire_ajax_submit();

	});

});

function fire_ajax_submit() {

	var search = {}
	search["tax"] = $("#tax").val();
	search["value"] = $("#value").val();
	search["custId"] = $("#custId").val();
	search["custName"] = $("#custName").val();
	search["productCode"] = $("#productCode").val();
	search["itemDescription"] = $("#itemDescription").val();
	search["invoiceDate"] = $("#invoiceDate").val();
	search["invoiceLineAmount"] = $("#invoiceLineAmount").val();
	search["addressLine"] = $("#addressLine").val();
	search["custCity"] = $("#custCity").val();
	search["custState"] = $("#custState").val();
	search["custZipCode"] = $("#custZipCode").val();
	search["custCountry"] = $("#custCountry").val();

	$("#btn-search").prop("disabled", true);

	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "/api/calculate",
		data: JSON.stringify(search),
		dataType: 'json',
		cache: false,
		timeout: 600000,
		success: function(data) {

			var json = "<h4>Calculator Response</h4><pre>"
				+ JSON.stringify(data, null, 4) + "</pre>";
			$('#feedback').html(json);

			console.log("SUCCESS : ", data);
			$("#btn-search").prop("disabled", false);

		},
		error: function(e) {

			var json = "<h4>Calculator Response</h4><pre>"
				+ e.responseText + "</pre>";
			$('#feedback').html(json);

			console.log("ERROR : ", e);
			$("#btn-search").prop("disabled", false);

		}
	});

}