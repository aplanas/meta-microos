SUMMARY = "Severed fonts for texlive-junicode"
DESCRIPTION = "The  separated fonts package for texlive-junicode"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0.2svn61719"

RPM_NAME = "texlive-junicode-fonts-2023.201.1.0.2svn61719-55.1.noarch.rpm"
RPM_HASH = "de41f0fda8eb2324fdac2b14b070021776930584efdcf97eaf8c85111be7f26aa0074bc84f76675238e770c05a96d981360ba8291236aa1bd7be15e82670be09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ctan-junicode-fonts font(:lang=aa) font(:lang=af) font(:lang=ak) font(:lang=an) font(:lang=ast) font(:lang=ay) font(:lang=az-az) font(:lang=ber-dz) font(:lang=bi) font(:lang=bin) font(:lang=bm) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=ee) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fat) font(:lang=ff) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=ga) font(:lang=gd) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=ha) font(:lang=haw) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=hz) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ig) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kab) font(:lang=ki) font(:lang=kj) font(:lang=kl) font(:lang=ku-tr) font(:lang=kw) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lg) font(:lang=li) font(:lang=ln) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mi) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=nv) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=qu) font(:lang=quz) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=rw) font(:lang=sc) font(:lang=sco) font(:lang=se) font(:lang=sg) font(:lang=shs) font(:lang=sk) font(:lang=sl) font(:lang=sm) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sms) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=to) font(:lang=tr) font(:lang=ts) font(:lang=tw) font(:lang=ty) font(:lang=uz) font(:lang=ve) font(:lang=vi) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=yo) font(:lang=za) font(:lang=zu) font(foulisgreek) font(junicode) texlive-junicode-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
