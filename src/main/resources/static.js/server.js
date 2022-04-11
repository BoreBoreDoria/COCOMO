
$(function () {
    $('#resultLight').on("click", function () {

        let request = {
            size: $("#sizeBasic").val(),
            projectTypeLight: $($('[name = "typrLight"]:checked')[0]).val()
        };
        fetch('http://localhost:8080/rest/light', {
            method: "POST",
            credentials: 'same-origin',
            body: JSON.stringify(user),
            headers: {
                'content-type': 'application/json'
            }
        }).then(response => {
            response.json().then(
                data => {
                    console.log(data)
                })
        })
    });
});