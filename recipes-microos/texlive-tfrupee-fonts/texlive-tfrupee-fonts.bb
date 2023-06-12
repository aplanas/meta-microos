SUMMARY = "Severed fonts for texlive-tfrupee"
DESCRIPTION = "The  separated fonts package for texlive-tfrupee"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn20770"

RPM_NAME = "texlive-tfrupee-fonts-2023.201.1.02svn20770-54.1.noarch.rpm"
RPM_HASH = "9fe2ffe6afe66f4ab3b1883f398268a58a5abcaf91b7f9524380ee6b1f764b979f4870a593f14901e196c08ff71cb7b1852c6f20c045c7be49e38907633f881a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=af) \
font(:lang=ak) \
font(:lang=an) \
font(:lang=ar) \
font(:lang=ast) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=az-az) \
font(:lang=az-ir) \
font(:lang=be) \
font(:lang=ber-dz) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=bin) \
font(:lang=br) \
font(:lang=bua) \
font(:lang=ca) \
font(:lang=ce) \
font(:lang=ch) \
font(:lang=chm) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=cu) \
font(:lang=cv) \
font(:lang=cy) \
font(:lang=da) \
font(:lang=de) \
font(:lang=el) \
font(:lang=en) \
font(:lang=eo) \
font(:lang=es) \
font(:lang=et) \
font(:lang=eu) \
font(:lang=fa) \
font(:lang=fat) \
font(:lang=fi) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=ga) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gn) \
font(:lang=gv) \
font(:lang=ha) \
font(:lang=haw) \
font(:lang=he) \
font(:lang=ho) \
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
font(:lang=kab) \
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kl) \
font(:lang=kr) \
font(:lang=ku-iq) \
font(:lang=ku-ir) \
font(:lang=ku-tr) \
font(:lang=kum) \
font(:lang=kv) \
font(:lang=kw) \
font(:lang=kwm) \
font(:lang=ky) \
font(:lang=la) \
font(:lang=lah) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=li) \
font(:lang=ln) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=mi) \
font(:lang=mk) \
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
font(:lang=ota) \
font(:lang=pa-pk) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=ps-af) \
font(:lang=ps-pk) \
font(:lang=pt) \
font(:lang=qu) \
font(:lang=quz) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sco) \
font(:lang=sd) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=shs) \
font(:lang=sk) \
font(:lang=sm) \
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
font(:lang=tg) \
font(:lang=tk) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=to) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=tw) \
font(:lang=ty) \
font(:lang=tyv) \
font(:lang=ug) \
font(:lang=uk) \
font(:lang=ur) \
font(:lang=uz) \
font(:lang=ve) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=yi) \
font(:lang=yo) \
font(:lang=za) \
font(:lang=zu) \
font(rupeetechfat) \
texlive-tfrupee-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
