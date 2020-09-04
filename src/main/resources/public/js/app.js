var app = (function () {

    var listaNumeros = [];

    var mostrarResultados = function(error, datos) {
        if(error != null){
            alert("Error, verifique que la entrada tiene el formato establecido.");
            return;
        }
        $("#idTdMedia").text(datos.promedio);
        $("#idTdSumatoria").text(datos.sumatoria);
        $("#idTdListaOrdenada").text(datos.listaOrdenada);
        $("#idTable").css("display", "inline-table");
    }

    var añadirNumeros = function() {    
        var numeros = $("#idTextArea").val();
        if (numeros == "") {
            alert("El campo no puede estar vacio!");
            return
        } else if (numeros[0] == "," || numeros[numeros.length - 1] == ",")  {
            alert("Verifique que la entrada corresponde a las especificaciones dadas.");
            return;
        }

        console.log(numeros);
        listaNumeros = numeros.split(',');
        console.log(listaNumeros);
        apiclient.realizarCalculos(listaNumeros, mostrarResultados);
    }

    function refreshAll () {
        $("#idTextArea").val("");
        $("#idTdMedia").text("");
        $("#idTdDesviacion").text("");
        $("#idTable").css("display", "none");
    }

    return {
        realizarCalculos: function() {
            añadirNumeros();
        }, refrescarTodo: function() {
            refreshAll();
        }
    }
})();