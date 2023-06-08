SUMMARY = "Severed fonts for texlive-cyklop"
DESCRIPTION = "The  separated fonts package for texlive-cyklop"
LICENSE = "LPPL-1.3c"

PV = "2023.204.0.0.915svn18651"

RPM_NAME = "texlive-cyklop-fonts-2023.204.0.0.915svn18651-54.1.noarch.rpm"
RPM_HASH = "014cd676896518aeec07fae37363cf9468b294ba30d7df61518d5a2efd307cbbb9d5cc9fab7a40b505f62d63a555c31ab5e48137f005223ccdc6dcfc3a01adb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-cyklop-fonts) font(:lang=aa) font(:lang=an) font(:lang=ast) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ig) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=ku-tr) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lg) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(cyklop) font(cyklop-italic) font(cyklop-regular) texlive-cyklop-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
