SUMMARY = "Severed fonts for texlive-avantgar"
DESCRIPTION = "The  separated fonts package for texlive-avantgar"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61983"

RPM_NAME = "texlive-avantgar-fonts-2023.201.svn61983-53.1.noarch.rpm"
RPM_HASH = "9c8073e0e772e1a7a6bbd59c0b35053a4eedbebe740bf0cfd01eaec01a640f58c8bd83f551d2086fd62faa9ba63d4a808750bf522b6869147e15caaf17d5b5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kj) font(:lang=ku-tr) font(:lang=kwm) font(:lang=lb) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=ms) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(urwgothicl) texlive-avantgar-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
