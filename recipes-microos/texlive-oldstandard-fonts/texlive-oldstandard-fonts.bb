SUMMARY = "Severed fonts for texlive-oldstandard"
DESCRIPTION = "The  separated fonts package for texlive-oldstandard"
LICENSE = "OFL-1.1"

PV = "2023.201.2.6svn64464"

RPM_NAME = "texlive-oldstandard-fonts-2023.201.2.6svn64464-54.1.noarch.rpm"
RPM_HASH = "ec9f8b33f7b23562801c365b80f92561198ea72d3e25a27bb0f8f6af99e73faece27c76130c6cafcf35505b57839802281447f485725f43ee76ba057f5a5dd3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-oldstandard-fonts) font(:lang=aa) font(:lang=af) font(:lang=an) font(:lang=ast) font(:lang=av) font(:lang=ay) font(:lang=az-az) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ce) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cu) font(:lang=da) font(:lang=de) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=ga) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=haw) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=hz) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=kl) font(:lang=ku-tr) font(:lang=kum) font(:lang=kw) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=ln) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mi) font(:lang=mk) font(:lang=mo) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=nv) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sc) font(:lang=sco) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=shs) font(:lang=sk) font(:lang=sl) font(:lang=sm) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=to) font(:lang=tr) font(:lang=ts) font(:lang=ty) font(:lang=uk) font(:lang=uz) font(:lang=ve) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(oldstandard) texlive-oldstandard-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
