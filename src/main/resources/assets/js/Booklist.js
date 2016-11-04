$(document).ready(function() {
    $('#table').DataTable({
    "ordering": true,
    "order": [[ 0, "asc" ]],
    "lengthChange": false,
    "paging": false,
    "info": false});
});