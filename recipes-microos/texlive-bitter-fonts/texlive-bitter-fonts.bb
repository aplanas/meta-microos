SUMMARY = "Severed fonts for texlive-bitter"
DESCRIPTION = "The  separated fonts package for texlive-bitter"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64541"

RPM_NAME = "texlive-bitter-fonts-2023.201.svn64541-52.1.noarch.rpm"
RPM_HASH = "d10cb24ad61b0a789d9174b84d71c880b96ca3b1740e9211e60587a0a8be284807ef9adf3206849f39dd4223d7b0c213ad3d3b197ae408fc69d3133c921690c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-bitter-fonts) font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=ca) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=csb) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hsb) font(:lang=ht) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=ku-tr) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=li) font(:lang=lt) font(:lang=mg) font(:lang=mh) font(:lang=ms) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(bitter) font(bttr) texlive-bitter-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
