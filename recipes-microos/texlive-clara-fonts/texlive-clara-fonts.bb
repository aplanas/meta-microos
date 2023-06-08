SUMMARY = "Severed fonts for texlive-clara"
DESCRIPTION = "The  separated fonts package for texlive-clara"
LICENSE = "OFL-1.1"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-clara-fonts-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "12447d86d6cf34775a68467eac2b18846fc80627ba6f79e78448dc439c71e3f4d6a41605ca24c4b77c0959dc80a4e2eb0018765ac9ab77636589e384cfbf4f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-clara-fonts) font(:lang=aa) font(:lang=ak) font(:lang=an) font(:lang=ast) font(:lang=av) font(:lang=ay) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ce) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fat) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=ha) font(:lang=haw) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=ku-tr) font(:lang=kum) font(:lang=kw) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=ln) font(:lang=lt) font(:lang=mg) font(:lang=mo) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=nv) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=qu) font(:lang=quz) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sc) font(:lang=sco) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=shs) font(:lang=sk) font(:lang=sl) font(:lang=sm) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=to) font(:lang=tr) font(:lang=ts) font(:lang=tw) font(:lang=ty) font(:lang=uk) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(clara) texlive-clara-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
