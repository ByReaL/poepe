$wnd.showcase.runAsyncCallback18("function Eeb(){}\nfunction $pc(a,b){jy(a.a,b)}\nfunction bYb(a,b){this.b=a;this.a=b}\nfunction dYb(a,b){this.b=a;this.a=b}\nfunction _eb(a){return AEb(Meb,a)}\nfunction Deb(){Deb=MCb;Ceb=new Eeb}\nfunction XXb(a,b){cjc(b,'Selected: '+a.Zg()+', '+a.$g())}\nfunction lqc(){gqc();kqc.call(this,yp($doc,'password'),'gwt-PasswordTextBox')}\nfunction Xxc(b){try{var c=b.document.selection.createRange();if(c.parentElement()!==b)return 0;return c.text.length}catch(a){return 0}}\nfunction Wxc(b){try{var c=b.document.selection.createRange();if(c.parentElement()!==b)return -1;return -c.move(kVc,-65535)}catch(a){return 0}}\nfunction VXb(a,b){var c,d;c=new Zmc;qp(c.e,tTc,4);Wmc(c,a);if(b){d=new gjc('Selected: 0, 0');Fh(a,new bYb(a,d),(pv(),pv(),ov));Fh(a,new dYb(a,d),(Uu(),Uu(),Tu));Wmc(c,d)}return c}\nfunction Zxc(b){try{var c=b.document.selection.createRange();if(c.parentElement()!==b)return 0;var d=c.text.length;var e=0;var f=c.duplicate();f.moveEnd(kVc,-1);var g=f.text.length;while(g==d&&f.parentElement()==b&&c.compareEndPoints('StartToEnd',f)<=0){e+=2;f.moveEnd(kVc,-1);g=f.text.length}return d+e}catch(a){return 0}}\nfunction Yxc(b){try{var c=b.document.selection.createRange();if(c.parentElement()!==b)return -1;var d=c.duplicate();d.moveToElementText(b);d.setEndPoint('EndToStart',c);var e=d.text.length;var f=0;var g=d.duplicate();g.moveEnd(kVc,-1);var h=g.text.length;while(h==e&&g.parentElement()==b){f+=2;g.moveEnd(kVc,-1);h=g.text.length}return e+f}catch(a){return 0}}\nfunction WXb(){var a,b,c,d,e,f;f=new Owc;qp(f.e,tTc,5);d=new jqc;xwc(d.hb,'','cwBasicText-textbox');$pc(d,(Deb(),Deb(),Ceb));b=new jqc;xwc(b.hb,'','cwBasicText-textbox-disabled');rp(b.hb,xUc,'read only');iy(b.a);pp(b.hb,_Rc,true);Lwc(f,new ljc('<b>Normal text box:<\\/b>'));Lwc(f,VXb(d,true));Lwc(f,VXb(b,false));c=new lqc;xwc(c.hb,'','cwBasicText-password');a=new lqc;xwc(a.hb,'','cwBasicText-password-disabled');rp(a.hb,xUc,'read only');iy(a.a);pp(a.hb,_Rc,true);Lwc(f,new ljc('<br><br><b>Password text box:<\\/b>'));Lwc(f,VXb(c,true));Lwc(f,VXb(a,false));e=new Ruc;xwc(e.hb,'','cwBasicText-textarea');e.hb.rows=5;Lwc(f,new ljc('<br><br><b>Text area:<\\/b>'));Lwc(f,VXb(e,true));return f}\nvar kVc='character';LCb(888,1236,{},Eeb);_.re=function Feb(a){return _eb((Veb(),a))?(IC(),HC):(IC(),GC)};var Ceb;var Gnb=sDc(dQc,'AnyRtlDirectionEstimator',888);LCb(453,1,QRc);_.xc=function aYb(){cGb(this.a,WXb())};LCb(454,1,jVc,bYb);_.Qc=function cYb(a){XXb(this.b,this.a)};var mtb=sDc(YRc,'CwBasicText/2',454);LCb(455,1,HRc,dYb);_.Oc=function eYb(a){XXb(this.b,this.a)};var ntb=sDc(YRc,'CwBasicText/3',455);LCb(766,273,hPc);_.Zg=function bqc(){return Wxc(this.hb)};_.$g=function cqc(){return Xxc(this.hb)};LCb(340,48,hPc,lqc);var iyb=sDc(fPc,'PasswordTextBox',340);LCb(239,326,hPc);_.Zg=function Suc(){return Yxc(this.hb)};_.$g=function Tuc(){return Zxc(this.hb)};sOc(Cl)(18);\n//# sourceURL=showcase-18.js\n")
