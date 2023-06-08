SUMMARY = "Severed fonts for texlive-cm-super"
DESCRIPTION = "The  separated fonts package for texlive-cm-super"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-cm-super-fonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "ffec367e85250a6628d7a9aee97bf664de20b5f53ea20f8d4df28384c866523da93eae5bcf4fb16ff1855b94e390682baeb28787cb8b6648a88090dffe55c9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) font(:lang=ab) font(:lang=an) font(:lang=av) font(:lang=ay) font(:lang=ba) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=br) font(:lang=bua) font(:lang=ce) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kaa) font(:lang=kj) font(:lang=kk) font(:lang=ku-tr) font(:lang=kum) font(:lang=kwm) font(:lang=ky) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=mg) font(:lang=mn-mn) font(:lang=ms) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ru) font(:lang=rw) font(:lang=sah) font(:lang=sc) font(:lang=sel) font(:lang=sg) font(:lang=sk) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=tt) font(:lang=tyv) font(:lang=uk) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(computermodern) font(computermodernbright) font(computermodernconcrete) texlive-cm-super-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
