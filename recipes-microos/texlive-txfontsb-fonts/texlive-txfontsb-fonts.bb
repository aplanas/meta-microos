SUMMARY = "Severed fonts for texlive-txfontsb"
DESCRIPTION = "The  separated fonts package for texlive-txfontsb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.1svn54512"

RPM_NAME = "texlive-txfontsb-fonts-2023.201.1.1.1svn54512-52.1.noarch.rpm"
RPM_HASH = "1ec4ab4e37c79e9f25667f8c33a9737adcb702405ee975f0f03a55e0ff1ef08592438f24e30224d0d3d072fa296fc45e9098459c93bb18c43b3dc3cc22593b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-txfontsb-fonts) \
font(:lang=aa) \
font(:lang=ab) \
font(:lang=af) \
font(:lang=ak) \
font(:lang=am) \
font(:lang=an) \
font(:lang=ar) \
font(:lang=ast) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=az-az) \
font(:lang=ba) \
font(:lang=be) \
font(:lang=ber-dz) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=bin) \
font(:lang=bm) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=bua) \
font(:lang=byn) \
font(:lang=ca) \
font(:lang=ce) \
font(:lang=ch) \
font(:lang=chm) \
font(:lang=chr) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=cv) \
font(:lang=cy) \
font(:lang=da) \
font(:lang=de) \
font(:lang=dv) \
font(:lang=ee) \
font(:lang=el) \
font(:lang=en) \
font(:lang=eo) \
font(:lang=es) \
font(:lang=et) \
font(:lang=eu) \
font(:lang=fat) \
font(:lang=ff) \
font(:lang=fi) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=ga) \
font(:lang=gd) \
font(:lang=gez) \
font(:lang=gl) \
font(:lang=gn) \
font(:lang=gv) \
font(:lang=ha) \
font(:lang=haw) \
font(:lang=he) \
font(:lang=ho) \
font(:lang=hr) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=hz) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ig) \
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=ka) \
font(:lang=kaa) \
font(:lang=kab) \
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kk) \
font(:lang=kl) \
font(:lang=kr) \
font(:lang=ku-am) \
font(:lang=ku-tr) \
font(:lang=kum) \
font(:lang=kv) \
font(:lang=kw) \
font(:lang=kwm) \
font(:lang=ky) \
font(:lang=la) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=ln) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=mi) \
font(:lang=mn-mn) \
font(:lang=mo) \
font(:lang=ms) \
font(:lang=mt) \
font(:lang=na) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=nso) \
font(:lang=nv) \
font(:lang=ny) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=os) \
font(:lang=pa) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=qu) \
font(:lang=quz) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sah) \
font(:lang=sc) \
font(:lang=sco) \
font(:lang=se) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sh) \
font(:lang=shs) \
font(:lang=sid) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sm) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=smn) \
font(:lang=sms) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=sr) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tg) \
font(:lang=th) \
font(:lang=ti-er) \
font(:lang=ti-et) \
font(:lang=tig) \
font(:lang=tk) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=to) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=tt) \
font(:lang=tw) \
font(:lang=ty) \
font(:lang=tyv) \
font(:lang=uk) \
font(:lang=uz) \
font(:lang=ve) \
font(:lang=vi) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wal) \
font(:lang=wen) \
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=yi) \
font(:lang=yo) \
font(:lang=za) \
font(:lang=zu) \
font(freeserifb) \
texlive-txfontsb-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
