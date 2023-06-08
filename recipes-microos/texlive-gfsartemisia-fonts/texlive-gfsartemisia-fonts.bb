SUMMARY = "Severed fonts for texlive-gfsartemisia"
DESCRIPTION = "The  separated fonts package for texlive-gfsartemisia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19469"

RPM_NAME = "texlive-gfsartemisia-fonts-2023.201.1.0svn19469-52.1.noarch.rpm"
RPM_HASH = "838f229354dd5bf8f5bdf729353dda235f0376067b27b4208c0e9456f9caa4968e9f080752f0a45d2b831ac5d4c9e62cc9ba706510e590b19ecb696fb38469be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-gfsartemisia-fonts) font(:lang=aa) font(:lang=af) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=bin) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ig) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=ku-tr) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lg) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=rw) font(:lang=sc) font(:lang=se) font(:lang=sg) font(:lang=shs) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(gfsartemisia) font(gfsdidot) texlive-gfsartemisia-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
