SUMMARY = "Severed fonts for texlive-lobster2"
DESCRIPTION = "The  separated fonts package for texlive-lobster2"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64442"

RPM_NAME = "texlive-lobster2-fonts-2023.201.svn64442-54.1.noarch.rpm"
RPM_HASH = "ed76a4b719ba772535ca23fbbfab6014a7dee0d024e0b9aba6daab64dc580d6d8f22dcc98448f8c36e81cd05c5f0af1963d77c41d9552b71317c1041ec543e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-lobster2-fonts) font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=ch) font(:lang=co) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kj) font(:lang=kwm) font(:lang=lb) font(:lang=li) font(:lang=mg) font(:lang=ms) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tl) font(:lang=tn) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(lbstr) font(lobstertwo) texlive-lobster2-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
