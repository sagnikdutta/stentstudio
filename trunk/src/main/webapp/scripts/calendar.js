// Title: Tigra Calendar PRO
// Description: Tigra Calendar PRO is flexible JavaScript Calendar offering
//	high reliability and wide browsers support.
// URL: http://www.softcomplex.com/products/tigra_calendar_pro/
// Version: 2.1.16 (popup mode)
// Date: 04/15/2005 (mm/dd/yyyy)
// Technical Support: support@softcomplex.com (specify product title and order ID)
// Notes: This Script is shareware. Please visit url above for registration details.

//Code prepared by Tigra Javascript Scrambler version 1.0 (http://www.softcomplex.com/)

var A_CALENDARS=[],TCC=[];
var TC2a='aAdDFhHilmMsUYy',TC2f='dMDFhHimsUYy',TCJ={'a':"([a-z]{2})",'A':"([A-Z]{2})",'d':"([0-9]{0,2})",'D':"([A-z]{3})",'F':"([A-z]{0,15})",'h':"([0-9]{0,2})",'H':"([0-9]{0,2})",'i':"([0-9]{0,2})",'l':"([A-z]{0,15})",'m':"([0-9]{0,2})",'M':"([A-z]{3})",'s':"([0-9]{0,2})",'U':"([0-9]{0,12})",'Y':"([0-9]{4})",'y':"([0-9]{2})"},TC6={'a':[null,function(TC5){if(TC5>=12)return ARR_STRINGS['am_pm'][3];else return ARR_STRINGS['am_pm'][1]},null],'A':[null,function(TC5){if(TC5>=12)return ARR_STRINGS['am_pm'][2];else return ARR_STRINGS['am_pm'][0]},null],'d':['setDate',function(TC5,TC2){TC5=TC5.getDate();if(TC5<10)return('0'+TC5);else return TC5},function(TC5){return TC5*1}],'D':[null,function(TC5){return ARR_STRINGS['short_days'][TC5.getDay()]},function(TC5){return TC5*1}],'l':[null,function(TC5){return ARR_STRINGS['long_days'][TC5.getDay()]},function(TC5){return TC5*1}],'h':['setHours',function(TC5){TC5=TC5.getHours();if(TC5==0)return(TC5+12);else if(TC5<=12)return TC5;else return(TC5-12);},function(TC5,TC4){TC5=TC5*1;
if(TC4==ARR_STRINGS['am_pm'][2]||TC4==ARR_STRINGS['am_pm'][3])return 12+(TC5==12?0:TC5);else{TC5=TC5==12?0:TC5;return(TC5);}}],'H':['setHours','getHours',function(TC5){return TC5*1}],'i':['setMinutes',function(TC5){TC5=TC5.getMinutes();if(TC5<10)return('0'+TC5);else return TC5*1},function(TC5){return TC5*1}],'s':['setSeconds',function(TC5){TC5=TC5.getSeconds();if(TC5<10)return('0'+TC5);else return TC5*1},function(TC5){return TC5*1}],'m':['setMonth',function(TC5){TC5=TC5.getMonth()+1;if(TC5<10)return('0'+TC5);else return TC5},function(TC5){return(TC5*1-1)}],'F':['setMonth',function(TC5){return ARR_STRINGS['long_month'][TC5.getMonth()]},function(TC5){var i;TC5=TC5+'';for(i=0;i<13;i++)if(ARR_STRINGS['long_month'][i].toLowerCase()==TC5.toLowerCase())return(i);return alert(ARR_STRINGS['bad_month'].replace(/%month_name/g,TC5))}],'M':['setMonth',function(TC5){return ARR_STRINGS['short_month'][TC5.getMonth()]},function(TC5){var i;TC5=TC5+'';for(i=0;i<13;i++)if(ARR_STRINGS['short_month'][i].toLowerCase()==TC5.toLowerCase())return(i);return alert(ARR_STRINGS['bad_month'].replace(/%month_name/g,TC5))}],'U':[],'Y':['setFullYear','getFullYear',function(TC5){return TC5*1}],'y':['setFullYear',function(TC5){TC5=TC5.getFullYear()+'';return TC5.substring(TC5.length-2,TC5.length);},function(TC5){if(TC5<50)return('20'+TC5)*1;else return('19'+TC5)*1}]},TC1H,TC26;

function calendar(TCL,TCK)
{
 
  var TC1d=this.TC1d=A_CALENDARS.length;
  A_CALENDARS[TC1d] = this;

  TCC[TC1d]=[new Image(),new Image(),new Image(),new Image(),new Image()];
  TCC[TC1d][0].src=TCK.hourminusimage.src;TCC[TC1d][1].src=TCK.hourplusimage.src;TCC[TC1d][2].src=TCK.disminusimage.src;
  TCC[TC1d][3].src=TCK.displusimage.src;
  TCC[TC1d][4].src=TCK.todayimage.src;
  this.TC0Q=TCe;this.TC1D=TCq;
  this.TC05=(TCL.controlname?TCL.controlname:'datetime_'+this.TC1d);
  if(!TCL.formname){
   this.TC0Q('need_form_name');return;
  }
  if(!document.forms[TCL.formname]){
     this.TC0Q('form_not_found',TCL.formname);
	 return;
   }
   
    //Recuperamos los d�as se�alados (festivos, etc) que han podido ser configurados al iniciar el calendario
  if (TCL.marked == null)
  	{
		var marked = new Array();
		TCL.marked= marked;
	}
  if (TCL.marked.date == null)
  	{
		var date = new Array();
		TCL.marked.date = date;
  	}

  	//Recuperamos de la XMl los d�as se�alados (festivos)
  	var carga = loadXML("scripts/Festivos.xml","FESTIVO");
	
	// Si ha recuperado los datos del XML
 	if (carga !=null)
		{	
  			//A�adimos a la colecci�n de festivos los recuperados de la XML
			for (i=0;i<carga.length;i++)
				{
					if (carga[i] != null)
						TCL.marked.date.push(carga[i]);		
				}
 		}
   this.TC2N=(TCL.picttype=='img'?1:TCL.picttype=='button'?2:TCL.picttype=='others'?3:1);
   this.TC05=(TCL.controlname?TCL.controlname:'datetime_'+this.TC1d);
   this.TC2M=(TCL.pictname?TCL.pictname:'calicon_'+this.TC1d);
   this.TCY=(TCL.controlonchange?true:false);
   this.TCX=false;this.formname=TCL.formname;
   this.TC1u=(TCL.nobasecontrolpanelstyle?true:false);
   if(!TC26)TC26=new TC0();
   this.popup=TCx;
   this.TC03=TCa;
   this.TC1C=TCp;
   this.TC0R=TCf;
   this.TC1P=TCs;
   this.TC2X=TCy;
   this.TC0S=TCg;
   this.TC18=TCo;
   this.TC06=TCb;this.TC0q=TCh;this.TC32=TC00;this.TC2J=TC2h;this.TC1A=TC1B;this.TC1U=TC1U;this.TC10=TCn;this.TC0y=TCl;
   this.TC0w=TCj;this.TC0x=TCk;this.TC0z=TCm;this.TC0v=TCi;this.TC2L=TCv;this.TC2k=TCz;this.TCK=TCK;this.TCL=TCL;
   var TC2r=this.TC0r=!this.TCL.dataformat?'Y-d-m':this.TCL.dataformat;
   this.TC2v=!this.TCL.TC0N?'F Y':this.TCL.TC0N;this.TC2o=this.TC0q(this.TCL.noerror);
   var TC04,TC1=0,TCG=[];this.TCB=[];var TCI=["\\\\","\\/","\\.","\\+","\\*","\\?","\\$","\\^","\\|"];
   for(i=0;i<TC2r.length;i++){
    TC04=TC2r.substr(i,1);
    if(TC2a.indexOf(TC04)!=-1&&TC04!=''){TCG[TC1]=TC04;this.TCB[TC1++]=TC04}
    }
	TC1=1;var TCG=TCG.sort();
	for(i in TCI){
	 TC2r=TC2r.replace(eval("/"+TCI[i]+"/g"),TCI[i]);
	 }
	 for(i=0;i<TCG.length;i++){
	  TC2R=new RegExp(TCG[i]);
	  TC2r=TC2r.replace(TC2R,TCJ[TCG[i]])}this.TC2Q=new RegExp("^"+TC2r.replace(/\s+/g,"\\s+")+"$");
	  this.TC1Q=(this.TC0r.indexOf('H')!=-1)?(this.TC0r.indexOf('s')!=-1?2:3):((this.TC0r.indexOf('h')!=-1)?((this.TC0r.indexOf('a')<0&&this.TC0r.indexOf('A')<0)?99:1):0);
	  if(this.TC1Q==99){
	  this.TC0Q('not_format');
	  return;}
	  if(this.TC1Q){
	    this.TC0h=this.TC0k=new Object();if(this.TC1Q==2)this.TC0m=new Object();
		if(this.TC1Q==1)this.TC0d=new Object();
	  }
	  this.TC0M=(TCL.today?this.TC2J(TCL.today):(this.TC1Q!=0?this.TC0R(null,true):this.TC0R()));
	  this.TC0J=this.TC03(TCL.selected,this.TC0M,true);
	  this.TC0F=TCL.mindate?this.TC03(TCL.mindate,this.TC0M):null;
	  this.TC0D=TCL.maxdate?this.TC03(TCL.maxdate,this.TC0M):null;var TCA=['marked','allowed','forbidden','onclickday'];
	  for(var TC1e in TCA){
	   this.TC1P(TCL,TCA[TC1e]);
	  }
	  this.TC0J=this.TC32(this.TC0J);
	  this.TC0l=this.TC0o=this.TC0h=this.TC0k=this.TC0m=this.TC0d=new Object();
	  this.TC0n=new Object();
	  this.TC0f=new Object();
	  this.TC36=TC02;this.TC17=false;this.create=TCc;this.TC1F=TCr;this.TC0P=TCd;
	  this.TC1s=TCt;this.TC2A=TCu;this.TC2O=TCw;this.verifycontrol=TC01;
	  this.TC2w=this.TCL.watch==true?this.TC1A(this.TC0J):'';this.TC0p=this.TC18();
	  if(this.TC0p&64)
	    document.write('<table border="0" cellpadding="1" cellspacing="1" align="center"><tr><td>');
		if(!this.TC1D(this.TC05)){
		  document.write('<input type="Text" id="',this.TC05,'"  ',this.TCY?'onchange="A_CALENDARS['+this.TC1d+'].verifycontrol();"':'','   name="',this.TC05,'" value="',TC26.TC2D?this.TC2w:'','" ',this.TC1C('datacontrol'),'>&nbsp;');
		  }
		 if(this.TC2N!=3){
		    if(this.TC0p&4){
			  document.write('<a href="javascript:A_CALENDARS['+this.TC1d+'].popup();" a><img  align="absbottom" '+this.TC1C('caliconshow')+' name="'+this.TC2M+'" id="'+this.TC2M+'"></a>');
		 }
		 else if(this.TC0p&8){document.write('<input type="button"  '+this.TC1C('calbutton')+' name="'+this.TC2M+'" id="'+this.TC2M+'" onclick="A_CALENDARS['+this.TC1d+'].popup();">');
		 }
	   }
		 if(this.TC0p&64)document.write('</td></tr></table>');
		 this.TC0e=this.TC1D(this.TC05);
		 if(this.TC0p&2){
		   this.TC0e.value=this.TC2w;
		  }
		  else if(this.TC0e.value)this.TC2n=this.TC0e.value;
}
		  
function TCo(){
  var TC1m=1;
  if(!this.TC1D(this.TC05))TC1m|=2;
  if(this.TC2N!=3){
    if(this.TC2N==1&&!this.TC1D(this.TC2M))TC1m|=4;
	if(this.TC2N==2&&!this.TC1D(this.TC2M))TC1m|=8;
  }else TC1m|=16;
  if(TC1m&2&&(TC1m&4||TC1m&8))TC1m|=64; 
  return TC1m;
}
  
function TCb(nocontrols){
 var TC1m=1;
 if(!nocontrols)TC1m|=2;
 else{
 	if(nocontrols.notoday)TC1m|=4;
	if(nocontrols.noyear)TC1m|=8;
	if(nocontrols.nomonth)TC1m|=16;
	if(nocontrols.nohour)TC1m|=32;
	if(nocontrols.nominute)TC1m|=64;
	if(nocontrols.nosecond)TC1m|=128;
	if(nocontrols.noampm)TC1m|=256;
	if(nocontrols.noothermonthday)TC1m|=512;
	}
	return TC1m;
}
function TCh(noerror){
  var TC1m=1;
  if(!noerror)TC1m|=2;
  else{
   if(noerror.nominerror)TC1m|=4;
   if(noerror.nomaxerror)TC1m|=8;
   if(noerror.nocontrolerror)TC1m|=16;
   }
   return TC1m;
   }
   function TC01(){
   if(this.TC0e.value){
   var TC11=false;
   if(this.TC2n==this.TC0e.value||this.TC2o&16){
     TC11=true;
	 }
    this.TC0J=this.TC2J(this.TC0e.value+'',TC11);
	this.TC0J=this.TC32(this.TC0J);
	}
    }
	function TCx(TC20,TCR,TC2z){
	if(!this.flag_error){
	  if(TC20){
	    this.TC0J=new Date(TC20);
		}
	else this.verifycontrol();
	if(this.TCL.watch==true)this.TC0e.value=this.TC1A(this.TC0J);
	else if(TC2z=='chislo'){
	   this.TC0e.value=this.TC1A(this.TC0J);
	   }
	   if(TCR){this.TC29.close();
	   this.TC29=null;return;
	   }
	   var TC1h=200,TC1o=200;
	   this.TC37=this.TCK.w;
	   this.TC1G=this.TCK.h;
	   if(this.TC1Q)this.TC1G+=23;
	   if(TC26.TC1T&&TC26.TC1w)this.TC37+=60;
	   if(screen){TC1h=(screen.width-this.TC37)>>1;TC1o=(screen.height-this.TC1G)>>1;
	   }
	   if(TC26.TC1Y){
	   var TC1E=""+this.TC0J.valueOf();
	   TC1E=TC1E.split(":");
	   if(TC1E.length==2)TC0O=""+TC1E[0]+'0'+TC1E[1];
	   else TC0O=this.TC0J.valueOf();
	   }
	   else TC0O=this.TC0J.valueOf();
	   if(this.TC29){
	     if(this.TC17){
		   if(TC26.TC2E){
		     this.TC29=window.open('calendar.html?datetime='+TC0O+'&id='+this.TC1d,'Calendar','width='+this.TC37+',height='+this.TC1G+',location=0,status=0,resizable=1,top='+TC1o+','+'left='+TC1h+',dependent=yes,alwaysRaised=yes');
			 }
			 else this.TC29.document.location='calendar.html?datetime='+TC0O+'&id='+this.TC1d;
			 }
		    else{
			    this.TC29=window.open('calendar.html?datetime='+TC0O+'&id='+this.TC1d,'Calendar','width='+this.TC37+',height='+this.TC1G+',location=0,status=0,resizable=1,top='+TC1o+','+'left='+TC1h+',dependent=yes,alwaysRaised=yes');
			}
		}
	else this.TC29=window.open('calendar.html?datetime='+TC0O+'&id='+this.TC1d,'Calendar','width='+this.TC37+',height='+this.TC1G+',location=0,status=0,resizable=1,top='+TC1o+','+'left='+TC1h+',dependent=yes,alwaysRaised=yes');
	this.TC29.opener=window;this.TC29.focus();}this.TC2j=true;}
	  
function TC02(){
  this.TC0g=0;
  if(!this.TC39){
     this.TC29.resizeTo(this.TC37,this.TC1G);
	 if(window.innerWidth!=null){
	   TC0t=this.TC29.innerWidth;
	   TC0s=this.TC29.innerHeight;
	   }
	 else{
	 TC0t=this.TC29.document.body.clientWidth;
	 TC0s=this.TC29.document.body.clientHeight;
	 }
	 this.TC39=this.TC37-TC0t;
	 this.TC38=this.TC1G-TC0s;
	 }
	 if(TC26.TC2D){
	   setTimeout('A_CALENDARS['+this.TC1d+'].TC29.resizeTo(A_CALENDARS['+this.TC1d+'].TC0f.offsetWidth+A_CALENDARS['+this.TC1d+'].TC39, A_CALENDARS['+this.TC1d+'].TC0f.offsetHeight+A_CALENDARS['+this.TC1d+'].TC38)',100);
	 }
	 else 
	   if(TC26.TC2C){
	     setTimeout('A_CALENDARS['+this.TC1d+'].TC29.resizeTo(A_CALENDARS['+this.TC1d+'].TC0f.style.pixelWidth+A_CALENDARS['+this.TC1d+'].TC39, A_CALENDARS['+this.TC1d+'].TC0f.style.pixelHeight+A_CALENDARS['+this.TC1d+'].TC38)',300);
		 }
		 else this.TC29.resizeTo(this.TC0f.offsetWidth+this.TC39,this.TC0f.offsetHeight+this.TC38);
}
function TCa(TC2_,TC07,TCU){if(!TC2_)return(TCU?TC07:null);var TC2T=/^[+-]?\d+$/,TC0I;return(TC2T.exec(TC2_)?new Date(TC07.valueOf()+new Number(TC2_*864e5)):this.TC2J(TC2_));}function TCc(TC0Y,TC1d){TC0Y=this.TC32(TC0Y),TC06=this.TC06(this.TCL.nocontrols);if(this.TC1Q!=2)TC0Y.setSeconds(0);TC0i=this.TC1C('disminusimage');TC0b="#";TC0j=this.TC1C('displusimage');TC0c="#";var TCP=this.TC2O(TC0Y);var TC2p=new TCM();var signal='onchange';TC2p.add('<div id="dws" name="dws" style=" position:absolute;   top:0;  left:0;  ">');TC2p.add('<table',this.TC1C('outertable'),'>');if(TC06&2||!(TC06&4)||!(TC06&8)||!(TC06&16))TC2p.add('<tr><td><table ',this.TC1C('navtable'),'><tr>');if(!this.TC1u){if(this.TCK.todaycell&&this.TCK.todayimage&&(TC06&2||!(TC06&4)))TC2p.add('<td rowspan="2"'+this.TC1C('todaycell')+'><a href="javascript:  TC28.TC1s(null, '+this.TC2X(this.TC0M)+');"><img name="cal_itoday'+TC1d+'"'+this.TC1C('todayimage')+'></a></td>');if(TC06&2||!(TC06&16)){TC2p.add('<td rowspan="2"',this.TC1C('monthselectorcell'),'><select name="cal_mon',TC1d,'" id="cal_mon',TC1d,'"',this.TC1C('monthselector'),' onchange="TC28.TC1s(\'mon\',',TC0Y.valueOf(),',\'month\')">');TC2p.add(this.TC0y(TC0Y));TC2p.add('</select></td><td',this.TC1C('monthscrollcell'),'><a href="',TCP["TC0b"],'" name="cal_amminus',TC1d,'" id="cal_amminus',TC1d,'"><img name="cal_imminus',TC1d,'" id="cal_imminus',TC1d,'" ',TCP["TC0i"],'></a></td>');}if(TC06&2||!(TC06&8)){TC2p.add('<td rowspan="2"',this.TC1C('yearselectorcell'),'><select name="cal_year',TC1d,'" id="cal_year',TC1d,'"',this.TC1C('yearselector'),' onchange="TC28.TC1s(\'year\',',TC0Y.valueOf(),',\'year\')">');TC2p.add(this.TC10(TC0Y));TC2p.add('</select></td><td',this.TC1C('yearscrollcell'),'><a href="',TCP["e_ayminus_href"],'"  name="cal_ayminus',TC1d,'" id="cal_ayminus',TC1d,'" ><img name="cal_iyminus',TC1d,'" id="cal_iyminus',TC1d,'" ',TCP["e_iyminus_src"],'></a></td>');}if(TC06&2||!(TC06&4)||!(TC06&8)||!(TC06&16))TC2p.add('</tr><tr>');if(TC06&2||!(TC06&16))TC2p.add('<td',this.TC1C('monthscrollcell'),'><a href="',TCP["TC0c"],'" name="cal_amplus',TC1d,'" id="cal_amplus',TC1d,'"><img name="cal_implus',TC1d,'" id="cal_implus',TC1d,'" ',TCP["TC0j"],'></a></td>');if(TC06&2||!(TC06&8))TC2p.add('<td',this.TC1C('yearscrollcell'),'><a href="',TCP["e_ayplus_href"],'" name="cal_ayplus',TC1d,'" id="cal_ayplus',TC1d,'"><img name="cal_iyplus',TC1d,'" id="cal_iyplus',TC1d,'" ',TCP["e_iyplus_src"],'></a></td>');}else{if(TC06&2||!(TC06&8)){TC2p.add('<td',this.TC1C('yearscrollcell'),'><a href="',TCP["e_ayminus_href"],'"  name="cal_ayminusalt',this.TC1d,'" id="cal_ayminusalt',this.TC1d,'" ><img name="cal_iyminusalt',this.TC1d,'" id="cal_iyminusalt',this.TC1d,'" ',TCP["e_iyminus_src"],' ></a></td>');}if(TC06&2||!(TC06&16)){TC2p.add('<td',this.TC1C('monthscrollcell'),'><a href="',TCP["TC0b"],'"  name="cal_amminusalt',this.TC1d,'" id="cal_amminusalt',this.TC1d,'" ><img name="cal_imminusalt',this.TC1d,'" id="cal_imminusalt',this.TC1d,'" ',TCP["TC0i"],'></a></td>');}TC2p.add('<td align="center"><span ',this.TC1C('datatitle'),'  id="data_title',this.TC1d,'" name="data_title',this.TC1d,'">',this.TC1A(this.TC0J,true),'</span></td>');if(TC06&2||!(TC06&16)){TC2p.add('<td',this.TC1C('monthscrollcell'),'><a href="',TCP["TC0c"],'"  name="cal_amplusalt',this.TC1d,'" id="cal_amplusalt',this.TC1d,'" ><img name="cal_implusalt',this.TC1d,'" id="cal_implusalt',this.TC1d,'" ',TCP["TC0j"],'></a></td>');}if(TC06&2||!(TC06&8)){TC2p.add('<td',this.TC1C('yearscrollcell'),'><a href="',TCP["e_ayplus_href"],'"  name="cal_ayplusalt',this.TC1d,'" id="cal_ayplusalt',this.TC1d,'" ><img name="cal_iyplusalt',this.TC1d,'" id="cal_iyplusalt',this.TC1d,'" ',TCP["e_iyplus_src"],'></a></td>');}}if(TC06&2||!(TC06&4)||!(TC06&8)||!(TC06&16))TC2p.add('</tr></table></td></tr>');TC2p.add('<tr><td id="cal_grid',TC1d,'"',this.TC1C('gridcell'),'>',this.TC1F(),'</td></tr>');if(this.TC1Q){if(TC06&2||!(TC06&32)||!(TC06&64)||!(TC06&128)||!(TC06&256))TC2p.add('<tr><td align="center"><table ',this.TC1C('timetable'),'><tr>');if(TC06&2||!(TC06&32)){TC2p.add('<td rowspan="2"',this.TC1C('timeselectorcell'),'><select name="cal_hour',TC1d,'" onchange="TC28.TC1s(\'time\',',TC0Y.valueOf(),',\'hour\')" ',this.TC1C('timeselector'),'>');TC2p.add(this.TC0w(TC0Y));TC2p.add('</select></td><td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_ahminus_href"],'" name="cal_ahminus',TC1d,'" id="cal_ahminus',TC1d,'"><img name="cal_ihminus',TC1d,'" id="cal_ihminus',TC1d,'" ',TCP["e_ihminus_src"],'></a></td>');}if(TC06&2||!(TC06&64)){TC2p.add('<td rowspan="2"',this.TC1C('timeselectorcell'),'><select name="cal_min',TC1d,'"  ',this.TC1C('timeselector'),' onchange="TC28.TC1s(\'time\',',TC0Y.valueOf(),',\'minute\')">');TC2p.add(this.TC0x(TC0Y));TC2p.add('</select></td><td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_aiminus_href"],'" name="cal_aiminus',TC1d,'" id="cal_aiminus',TC1d,'"><img name="cal_iiminus',TC1d,'" id="cal_iiminus',TC1d,'" ',TCP["e_iiminus_src"],'></a></td>');}if(this.TC1Q==2){if(TC06&2||!(TC06&128)){TC2p.add('<td rowspan="2"',this.TC1C('timeselectorcell'),'><select name="cal_sec',TC1d,'"  ',this.TC1C('timeselector'),' onchange="TC28.TC1s(\'time\',',TC0Y.valueOf(),',\'second\')">');TC2p.add(this.TC0z(TC0Y));TC2p.add('</select></td><td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_asminus_href"],'" name="cal_asminus',TC1d,'" id="cal_asminus',TC1d,'"><img name="cal_isminus',TC1d,'" id="cal_isminus',TC1d,'" ',TCP["e_isminus_src"],'></a></td>');}}if(this.TC1Q==1){if(TC06&2||!(TC06&256)){TC2p.add('<td rowspan="2"',this.TC1C('timeselectorcell'),'><select name="cal_ap',TC1d,'"  ',this.TC1C('timeselector'),' onchange="TC28.TC1s(\'time\',',TC0Y.valueOf(),',\'ampm\')">');TC2p.add(this.TC0v(TC0Y));TC2p.add('</select></td><td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_aaminus_href"],'" name="cal_aaminus',TC1d,'" id="cal_aaminus',TC1d,'"><img name="cal_iaminus',TC1d,'" id="cal_iaminus',TC1d,'" ',TCP["e_iaminus_src"],'></a></td>');}}if(TC06&2||!(TC06&32)||!(TC06&64)||!(TC06&128)||!(TC06&256))TC2p.add('</tr><tr>');if(TC06&2||!(TC06&32))TC2p.add('<td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_ahplus_href"],'" name="cal_ahplus',TC1d,'" id="cal_ahmplus',TC1d,'"><img name="cal_ihplus',TC1d,'" id="cal_ihplus',TC1d,'" ',TCP["e_ihplus_src"],'></a></td>');if(TC06&2||!(TC06&64))TC2p.add('<td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_aiplus_href"],'" name="cal_aiplus',TC1d,'" id="cal_aiplus',TC1d,'"><img name="cal_iimplus',TC1d,'" id="cal_iiplus',TC1d,'" ',TCP["e_iiplus_src"],'></a></td>');if(this.TC1Q==2){if(TC06&2||!(TC06&128)){TC2p.add('<td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_asplus_href"],'" name="cal_asplus',TC1d,'" id="cal_asplus',TC1d,'"><img name="cal_isplus',TC1d,'" id="cal_isplus',TC1d,'" ',TCP["e_isplus_src"],'></a></td>');}}if(this.TC1Q==1){if(TC06&2||!(TC06&256)){TC2p.add('<td ',this.TC1C('timescrollcell'),'><a href="',TCP["e_aaplus_href"],'" name="cal_aaplus',TC1d,'" id="cal_aaplus',TC1d,'"><img name="cal_iaplus',TC1d,'" id="cal_iaplus',TC1d,'" ',TCP["e_iaplus_src"],'></a></td>');}}if(TC06&2||!(TC06&32)||!(TC06&64)||!(TC06&128)||!(TC06&256))TC2p.add('</tr></table></td></tr>');}TC2p.add('</table>');TC2p.add('</div>');return TC2p.TC2g();}function TCw(TC0Y){var TC1a=this.TC0S(TC0Y),TC06=this.TC06(this.TCL.nocontrols);var TCP=[];if(TC06&2||!(TC06&8)){if(this.TC0F&&TC0Y.getFullYear()-1<this.TC0F.getFullYear()){TCP['e_iyminus_src']=!this.TC1u?this.TC1C('disminusimage'):this.TC1C('disyearminusimagealt');TCP['e_ayminus_href']="#";}else{TCP['e_iyminus_src']=!this.TC1u?this.TC1C('yearminusimage'):this.TC1C('yearminusimagealt');TCP['e_ayminus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,-1)+",'year');";}if(this.TC0D&&TC0Y.getFullYear()+1>this.TC0D.getFullYear()){TCP['e_iyplus_src']=!this.TC1u?this.TC1C('displusimage'):this.TC1C('disyearplusimagealt');TCP['e_ayplus_href']="#";}else{TCP['e_iyplus_src']=!this.TC1u?this.TC1C('yearplusimage'):this.TC1C('yearplusimagealt');TCP['e_ayplus_href']="javascript:TC28.TC1s(null, "+this.TC2X(TC0Y,null,+1)+",'year');";}}if(TC06&2||!(TC06&16)){if(this.TC0F&&(TC1a&4096)&&(TC1a&8192)){TCP['TC0i']=!this.TC1u?this.TC1C('disminusimage'):this.TC1C('dismonthminusimagealt');TCP['TC0b']="#";}else{TCP['TC0i']=!this.TC1u?this.TC1C('monthminusimage'):this.TC1C('monthminusimagealt');TCP['TC0b']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,-1,null)+",'month');";}if(this.TC0D&&(TC1a&131072)&&(TC1a&262144)){TCP['TC0j']=!this.TC1u?this.TC1C('displusimage'):this.TC1C('dismonthplusimagealt');TCP['TC0c']="#";}else{TCP['TC0j']=!this.TC1u?this.TC1C('monthplusimage'):this.TC1C('monthplusimagealt');TCP['TC0c']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,+1,null)+",'month');";}}if(this.TC1Q){if(TC06&2||!(TC06&32)){if(this.TC0F&&(TC1a&16384)&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)){TCP['e_ihminus_src']=this.TC1C('disminusimage');TCP['e_ahminus_href']="#";}else{TCP['e_ihminus_src']=this.TC1C('hourminusimage');TCP['e_ahminus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,-1)+",'hour');";}if(this.TC0D&&(TC1a&524288)&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)){TCP['e_ihplus_src']=this.TC1C('displusimage');TCP['e_ahplus_href']="#";}else{TCP['e_ihplus_src']=this.TC1C('hourplusimage');TCP['e_ahplus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,+1)+",'hour');";}}if(TC06&2||!(TC06&64)){if(this.TC0F&&(TC1a&32768)&&(TC1a&16384)&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)){TCP['e_iiminus_src']=this.TC1C('disminusimage');TCP['e_aiminus_href']="#";}else{TCP['e_iiminus_src']=this.TC1C('minminusimage');TCP['e_aiminus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,null,-1)+",'minute');";}if(this.TC0D&&(TC1a&1048576)&&(TC1a&524288)&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)){TCP['e_iiplus_src']=this.TC1C('displusimage');TCP['e_aiplus_href']="#";}else{TCP['e_iiplus_src']=this.TC1C('minplusimage');TCP['e_aiplus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,null,+1)+",'minute');";}}if(this.TC1Q==2){if(TC06&2||!(TC06&128)){if(this.TC0F&&(TC1a&65536)&&(TC1a&32768)&&(TC1a&16384)&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)){TCP['e_isminus_src']=this.TC1C('disminusimage');TCP['e_asminus_href']="#";}else{TCP['e_isminus_src']=this.TC1C('secminusimage');TCP['e_asminus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,null,null,-1)+",'second');";}if(this.TC0D&&(TC1a&2097152)&&(TC1a&1048576)&&(TC1a&524288)&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)){TCP['e_isplus_src']=this.TC1C('displusimage');TCP['e_asplus_href']="#";}else{TCP['e_isplus_src']=this.TC1C('secplusimage');TCP['e_asplus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,null,null,+1)+",'second');";}}}if(this.TC1Q==1){if(TC06&2||!(TC06&256)){if(TC0Y.getHours()<12||(this.TC0F&&(TC1a&16384)&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304))){TCP['e_iaminus_src']=this.TC1C('disminusimage');TCP['e_aaminus_href']="#";}else{TCP['e_iaminus_src']=this.TC1C('apminusimage');TCP['e_aaminus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,-12,null,0)+",'ampm');";}if(TC0Y.getHours()>=12||(this.TC0D&&(TC1a&524288)&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608))){TCP['e_iaplus_src']=this.TC1C('displusimage');TCP['e_aaplus_href']="#";}else{TCP['e_iaplus_src']=this.TC1C('applusimage');TCP['e_aaplus_href']="javascript:  TC28.TC1s(null, "+this.TC2X(TC0Y,null,null,+12,null,0)+",'ampm');";}}}}return TCP;}function TCn(TC0Y){var TC2p=new TCM();var TC11=true;if(TC11){var TC1b=TC0Y.getFullYear()-this.TCK.yearsbefore,TC1g=TC0Y.getFullYear()+this.TCK.yearsafter,TC0E=new Date(TC1b,11,31),TC0C=new Date(TC1b,0,1),TC1e;if(!(this.TC0S(TC0E)&256)){TC2p.add('<option value="-" ><<'+TC1b+'</option>');}for(TC1q=TC1b+1;TC1q<TC1g;TC1q++){TC0E.setFullYear(TC1q);TC0C.setFullYear(TC1q);if(!(this.TC0S(TC0E)&256||this.TC0S(TC0C)&512)){TC2p.add('<option value="_"'+(TC1q==TC0Y.getFullYear()?'selected':'')+'>'+TC1q+'</option>');}}TC0C.setFullYear(TC1g);if(!(this.TC0S(TC0C)&512)){TC2p.add('<option value="+" >'+TC1g+'>></option>');}}return TC2p.TC2g();}function TCl(TC0Y){var TC2p=new TCM();var TC11=true;TC0H=TC0G=new Date(TC0Y);for(var TC1k=0;TC1k<12;TC1k++){if(this.TC0F){if(TC0Y.getFullYear()==this.TC0F.getFullYear()){TC11=(TC1k>=this.TC0F.getMonth())?true:false;}}if(this.TC0D&&TC11){if(TC0Y.getFullYear()==this.TC0D.getFullYear()){TC11=(TC1k<=this.TC0D.getMonth())?true:false;}}if(TC11){TC2p.add('<option value="'+TC1k+'"'+(TC1k==TC0Y.getMonth()?' selected':'')+'>'+this.TCK.months[TC1k]+'</option>');}}return TC2p.TC2g();}function TCj(TC0Y){TC1a=this.TC0S(TC0Y);var TC2p=new TCM();var TC11=true;if(this.TC1Q==1){var TC1J=(TC0Y.getHours()>12?12:0);for(TC21=1;TC21<=12;TC21++){if(this.TC0F&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)){TC11=((TC21+TC1J)>=this.TC0F.getHours())?true:false}if(this.TC0D&&TC11&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)){TC11=(TC21+TC1J<=this.TC0D.getHours())?true:false;}if(TC11)TC2p.add('<option  value="'+TC21+'"'+(TC21==(TC0Y.getHours()>12?TC0Y.getHours()-12:(TC0Y.getHours()==0?12:TC0Y.getHours()))?' selected':'')+'>'+TC21+'</option>');}}else{for(TC21=0;TC21<24;TC21++){if(this.TC0F&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)){TC11=(TC21>=this.TC0F.getHours())?true:false;}if(this.TC0D&&TC11&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)){TC11=(TC21<=this.TC0D.getHours())?true:false;}if(TC11)TC2p.add('<option  value="'+TC21+'"'+(TC21==TC0Y.getHours()?' selected':'')+'>'+TC21+'</option>');}}return TC2p.TC2g();}function TCk(TC0Y){var TC2p=new TCM();var TC11=true;TC1a=this.TC0S(TC0Y);for(TC22=0;TC22<60;TC22++){if(this.TC0F&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)&&(TC1a&16384)){TC11=(TC22>=this.TC0F.getMinutes())?true:false;}if(this.TC0D&&TC11&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)&&(TC1a&524288)){TC11=(TC22<=this.TC0D.getMinutes())?true:false;}if(TC11)TC2p.add('<option  value="'+TC22+'"'+(TC22==TC0Y.getMinutes()?' selected':'')+'>'+TC22+'</option>');}return TC2p.TC2g();}function TCm(TC0Y){var TC2p=new TCM();TC1a=this.TC0S(TC0Y);var TC11=true;for(TC24=0;TC24<60;TC24++){if(this.TC0F&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)&&(TC1a&16384)&&(TC1a&32768)){TC11=(TC24>=this.TC0F.getSeconds())?true:false;}if(this.TC0D&&TC11&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)&&(TC1a&524288)&&(TC1a&1048576)){TC11=(TC24<=this.TC0D.getSeconds())?true:false;}if(TC11)TC2p.add('<option  value="'+TC24+'"'+(TC24==TC0Y.getSeconds()?' selected':'')+'>'+TC24+'</option>');}return TC2p.TC2g();}function TCi(TC0Y){var TC2p=new TCM();TC1a=this.TC0S(TC0Y);var TC12=TC15=true;if(this.TC0F&&(TC1a&8192)&&(TC1a&4096)&&(TC1a&4194304)){TC21=this.TC0F.getHours();TC12=TC21>12?false:true;TC15=true}if(this.TC0D&&(TC1a&131072)&&(TC1a&262144)&&(TC1a&8388608)){TC21=this.TC0D.getHours();TC15=TC21>12?true:false;TC12=true;}if(TC12)TC2p.add('<option  value="'+ARR_STRINGS['am_pm'][1]+'"  '+(TC0Y.getHours()<12?' selected':'')+'>'+ARR_STRINGS['am_pm'][1]+'</option>');if(TC15)TC2p.add('<option  value="'+ARR_STRINGS['am_pm'][3]+'" '+(TC0Y.getHours()>=12?' selected':'')+'>'+ARR_STRINGS['am_pm'][3]+'</option>');return TC2p.TC2g();}function TCt(TC2z,TC0_,TC11,TC13){var TC0a=new Date(TC0_),TC06=this.TC06(this.TCL.nocontrols);if(!this.TC1u){var TC23=(TC06&2||!(TC06&16))?this.TC0l.options[this.TC0l.selectedIndex].value:TC0a.getMonth();}if(!this.TC1u){if(TC2z=='year'){if(TC06&2||!(TC06&8)){var TC2u=this.TC0o.options[this.TC0o.selectedIndex].text;var TC2t=this.TC0o.options[this.TC0o.selectedIndex].value;var TC25;if(TC2t&&TC2t!='_'){TC25=(TC2t=='+'?(TC0a.getFullYear()+this.TCK.yearsbefore):(TC0a.getFullYear()-this.TCK.yearsbefore));}else TC25=new Number(TC2u);TC0a.setFullYear(TC25);if(TC23!=TC0a.getMonth()){TC0a.setDate(0);}}}if(TC2z=='mon'){if(TC06&2||!(TC06&16)){TC0a.setMonth(TC23);if(TC23!=TC0a.getMonth()){TC0a.setDate(0);}}}}if(TC2z=='time'){TC21=(TC06&2||!(TC06&32))?this.TC0h.options[this.TC0h.selectedIndex].value:TC0a.getHours();TC22=(TC06&2||!(TC06&64))?this.TC0k.options[this.TC0k.selectedIndex].value:TC0a.getMinutes();if(this.TC1Q==1){if(TC06&2||!(TC06&256)){TC1z=this.TC0d.options[this.TC0d.selectedIndex].value;TC21=TC1z=='pm'?(TC21==12?1*TC21:1*TC21+12):(TC21==12?0:TC21);}TC0a.setHours(TC21);TC0a.setMinutes(TC22);TC0a.setSeconds(0);}else{if(TC06&2||!(TC06&32))TC0a.setHours(TC21);if(TC06&2||!(TC06&64))TC0a.setMinutes(TC22);if(this.TC1Q==2){if(TC06&2||!(TC06&128)){TC24=this.TC0m.options[this.TC0m.selectedIndex].value;TC0a.setSeconds(TC24);}}}}TC0a=new Date(TC0a);TC0a=this.TC32(TC0a);TC0a=this.TC32(TC0a);if(this.TCL.watch==true){if(this.TC0e.value){if((this.TC2j&&!(this.TC0p&2))||this.TC0p&2)this.TC0e.value=this.TC1A(this.TC0J);}}else if(TC2z=='chislo'){if(this.TC0e.value)this.TC0e.value=this.TC1A(this.TC0J);}this.popup(TC0a,TC13,TC2z);if(this.TCL.onclickcontrol&&TC11){if(this.TCL.onclickcontrol[TC11]&&typeof(this.TCL.onclickcontrol[TC11])=='function'){TC2x=this.TCL.onclickcontrol[TC11];TC2x(this.TC1d,new Date(this.TC0J),this.TC0J.valueOf());}}}function TC00(TC0a){var TC0a;if(this.TC1Q!=2){if(this.TC0F)this.TC0F.setSeconds(0);if(this.TC0D)this.TC0D.setSeconds(0);this.TC0J.setSeconds(0);this.TC0M.setSeconds(0);TC0a.setSeconds(0);}if(this.TC0D)this.TC0D.setMilliseconds(0);if(this.TC0F)this.TC0F.setMilliseconds(0);TC0a.setMilliseconds(0);var TC0L=this.TC0S(TC0a);if(this.TC0F){if(this.TC1Q){if((TC0L&1024)){TC0a=new Date(this.TC0F);this.TC0Q('min_date');}}else if(TC0L&256){TC0a=new Date(this.TC0F);this.TC0Q('min_date');}}if(this.TC0D){if(this.TC1Q){if(TC0L&2048){TC0a=new Date(this.TC0D);this.TC0Q('max_date');}}else if(TC0L&512){TC0a=new Date(this.TC0D);this.TC0Q('max_date');}}var TC0L=this.TC0S(TC0a);if(!this.b_allowed){if(!(TC0L&1)){if(TC0L&64){var TC0V=this.TC0R(TC0a),TC0T=TC0a,TC2i=1,TC11=false,TC2G,TC2H;while(!TC11){if(!TC2G){TC1t=new Date(TC0a.valueOf()+new Number(TC2i*864e5));if(this.TC0S(TC1t)&1){TC2G=TC1t;if(TC1t.getMonth()==TC0a.getMonth())break;}}if(!TC2H){TC1t=new Date(TC0a.valueOf()-new Number(TC2i*864e5));if(this.TC0S(TC1t)&1){TC2H=TC1t;if(TC1t.getMonth()==TC0a.getMonth())break;}}if(TC2G||TC2H){TC11=true;}TC2i++;}TC0a=new Date(TC1t);}}}if(this.b_allowed){var TC0V=this.TC0R(TC0a),TC1V=TC1X=TC0W=TC0X=0,TC19='allowed';this.TC2L(TC0a,TC19);if(this.TC2K[1]==2){if(!(TC0L&129)){var TC1V=0,TC1X=0,TC0W=0,TC0X=0;for(i=0;i<this.a_allowed_date_sort.length;i++){if(TC0V.valueOf()<this.a_allowed_date_sort[i])TC1V=this.a_allowed_date_sort[i];if(TC0V.valueOf()>this.a_allowed_date_sort[i])TC1X=this.a_allowed_date_sort[i];if(TC1V)break;}if(TC1V)TC0W=TC1V-TC0V.valueOf();if(TC1X)TC0X=TC0V.valueOf()-TC1X;TC0Z=TC0W==TC0X?TC1V:(TC0W==0?TC1X:(TC0X==0?TC1V:(TC0W<TC0X?TC1V:TC1X)));TC0a=TC0V=new Date(TC0Z);}}else{if(this.TC2K[1]&4){if(!(this.TC2K[2]&4)){var TC1V=0,TC1X=0,TC0W=0,TC0X=0;var TC3A=1*TC0V.getFullYear();for(i=0;i<this.a_allowed_year_sort.length;i++){if(TC3A<this.a_allowed_year_sort[i])TC1V=this.a_allowed_year_sort[i];if(TC3A>this.a_allowed_year_sort[i])TC1X=this.a_allowed_year_sort[i];if(TC1V)break;}if(TC1V)TC0W=TC1V-TC3A;if(TC1X)TC0X=TC3A-TC1X;TC0Z=TC0W==TC0X?TC1V:(TC0W==0?TC1X:(TC0X==0?TC1V:(TC0W<TC0X?TC1V:TC1X)));TC0a.setFullYear(TC0Z);this.TC2L(TC0a,TC19);}}if(this.TC2K[1]&8){if(!(this.TC2K[2]&8)){var TC1V=0,TC1X=0,TC0W=0,TC0X=0;var TC3A=1*TC0V.getMonth()+1;for(i=0;i<this.a_allowed_month_sort.length;i++){if(TC3A<this.a_allowed_month_sort[i])TC1V=this.a_allowed_month_sort[i];if(TC3A>this.a_allowed_month_sort[i])TC1X=this.a_allowed_month_sort[i];if(TC1V)break;}if(TC1V)TC0W=TC1V-TC3A;if(TC1X)TC0X=TC3A-TC1X;TC0Z=TC0W==TC0X?TC1V:(TC0W==0?TC1X:(TC0X==0?TC1V:(TC0W<TC0X?TC1V:TC1X)));TC0a.setMonth(TC0Z-1);this.TC2L(TC0a,TC19);}}if(this.TC2K[1]&16){if(!(this.TC2K[2]&16)){var TC1V=0,TC1X=0,TC0W=0,TC0X=0;var TC3A=1*TC0a.getDay()+1;for(i=0;i<this.a_allowed_weekday_sort.length;i++){if(TC3A<this.a_allowed_weekday_sort[i])TC1V=this.a_allowed_weekday_sort[i];if(TC3A>this.a_allowed_weekday_sort[i])TC1X=this.a_allowed_weekday_sort[i];if(TC1V)break;}if(TC1V)TC0W=TC1V-TC3A;if(TC1X)TC0X=TC3A-TC1X;TC0Z=TC0W==TC0X?TC1V:(TC0W==0?TC1X:(TC0X==0?TC1V:(TC0W<TC0X?TC1V:TC1X)));var TC0K=TC0Z-TC3A;var TC1_=this.TC03(TC0K,TC0a);TC0a=new Date(TC1_);}}}TC0L=this.TC0S(TC0a);if((TC0L&1024)||(TC0L&256)||(TC0L&2048)||(TC0L&512)){TC0a=null;this.TC0Q('combaerror');}}return(TC0a);}function TCr(){var TC2p=new TCM();var TC0B=new Date(this.TC0J);TC0B.setDate(1);TC0B.setDate(1-(7+TC0B.getDay()-this.TCK.weekstart)%7);TC2p.add('<table border="1" bordercolor="#177EB0" cellspacing="1" cellpadding="2"'+this.TC1C('gridtable')+'><tr>');for(var TC1p=0;TC1p<7;TC1p++){TC2p.add('<td'+this.TC1C('wdaytitle')+'>'+this.TCK.weekdays[(this.TCK.weekstart+TC1p)%7]+'</td>');}TC2p.add('</tr>');var TC08=this.TC0R(new Date(TC0B),true);while(TC08.getMonth()==this.TC0J.getMonth()||TC08.getMonth()==TC0B.getMonth()){TC2p.add('<tr>');for(var TC1Z=0;TC1Z<7;TC1Z++){TC2p.add(this.TC0P(TC08));TC08.setDate(TC08.getDate()+1);}TC2p.add('</tr>\n');}TC2p.add('</table>');return TC2p.TC2g();}function TCd(TC09){var TC0T=new Date(TC09);var TC1a=this.TC0S(TC0T),TC2Z;if(!(TC1a&1))TC2Z='dayforbidden';else if(TC1a&16)TC2Z='dayothermonth';else TC2Z='daynormal';TC2I=(TC1a&16&&!(TC06&2||!(TC06&512)))?'':'<a id="vinculo" name="vinculo" href="javascript: TC28.TC2A('+TC09.valueOf()+');" '+this.TC1C(TC2Z)+'>'+TC09.getDate()+'</a>';var TC2b=(TC1a&1?TC2I:(!(TC1a&1)&&TC1a&16&&TC06&512)?'':('<span '+this.TC1C(TC2Z)+'>'+TC09.getDate()+'</span>'));if(TC1a&2&&!(TC06&512&&TC1a&16))TC2b='<div'+this.TC1C('daytodaycell')+'>'+TC2b+'</div>';if(TC1a&4&&(TC1a&1))TC2Z='dayselectedcell';else if(TC1a&32)TC2Z='daymarkedcell';else if(TC1a&8)TC2Z='dayweekendcell';else TC2Z='daynormalcell';if(this.TCX){if(TC1a&32)TC2Z='daymarkedcell';else if(TC1a&8)TC2Z='dayweekendcell';else TC2Z='daynormalcell';}return'<td'+this.TC1C(TC2Z)+'>'+TC2b+'</td>';}function TCv(TC09,TC2c){var TC1m=0,TC1f=0,TCE='a_'+TC2c,TCT='b_'+TC2c,code=false;var TC0J=new Date(TC09);var TC3B=String(TC09.getFullYear());var TC1S=(ARR_STRINGS['short_month'][TC0J.getMonth()]).toLowerCase();var TC34=(ARR_STRINGS['short_days'][TC0J.getDay()]).toLowerCase();if(this[TCT+'_date']){TC1f|=2;if(this[TCE+'_date'][TC0J.valueOf()])TC1m|=2;}else{if(this[TCT+'_year']){TC1f|=4;if(this[TCE+'_year'][TC3B]){TC1m|=4;}}if(this[TCT+'_month']){TC1f|=8;if(this[TCE+'_month'][TC1S]){TC1m|=8;}}if(this[TCT+'_weekday']){TC1f|=16;if(this[TCE+'_weekday'][TC34]){TC1m|=16;}}}if(TC2c=='onclickday'&&!this[TCT+'_date']&&!(TC1f&4)&&!(TC1f&8)&&!(TC1f&16)){code=true;}else if(TC1f==TC1m)code=true;this.TC2K=[code,TC1f,TC1m];return(this.TC2K);}function TCg(TC09){var TC1m=1;TC0T=TC0V=new Date(TC09);var TC0T=this.TC0R(TC0T);var TC0M=new Date(this.TC0M);var TC0J=new Date(this.TC0J);if(this.b_allowed)TC1m=0;if(this.TC0R(TC0M).valueOf()==TC0T.valueOf())TC1m|=2;if(this.TC0R(TC0J).valueOf()==TC0T.valueOf())TC1m|=4;if(TC0T.getDay()==0||TC0T.getDay()==6)TC1m|=8;if(TC0T.getMonth()!=this.TC0J.getMonth()||TC0T.getFullYear()!=this.TC0J.getFullYear())TC1m|=16;if(this.a_marked){TC3=this.TC2L(TC0T,'marked');if(TC3[0])TC1m|=32;}if(this.a_onclickday){TC3=this.TC2L(TC0T,'onclickday');if(TC3[0]){TC1m|=33554432;}}if(this.a_forbidden){TC3=this.TC2L(TC0T,'forbidden');if(TC3[0]){TC1m|=64;TC1m&=~1;}}if(this.a_allowed){TC3=this.TC2L(TC0T,'allowed');if(TC3[0])TC1m|=129;}if(this.TC0F){if(TC0T.valueOf()<this.TC0R(this.TC0F).valueOf()){TC1m|=256;TC1m&=~1;}if(TC09.valueOf()<this.TC0F.valueOf())TC1m|=1024;if(TC09.getMonth()==this.TC0F.getMonth())TC1m|=4096;if(TC09.getFullYear()==this.TC0F.getFullYear())TC1m|=8192;if(TC09.getHours()==this.TC0F.getHours())TC1m|=16384;if(TC09.getMinutes()==this.TC0F.getMinutes())TC1m|=32768;if(TC09.getSeconds()==this.TC0F.getSeconds())TC1m|=65536;if(TC09.getDate()==this.TC0F.getDate())TC1m|=4194304;}if(this.TC0D){if(TC0T.valueOf()>this.TC0R(this.TC0D).valueOf()){TC1m|=512;TC1m&=~1;}if(TC09.valueOf()>this.TC0D.valueOf())TC1m|=2048;if(TC09.getMonth()==this.TC0D.getMonth())TC1m|=131072;if(TC09.getFullYear()==this.TC0D.getFullYear())TC1m|=262144;if(TC09.getHours()==this.TC0D.getHours())TC1m|=524288;if(TC09.getMinutes()==this.TC0D.getMinutes())TC1m|=1048576;if(TC09.getSeconds()==this.TC0D.getSeconds())TC1m|=2097152;if(TC09.getDate()==this.TC0D.getDate())TC1m|=8388608;}return TC1m;}function TCe(TC1a,TC11){switch(TC1a){case'max_date':if(!(this.TC2o&8)){TC1W=ARR_STRINGS['max_date'].replace(/%max_date/g,this.TC1A(this.TC0D));alert(TC1W);}break;case'min_date':if(!(this.TC2o&4)){TC1W=ARR_STRINGS['min_date'].replace(/%min_date/g,this.TC1A(this.TC0F));alert(TC1W);}break;case'need_form_name':TC1W=ARR_STRINGS['need_form_name'];this.flag_error=true;alert(TC1W);break;case'form_not_found':TC1W=ARR_STRINGS['form_not_found'].replace(/%form_name/g,TC11);this.flag_error=true;alert(TC1W);break;case'not_format':TC1W=ARR_STRINGS['not_format'];this.flag_error=true;alert(TC1W);break;case'combaerror':TC1W=ARR_STRINGS['combaerror'];this.flag_error=true;alert(TC1W);break;default:TC1W='ERROR!!!';alert(TC1W);break;}}function TCu(TC1_){var TC11=true;if(this.TCX)this.TCX=false;this.TC1s('chislo',TC1_,null,true);if(this.b_onclickday){var TC0T=new Date(TC1_),TC1a=this.TC0S(TC0T);if(TC1a&33554432){if(this.b_onclickday_date){TC2x=this.a_onclickday_date[this.TC0R(TC0T).valueOf()+''];if(TC2x){TC2x(this.TC1d,new Date(TC1_),TC1_);}}else{if(this.TCL.onclickday['func']&&typeof(this.TCL.onclickday['func'])=='function'){TC2x=this.TCL.onclickday['func'];TC2x(this.TC1d,new Date(TC1_),TC1_);}}}}}function TCp(TC7){var TC2e=[],TC27=this.TCK[TC7];for(var TC2c in TC27)TC2e[TC2e.length]=' '+TC2c+'="'+TC27[TC2c]+'"';return TC2e.join('');}function TCy(TC0A,TC1l,TC1r,TC1c,TC1j,TC1n,TC0u){var TC0I=new Date(TC0A);if(TC1r)TC0I.setFullYear(TC0I.getFullYear()+TC1r);if(TC1l){TC0I.setMonth(TC0I.getMonth()+TC1l);}if(TC1c){TC0I.setHours(TC0I.getHours()+TC1c);}if(TC1j){TC0I.setMinutes(TC0I.getMinutes()+TC1j);}if(TC1n){TC0I.setSeconds(TC0I.getSeconds()+TC1n);}if(!(TC1c||TC1j||TC1n)){if(TC0I.getDate()!=TC0A.getDate()){TC0I.setDate(0);}}return TC0I.valueOf();}function TCf(TC0A,TC11){var TC0U=new Date();if(TC0A)TC0U=new Date(TC0A);if(!TC11){TC0U.setHours(0);TC0U.setMinutes(0);TC0U.setSeconds(0);}TC0U.setMilliseconds(0);return TC0U;}function TCs(TCF,TC2c){var TC2d='a_'+TC2c;var TC8=TCF[TC2c];var TCN=0,TC_=1,TCZ=false;if(!TC8)return;this[TC2d]={};this['b_'+TC2c]=true;if(typeof(TC8)=='object'){for(var TCD in TC8){this[TC2d+'_'+TCD]={};var TC2m=TC2d+'_'+TCD+'_sort';this[TC2m]=[];TCQ=TC8[TCD];if(!TCQ)return;if(typeof(TCQ)!='object')TCQ=[TCQ];this['b_'+TC2c+'_'+TCD]=true;TC2P=TCD=='year'?'Y':TCD=='month'?'M':TCD=='weekday'?'D':TCD=='date'?'dt':false;if(TC2P){for(var TCS in TCQ){if(TC2P=='dt'){if(TC2c=='onclickday'){var TCV=this.TC2J(TCS);var TCW=String(this.TC0R(TCV).valueOf());if(typeof(TCQ[TCS])=='function'){TC_=TCQ[TCS];TCZ=true;}else TCZ=false;}else{var TCV=this.TC2J(TCQ[TCS]);TCZ=TCV;var TCW=String(this.TC0R(TCV).valueOf());var TC2l=this.TC0R(TCV).valueOf();}}else{TC2Q=new RegExp("^"+TCJ[TC2P]+"$");var TCV=TCQ[TCS];var TCW=(String(TCV)).toLowerCase();TCZ=TC2Q.exec(TCV);var TC2l=TCW;if(TC2P=='Y'){TC2l=1*TCW;}if(TC2P=='M'){TC1i=TC6[TC2P][2](TCW);TC2l=1+TC1i;}if(TC2P=='D'){for(i=0;i<7;i++){if(ARR_STRINGS['short_days'][i].toLowerCase()==TCW.toLowerCase())break;}TC2l=1+i;}}if(TCQ[TCS]){if(TCZ){this[TC2d+'_'+TCD][TCW]=TC_;if(TC2c=='allowed'){TCN=this[TC2m].length;this[TC2m][TCN]=TC2l;}}}}}if(TC2c=='allowed'){this.TC2k(0,this[TC2m].length,TC2m);}}}}function TCz(l,h,TC2m){if(!this[TC2m].length)return true;var x=this[TC2m][(h+l)>>1],i=l,j=h,t=[];do{while(i<=h&&(this[TC2m][i]<x))i++;while(j>=l&&(x<this[TC2m][j]))j--;if(i<=j){t=this[TC2m][i];this[TC2m][i]=this[TC2m][j];this[TC2m][j]=t;i++;j--}}while(i<j);if(l<j)this.TC2k(l,j,TC2m);if(i<h)this.TC2k(i,h,TC2m);}function TC0(){var b=navigator.appName;var v=this.version=navigator.appVersion;var TC2T=/opera/;var TC2U=/opera.5/;var TC2V=/opera.6/;var TC30=this.TC31=navigator.userAgent.toLowerCase();this.v=parseInt(v);this.TC1Y=false;this.TC1v=(b=="Netscape");this.TC1K=(b=="Microsoft Internet Explorer");this.TC2B=TC2T.exec(TC30)?true:false;if(this.TC2B){this.TC2C=TC2U.exec(TC30)?true:false;this.TC2D=TC2V.exec(TC30)?true:false;this.TC2E=TC30.indexOf("7")>0?true:false;this.TC1K=false;}if(TC30.indexOf("netscape")<0&&TC30.indexOf("msie")<0&&TC30.indexOf("opera")<0&&this.v>=5){this.TC1Y=true;this.TC1v=false;}if(this.TC1v){if(TC30.indexOf('netscape/7.1')>0)this.TC1y=true;else{this.v=parseInt(v);this.TC1w=(this.v==4);this.TC1x=(this.v>=5);this.TC1y=false;}}else if(this.TC1K){this.TC1L=this.TC1M=this.TC1N=this.TC1O=false;if(v.indexOf('MSIE 4')>0){this.TC1L=true;this.v=4;}else if(v.indexOf('MSIE 5')>0){this.TC1M=true;this.v=5;}else if(v.indexOf('MSIE 5.5')>0){this.TC1N=true;this.v=5.5;}else if(v.indexOf('MSIE 6')>0){this.TC1O=true;this.v=6;}}else if(this.TC2B||this.TC1Y){this.v=parseInt(v);}this.TC35=TC30.indexOf("win")>-1;this.TC1T=TC30.indexOf("mac")>-1;this.TC2F=(!this.TC35&&!this.TC1T);}function TC1U(TC9){var TC0Z=this.TC0R(),i,TC14=false;TC0Z.setMonth(0);for(i in TC9){if(TC2f.indexOf(TC9[i][1])!=-1){var TC1R=TC9[i][1];if(TC1R=='U')return new Date(TC9[i][0]*1000);if(TC1R=='h')var value=TC6[TC9[i][1]][2](TC9[i][0],TC9[TC1H][0]);else var value=TC6[TC9[i][1]][2](TC9[i][0]);if(TC1R=='d'){TC14=true;TC33=value;}if(typeof(TC0Z[TC6[TC1R][0]])=='function'){TC0Z[TC6[TC1R][0]](value);if((TC1R=='m'||TC1R=='M'||TC1R=='F')&&TC14){TC0Z[TC6['d'][0]](TC33);}}}}return TC0Z}function TC1B(TC1I,TC16){var TC04,TC1=0,TCG=[],i=0,TC2Y='',TC2y='';var TC0Z=new Date(TC1I);var TC0r=!TC16?this.TC0r:this.TC2v;do{TC04=TC0r.substr(i,1);if(TC2a.indexOf(TC04)!=-1&&TC04!=''){if(TC04=='A'||TC04=='a')TC2y=new String(TC6[TC04][1](TC1H));else if(TC04=='U')return TC1I;else if(typeof(TC0Z[TC6[TC04][1]])!='function')TC2y=new String(TC6[TC04][1](TC0Z));else TC2y=new String(TC0Z[TC6[TC04][1]]());if(TC04=='h')TC1H=TC0Z.getHours();TC2Y+=TC2y}else TC2Y+=TC04;i++}while(i<TC0r.length)return TC2Y}function TC2h(TC2q,TC11){var TCH=[],i,TC1=1,a=this.TC2Q.exec(TC2q);if(!a||typeof(a)!='object'){if(this.TCL.noselected&&this.TC2n!=this.TC0e.value){this.TCX=true;}if(!TC11){alert(ARR_STRINGS['not_meet']);}return this.TC0J;}for(i in this.TCB){if(this.TCB[i]=='A'||this.TCB[i]=='a')TC1H=i;TCH[i]=[a[TC1++],this.TCB[i]]}TC1H=TCH.length-1-TC1H;TC2x=this.TC1U(TCH.reverse());return TC2x;}function TCq(TC2s){if(document.images&&document.images[TC2s])return document.images[TC2s];else if(this.formname&&document.forms[this.formname].elements[TC2s])return document.forms[this.formname].elements[TC2s];else if(document.all&&document.all[TC2s])return document.all[TC2s];else if(document.getElementById)return document.getElementById(TC2s);else return null;}function TCM(){this.TCO=[];this.add=function(){var n=arguments.length;for(var i=0;i<n;i++)this.TCO[this.TCO.length]=arguments[i];};this.TC2g=function(){return this.TCO.join('');};}




//Lee un fichero XML devolviendo un array con el valor
//de los nodos con el nombre NodosARecuperar
function loadXML(Fichero,NodosARecuperar)
{
//Xml document
var xmlDoc;

//load xml file
// code for IE
if (window.ActiveXObject)
{
	xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
	xmlDoc.async=false;
	xmlDoc.load(Fichero);
	return getmessage(xmlDoc,NodosARecuperar);
}
// code for Mozilla, etc.
else if (document.implementation &&
document.implementation.createDocument)
{
	xmlDoc= document.implementation.createDocument("","",null);
	xmlDoc.async=false;
	xmlDoc.load(Fichero);
	return getmessage(xmlDoc,NodosARecuperar);
}
else
{
	alert('Your browser cannot handle this script');
}
}


// JavaScript Document
//Lee los nodos especificados en NodosARecuperar del fichero xmlDoc
// y devuelve un array con el resultado
function getmessage(xmlDoc,NodosARecuperar)
{
	var i, n_elems, itemNodes;
	var arrayResultados = new Array;
	
	//Recuperamos los nodos con los dias festivos
	itemNodes = xmlDoc.getElementsByTagName(NodosARecuperar);
	
	if (itemNodes != null)
		//Contamos los nodos
		n_elems = itemNodes.length;
	
	//Almacenamos las fechas 
	for (i = 0; i < n_elems; i++) 
	{
		arrayResultados.push(itemNodes[i].firstChild.nodeValue);
	}
	return arrayResultados;
}
