SUMMARY = "Severed fonts for texlive-nunito"
DESCRIPTION = "The  separated fonts package for texlive-nunito"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57429"

RPM_NAME = "texlive-nunito-fonts-2023.201.0.0.0.1svn57429-54.1.noarch.rpm"
RPM_HASH = "a383fb8e99a873c8729075c6c791e8541496249a6f1228dd188e4387f75530eabe2cc1235255bbd2f90238bc322eb2caf0f68b4fd0a60841dac9611875681d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-nunito-fonts) font(:lang=aa) font(:lang=af) font(:lang=an) font(:lang=ast) font(:lang=av) font(:lang=ay) font(:lang=az-az) font(:lang=ba) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=bin) font(:lang=br) font(:lang=bs) font(:lang=bua) font(:lang=ca) font(:lang=ce) font(:lang=ch) font(:lang=chm) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cv) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=haw) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ig) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kaa) font(:lang=ki) font(:lang=kj) font(:lang=kk) font(:lang=kl) font(:lang=ku-am) font(:lang=ku-tr) font(:lang=kum) font(:lang=kv) font(:lang=kw) font(:lang=kwm) font(:lang=ky) font(:lang=la) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mk) font(:lang=mn-mn) font(:lang=mo) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=nv) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=qu) font(:lang=quz) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sah) font(:lang=sc) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=sh) font(:lang=sk) font(:lang=sl) font(:lang=sm) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tg) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=to) font(:lang=tr) font(:lang=ts) font(:lang=tt) font(:lang=ty) font(:lang=tyv) font(:lang=uk) font(:lang=uz) font(:lang=vi) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(nunito) font(nunitoblack) font(nunitoextrabold) font(nunitoextralight) font(nunitolight) font(nunitosemibold) texlive-nunito-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
