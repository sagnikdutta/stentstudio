var openImg = new Image();
 <!-- A�adir /StentStudio/-->
openImg.src = "/images/menu/open.gif";
 <!-- A�adir /StentStudio/-->
var closedImg = new Image();
closedImg.src = "/images/menu/closed.gif";
   
   function showBranch(branch){
      var objBranch = document.getElementById(branch).style;
      if(objBranch.display=="block"){
         objBranch.display="none";
	}
      else{
         objBranch.display="block";
	}
      swapFolder('I' + branch);
   }
   
   function swapFolder(img){
      objImg = document.getElementById(img);
      if(objImg.src.indexOf('closed.gif')>-1)
         objImg.src = openImg.src;
      else
         objImg.src = closedImg.src;
   }
