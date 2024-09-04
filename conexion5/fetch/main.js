const pelis = "http://localhost:8080/api/listarPeliculas";

fetch(pelis)
.then((response) => response.json())
.then((data) => {
    console.log(data)
})
.catch((err) => console.log("Esto no funciona", err));