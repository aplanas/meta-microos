SUMMARY = "Severed fonts for texlive-eczar"
DESCRIPTION = "The  separated fonts package for texlive-eczar"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.1svn57716"

RPM_NAME = "texlive-eczar-fonts-2023.201.0.0.1svn57716-53.1.noarch.rpm"
RPM_HASH = "5d233c64d8bd0f3005a6edabf6d765c9fd7d5ae23375b3a58871020baade89a7337fb2aa9834d0be184b1dd2d0ed6a01c8e0af8d662bb4a6688ecb68e3c5bba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bh) \
font(:lang=bho) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=brx) \
font(:lang=bs) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=da) \
font(:lang=de) \
font(:lang=doi) \
font(:lang=en) \
font(:lang=es) \
font(:lang=et) \
font(:lang=eu) \
font(:lang=fi) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
font(:lang=hi) \
font(:lang=hne) \
font(:lang=ho) \
font(:lang=hr) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=kok) \
font(:lang=ku-tr) \
font(:lang=kwm) \
font(:lang=lb) \
font(:lang=li) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mai) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=mr) \
font(:lang=ms) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ne) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=nso) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=rw) \
font(:lang=sa) \
font(:lang=sat) \
font(:lang=sc) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tk) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(eczar) \
font(eczarextrabold) \
font(eczarmedium) \
font(eczarsemibold) \
font(एक्ज़र) \
font(एक्ज़रextrabold) \
font(एक्ज़रmedium) \
font(एक्ज़रsemibold) \
texlive-eczar-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
