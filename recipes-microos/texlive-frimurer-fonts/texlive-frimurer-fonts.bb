SUMMARY = "Severed fonts for texlive-frimurer"
DESCRIPTION = "The  separated fonts package for texlive-frimurer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn56704"

RPM_NAME = "texlive-frimurer-fonts-2023.201.1svn56704-52.1.noarch.rpm"
RPM_HASH = "fd05025f2bb5b4cf7a2c8a87648d6e2573b0af410f73c21a0abe137b7815e6ea08ca9c3a457492ff2693e75a1af14d0f931416af7fc8664f64dc0856a9cf08cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=csb) font(:lang=da) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kj) font(:lang=ku-tr) font(:lang=kwm) font(:lang=li) font(:lang=mg) font(:lang=ms) font(:lang=nb) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(frimurer) texlive-frimurer-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
