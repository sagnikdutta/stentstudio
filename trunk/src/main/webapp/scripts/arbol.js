

// Esta función se ejecuta al cargar la página. La función aplica la 
// transformación del XSL sobre el fichero XML, para obtener el código HTML
function initialize() 
{
	
	if (window.ActiveXObject) {
		xmlDoc = new ActiveXObject('Microsoft.XMLDOM');
		xmlDoc.async = false;
		xslDoc = new ActiveXObject('Microsoft.XMLDOM');
		xslDoc.async = false;
		xslDoc.load(xslFile);
		
		//Carga desde un fragmento de XML
		if (self.xmlStream)
			{
				xmlDoc.loadXML(self.xmlStream);				
			}
		else
			{
				xmlDoc.load(xmlFile);
			}
		document.getElementById("arbol").innerHTML = xmlDoc.documentElement.transformNode(xslDoc);
	 }
	else if (document.implementation &&
	document.implementation.createDocument)
	{	
		//Leemos la XSL y lanzamos la función que ejecuta la transformación
		req = new XMLHttpRequest();
		req.onreadystatechange = processReqChange;
		req.open("GET", xslFile, true);
		req.send(null);
	}
	else
	{
		alert('Su navegador no puede gestionar este script. Contacte con su administrador');
	}
 
}


//Ejecuta la transformación del menu XML.
function processReqChange() 
{
    // only if req shows "complete"
    if (req.readyState == 4) {
        // only if "OK"
        if (req.status == 200) {
            // ...processing statements go here...
            var xsltProcessor = new XSLTProcessor();
			var xslStylesheet = req.responseXML;
			
			xsltProcessor.importStylesheet(xslStylesheet);
			if (self.xmlStream)
			{
					//Create XmlDocument
					xmlDoc = document.implementation.createDocument("", "", null);
						
					//create a DOMParser
					var objDOMParser = new DOMParser();
        
					//create new document from string
					var xmlDoc = objDOMParser.parseFromString(self.xmlStream, "text/xml");						
				
			}
			else
			{
				
					// load the xml file
					myXMLHTTPRequest = new XMLHttpRequest();
					myXMLHTTPRequest.open("GET", xmlFile, false);
					myXMLHTTPRequest.send(null);

					xmlDoc = myXMLHTTPRequest.responseXML;
					
			}

			var fragment = xsltProcessor.transformToFragment(xmlDoc, document);
			myDOM = fragment;
	
			document.getElementById("arbol").appendChild(fragment);		
			html = document.getElementById("arbol").innerHTML;
			document.getElementById("arbol").innerHTML = html ;	
        } 
        else {
            alert("Se ha producido un error al recuperar el menu:\n" + req.statusText);
        }
    }
}
// En función del estado del nodo, lo expande o lo contrae. Se ejecuta al hacer
// clic en el nodo.
function clickOnEntity(entity) 
{
  if(entity.getAttribute("open") == "false") expand(entity, true);
  else collapse(entity);
  this.cancelBubble = true;
}

// Expande un nodo mostrando los nodos hijos, y cambiando la imagen asociada
function expand(entity) 
{
  
  	var oImage;
   
	oImage = entity.getElementsByTagName('img')[0];  
	oImage.src = entity.getAttribute('imageOpen');
	for(var i = 0; i < entity.childNodes.length; i++) 
	{
		if(entity.childNodes[i].tagName == "DIV") 
		entity.childNodes[i].style.display = "block";
	}
	entity.setAttribute("open","true");
}

// Contrae un nodo ocultando los nodos hijos, y cambiando la imagen asociada
// Función recursiva.
function collapse(entity) 
{
  var oImage;
  oImage = entity.getElementsByTagName('img')[0]
   oImage.src = entity.getAttribute('image');

  // contrae y oculta hijos
  for(var i = 0; i < entity.childNodes.length; i++) 
  {
    if(entity.childNodes[i].tagName == "DIV") 
	   {
      if(entity.getAttribute('id') != "folderTree") entity.childNodes[i].style.display = "none";
   	  collapse(entity.childNodes[i]);
    }
  }
   entity.setAttribute("open","false");
}

// Expande todos los nodos
function expandAll(entity) 
{
   	var oImage;
	if (entity == null || entity=="undefined")
	{
		entity= document.getElementById("folderTree");
	}
	expand(entity, false);
	for(var i = 0; i < entity.childNodes.length; i++)
		if(entity.childNodes[i].tagName == "DIV")
		expandAll(entity.childNodes[i]);
}


function cambiaCapa(oNode){
		oParent=oNode.parentNode;
		oParent2=oParent.parentNode;
		oParent3=oParent2.parentNode;
		oParent4=oParent3.parentNode;
		oParent5=oParent4.parentNode;
		checkea(oParent5);
	}

//Buscar un elemento en una colección.
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
	
//chekear hijos al marcar al padre
function checkea(entity) {

var check;
	var checki;
	var i=0;
	
	check = ObtenerElmentodeColeccion(entity.childNodes[0].getElementsByTagName("input"),"checkeado","id");
	
	for(var i = 0; i < entity.childNodes.length; i++) {
  		if(entity.childNodes[i].tagName == "DIV") {
			checki = ObtenerElmentodeColeccion(entity.childNodes[i].getElementsByTagName("input"),"checkeado","id");
			
			if((check.checked == true) && (checki.checked == false)){
				checki.checked=true;
			}
			else if((check.checked == true) && (checki.checked == true)){
				checki.checked=true;
			}
			else if((check.checked == false) && (checki.checked == false)){
				checki.checked=false;
			}
			else{
				checki.checked=false;
			}
			checkea(entity.childNodes[i]);
		}
		
  	}
  	
 	this.cancelBubble = true;
	
}


