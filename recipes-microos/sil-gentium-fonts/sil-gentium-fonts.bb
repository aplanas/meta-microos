SUMMARY = "A International Typeface for Languages Using the Latin Script"
DESCRIPTION = "Gentium is a typeface family designed to enable the diverse ethnic \
groups around the world who use the Latin script to produce readable, \
high-quality publications. It supports a wide range of Latin-based \
alphabets and includes glyphs that correspond to all the Latin ranges \
of Unicode."
LICENSE = "OFL-1.1"

PV = "6.200"

RPM_NAME = "sil-gentium-fonts-6.200-1.1.noarch.rpm"
RPM_HASH = "996ab5ee348b25c5174095692b6f5c9d82636b16a5a5b5fc8e2e97451d64ffe03768d5d1d0ec8c75a10aecd1bc24d319e568f9d07b3b1fde063739d563ab0776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sil-gentium-fonts) font(:lang=aa) font(:lang=ab) font(:lang=ak) font(:lang=an) font(:lang=ast) font(:lang=av) font(:lang=ay) font(:lang=az-az) font(:lang=ba) font(:lang=be) font(:lang=ber-dz) font(:lang=bg) font(:lang=bi) font(:lang=bin) font(:lang=bm) font(:lang=br) font(:lang=bs) font(:lang=bua) font(:lang=ca) font(:lang=ce) font(:lang=ch) font(:lang=chm) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cv) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=ee) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fat) font(:lang=ff) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=ga) font(:lang=gd) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=ha) font(:lang=haw) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=hz) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ig) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kaa) font(:lang=kab) font(:lang=ki) font(:lang=kj) font(:lang=kk) font(:lang=kl) font(:lang=kr) font(:lang=ku-am) font(:lang=ku-tr) font(:lang=kum) font(:lang=kv) font(:lang=kw) font(:lang=kwm) font(:lang=ky) font(:lang=la) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=ln) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mi) font(:lang=mk) font(:lang=mn-mn) font(:lang=mo) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=nv) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=qu) font(:lang=quz) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sah) font(:lang=sc) font(:lang=sco) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=sh) font(:lang=shs) font(:lang=sk) font(:lang=sl) font(:lang=sm) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sms) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tg) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=to) font(:lang=tr) font(:lang=ts) font(:lang=tt) font(:lang=tw) font(:lang=ty) font(:lang=tyv) font(:lang=uk) font(:lang=uz) font(:lang=ve) font(:lang=vi) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=yo) font(:lang=za) font(:lang=zu) font(gentiumbookplus) font(gentiumplus) locale(vi) sil-gentium-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
