SUMMARY = "Severed fonts for texlive-paratype"
DESCRIPTION = "The  separated fonts package for texlive-paratype"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32859"

RPM_NAME = "texlive-paratype-fonts-2023.201.svn32859-51.1.noarch.rpm"
RPM_HASH = "5ce001d2a3a6211f91b9ab837a72a3cc5a3c338fb535145ac5d35353e8b312bc67d86722c0218fafe68193803de21c19794a394d80aaa692faf4d459489811c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-paratype-fonts) font(:lang=aa) font(:lang=ab) font(:lang=an) font(:lang=av) font(:lang=ay) font(:lang=ba) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=bua) font(:lang=ce) font(:lang=ch) font(:lang=chm) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cv) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kaa) font(:lang=kj) font(:lang=kk) font(:lang=ku-tr) font(:lang=kum) font(:lang=kv) font(:lang=kwm) font(:lang=ky) font(:lang=lb) font(:lang=lez) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mn-mn) font(:lang=mo) font(:lang=ms) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sah) font(:lang=sc) font(:lang=sel) font(:lang=sg) font(:lang=sh) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tg) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=tt) font(:lang=ty) font(:lang=tyv) font(:lang=uk) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(ptmono) font(ptsans) font(ptsanscaption) font(ptsansnarrow) font(ptserif) font(ptserifcaption) texlive-paratype-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
