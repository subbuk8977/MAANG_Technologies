

document.addEventListener("DOMContentLoaded", function() {
    var dotsIcon = document.querySelector(".dots-icon");
    var dropdownContent = document.getElementById("dropdownContent");

    dotsIcon.addEventListener("click", function() {
        toggleDropdown();
    });

    function toggleDropdown() {
        if (dropdownContent.style.display === "block") {
            dropdownContent.style.display = "none";
        } else {
            dropdownContent.style.display = "block";
        }
    }
});