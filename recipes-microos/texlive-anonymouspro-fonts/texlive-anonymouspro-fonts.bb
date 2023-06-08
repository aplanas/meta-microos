SUMMARY = "Severed fonts for texlive-anonymouspro"
DESCRIPTION = "The  separated fonts package for texlive-anonymouspro"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn51631"

RPM_NAME = "texlive-anonymouspro-fonts-2023.201.2.2svn51631-54.1.noarch.rpm"
RPM_HASH = "35e7828a7ebaa4ce83f09b9a0533127f6668ce2837cd422c6e17632121341f3b7ca857a7565a97637a919bebc20d4eeaa8c988b00f413057eaa6852c9abaa245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-anonymouspro-fonts) font(:lang=aa) font(:lang=af) font(:lang=an) font(:lang=av) font(:lang=ay) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ce) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=ga) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=kl) font(:lang=ku-tr) font(:lang=kum) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mo) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sc) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uk) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(anonymouspro) texlive-anonymouspro-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
