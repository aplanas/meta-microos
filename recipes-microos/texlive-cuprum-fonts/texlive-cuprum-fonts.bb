SUMMARY = "Severed fonts for texlive-cuprum"
DESCRIPTION = "The  separated fonts package for texlive-cuprum"
LICENSE = "OFL-1.1"

PV = "2023.204.svn49909"

RPM_NAME = "texlive-cuprum-fonts-2023.204.svn49909-54.1.noarch.rpm"
RPM_HASH = "905c2dcd460d544bcfe846ad3f5d227d7ade44c5eef8dbc27fe1ec5774d9932e04c96a96b12b566f05d55b50482d5ccd3f537bb5f5759964e5b8f617cfd4a89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=be) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ce) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=csb) \
font(:lang=da) \
font(:lang=de) \
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
font(:lang=ho) \
font(:lang=ht) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=ku-tr) \
font(:lang=kum) \
font(:lang=kwm) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=li) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=ms) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=nso) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=os) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=sr) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=uk) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(cuprum) \
texlive-cuprum-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
