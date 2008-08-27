// -----------------------------------------------------------------------------
// Proyecto           : SUMAP
// Nombre             : global.js
// Prop�sito          : Aisla en un solo fichero las funciones relacionadas con la 
//						inicializaci�n de las p�ginas y el mostrar el encabezado.
// Referencias        : NA
// Fecha de creaci�n  : Raquel Trillo, 2003-11-13
// Notas              : Se trata de documentar el c�digo de la maqueta
//                      general de aplicaciones web. 
// Historial          : NA
// ..............................................................................


//------------------------------------------------------------------------------
// Nombre      : initialize
// Prop�sito   : Mostrar el t�tulo de la opci�n elegida en el encabezado de la p�gina.
// Retorno     : NA
// Argumentos  :
//		Modo	Nombre	  Tipo de datos	Breve explicaci�n
//		IN      str	  	  String        Indica el t�tulo de la opci�n elegida.
// Referencias : NA
// FCreaci�n   : 2003-11-13
// Notas       : NA
// Historial   : NA
// .............................................................................

function initialize(str)
{
  try
  {    
  	top.frames["topFrame"].document.getElementById("navegacion").innerHTML=str;
    //top.frames["topFrame"].navegacion.innerHTML=str;  
  
  }
  catch(err)
  {
    document.title = str;
  }
  return true;
}

//------------------------------------------------------------------------------
// Nombre      : msg
// Prop�sito   : Mostrar el estado elegido en la barra de estado de la ventana.
// Retorno     : NA
// Argumentos  :
//		Modo	Nombre	  Tipo de datos	Breve explicaci�n
//		IN      str	  	  String        Indica el estado seleccionado.
// Referencias : NA
// FCreaci�n   : 2003-11-13
// Notas       : NA
// Historial   : NA
// .............................................................................

function msg(str)
{
  window.status = str;
  return true;
}

//------------------------------------------------------------------------------
// Nombre      : getPath
// Prop�sito   : Obtener el string que representa la ruta actual.
// Retorno     : El string que representa la ruta actual de la p�gina
// Argumentos  :
//		Modo	Nombre	  Tipo de datos	Breve explicaci�n
// Referencias : NA
// FCreaci�n   : 2003-11-13
// Notas       : NA
// Historial   : NA
// .............................................................................
function getPath()
{
  if(location.protocol == "http:")
    return location.protocol + "//" + location.hostname + location.pathname.substring(1,location.pathname.lastIndexOf("/"));
  else
    return location.pathname.substring(1,location.pathname.lastIndexOf("\\")) + "\\";
}

//------------------------------------------------------------------------------
// Nombre      : getRootPath
// Prop�sito   : Obtener el string que representa la ruta actual del topFrame.
// Retorno     : El string que representa la ruta actual de la p�gina
// Argumentos  :
//		Modo	Nombre	  Tipo de datos	Breve explicaci�n
// Referencias : NA
// FCreaci�n   : 2003-11-13
// Notas       : NA
// Historial   : NA
// .............................................................................
function getRootPath()
{
  return top.frames["topFrame"].frmEntorno.rootPath.value;
}

//------------------------------------------------------------------------------
// Nombre      : Calendar
// Prop�sito   : Proporcionar calendarios para los campos fechas.
// Retorno     : Devolver unha ventana modal con el calendario cargado.
// Argumentos  :
//		Modo	Nombre	  Tipo de datos	Breve explicaci�n
// Referencias : NA
// FCreaci�n   : 2003-11-13
// Notas       : NA
// Historial   : NA
// .............................................................................

function Calendar()
{
 return window.showModalDialog(getRootPath() + 'scripts/calendar.htm','', 'dialogHeight:150px;dialogWidth:160px;center:yes;status:no;scroll:no');
}


	

//------------------------------------------------------------------------------
// Nombre      : ocultaCabecera
// Prop�sito   : Ocultar/mostrar frame izquierdo (Menu navegaci�n)
// Retorno     : NA
// Argumentos  : NA
// Referencias : NA
// FCreaci�n   : 2005-09-30
// Notas       : NA
// Historial   : NA
// .............................................................................

  var cabeceraOculta = 0;  
 function ocultaCabecera(){
   
   if(!cabeceraOculta){
   
	top.document.getElementsByTagName("frameset")[0].getElementsByTagName("frameset")[0].cols ="0,*";    
	cabeceraOculta = 1;
	document.btnCerrar.style.display = 'none';
    document.btnAbrir.style.display = '';  
    	
    

   }
   else{
	top.document.getElementsByTagName("frameset")[0].getElementsByTagName("frameset")[0].cols ="170,*";
    cabeceraOculta = 0;   
    document.btnAbrir.style.display = 'none';
    document.btnCerrar.style.display = '';
    

   }
   
   return;
  } 
  
  function ObtenerElmentodeColeccion(colecccion, idelemento,attributoBusqueda)
{
	var check;
	var i=0;

	for(i=0; i<colecccion.length;i++)
	{
			if (colecccion[i].getAttribute(attributoBusqueda)==idelemento)
			{			
				check = colecccion[i];
				break;
			}
	}
	
	
	return check;
}