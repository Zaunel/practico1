let tiempo = 0;
function carru(){
   console.log(tiempo);
   tiempo++;
   document.getElementById("carrusel").src = '../imagenes/carrusel_' +tiempo+'.jpg'
   if(tiempo == 3) {
      tiempo = 0;
  }
   setTimeout(carru,3000)
}
carru()