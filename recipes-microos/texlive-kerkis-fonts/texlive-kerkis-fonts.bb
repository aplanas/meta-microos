SUMMARY = "Severed fonts for texlive-kerkis"
DESCRIPTION = "The  separated fonts package for texlive-kerkis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn56271"

RPM_NAME = "texlive-kerkis-fonts-2023.201.1.11svn56271-55.1.noarch.rpm"
RPM_HASH = "11b67e423e32ae9cb8849f8b0e693bc80f478f50c9b281807e8a619496b86d75e49373bd3dd010b1777fb4bf47665db51ac6ebcb1e7e9962b857a3191435c246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-kerkis-fonts) font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=ku-tr) font(:lang=kw) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=ms) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(kerkis) font(kerkis-calligraphic) font(kerkis-semibold) font(kerkissans) font(ktsy) texlive-kerkis-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
