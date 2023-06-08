SUMMARY = "Severed fonts for texlive-accanthis"
DESCRIPTION = "The  separated fonts package for texlive-accanthis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64844"

RPM_NAME = "texlive-accanthis-fonts-2023.201.svn64844-54.1.noarch.rpm"
RPM_HASH = "a6081e26a81e515f0894eac55cd167bd9a578375e572c8f9e398c177b210ee3761fd01fa29e2f5017e26130cb102816d4a625d9312ef51a1f9be729ebbbaa9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-accanthis-fonts) font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=ch) font(:lang=co) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=ht) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kj) font(:lang=kwm) font(:lang=lb) font(:lang=li) font(:lang=mg) font(:lang=ms) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tl) font(:lang=tn) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(accanthisadfstdno3) texlive-accanthis-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
