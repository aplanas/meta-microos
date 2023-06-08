SUMMARY = "X.Org fonts"
DESCRIPTION = "This package contains fonts maintained and shipped with X.Org. \
 \
 \
This package contains the Type1 (.pfb) fonts from xorg-x11-fonts, \
converted to TrueType format, so they can be used by \
applications that don't support Type1 fonts."
LICENSE = "MIT"

PV = "7.6"

RPM_NAME = "xorg-x11-fonts-converted-7.6-45.3.noarch.rpm"
RPM_HASH = "00cf49329d82b579e1fbb8e6c966eaf12b4e66461f6fe4bc8cfcb6cc7b5210d20f752e7246ef7032e7f6f68927b7fd0e06400eccc4787b2bb315e66ba4df2ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) font(:lang=ab) font(:lang=af) font(:lang=ak) font(:lang=am) font(:lang=an) font(:lang=ar) font(:lang=ast) font(:lang=av) font(:lang=ay) font(:lang=az-az) font(:lang=az-ir) font(:lang=ba) font(:lang=be) font(:lang=ber-dz) font(:lang=bg) font(:lang=bh) font(:lang=bho) font(:lang=bi) font(:lang=bin) font(:lang=bm) font(:lang=br) font(:lang=brx) font(:lang=bs) font(:lang=bua) font(:lang=byn) font(:lang=ca) font(:lang=ce) font(:lang=ch) font(:lang=chm) font(:lang=chr) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cu) font(:lang=cv) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=doi) font(:lang=dv) font(:lang=ee) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fa) font(:lang=fat) font(:lang=ff) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=ga) font(:lang=gd) font(:lang=gez) font(:lang=gl) font(:lang=gn) font(:lang=gv) font(:lang=ha) font(:lang=haw) font(:lang=he) font(:lang=hi) font(:lang=hne) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=hy) font(:lang=hz) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ig) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=iu) font(:lang=ja) font(:lang=jv) font(:lang=ka) font(:lang=kaa) font(:lang=kab) font(:lang=ki) font(:lang=kj) font(:lang=kk) font(:lang=kl) font(:lang=ko) font(:lang=kok) font(:lang=ku-iq) font(:lang=ku-ir) font(:lang=ku-tr) font(:lang=kum) font(:lang=kv) font(:lang=kw) font(:lang=kwm) font(:lang=ky) font(:lang=la) font(:lang=lah) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=ln) font(:lang=lo) font(:lang=lt) font(:lang=lv) font(:lang=mai) font(:lang=mg) font(:lang=mh) font(:lang=mi) font(:lang=mk) font(:lang=mn-mn) font(:lang=mo) font(:lang=mr) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ne) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=nv) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=ota) font(:lang=pa-pk) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=ps-af) font(:lang=ps-pk) font(:lang=pt) font(:lang=qu) font(:lang=quz) font(:lang=rm) font(:lang=rn) font(:lang=ro) font(:lang=ru) font(:lang=rw) font(:lang=sa) font(:lang=sah) font(:lang=sat) font(:lang=sc) font(:lang=sco) font(:lang=sd) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=sh) font(:lang=shs) font(:lang=sid) font(:lang=sk) font(:lang=sl) font(:lang=sm) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sms) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tg) font(:lang=th) font(:lang=ti-er) font(:lang=ti-et) font(:lang=tig) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=to) font(:lang=tr) font(:lang=ts) font(:lang=tt) font(:lang=tw) font(:lang=ty) font(:lang=tyv) font(:lang=ug) font(:lang=uk) font(:lang=ur) font(:lang=uz) font(:lang=ve) font(:lang=vi) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wal) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=yi) font(:lang=yo) font(:lang=za) font(:lang=zh-cn) font(:lang=zh-sg) font(:lang=zu) font(adobenewcenturyschoolbook) font(adobesymbol) font(adobetimes) font(adobeutopia) font(arabicnewspaper) font(b&hlucida) font(b&hlucidabright) font(b&hlucidatypewriter) font(bitstreamcharter) font(courier) font(courier-converted) font(courier10pitch) font(daewoogothicwide) font(daewoominchowide) font(helvetica-converted) font(isasfangsongtiwide) font(isassongtiwide) font(jisfixedwide) font(muttclearlyualternateglyphswide) font(muttclearlyuarabicextra) font(muttclearlyupua) font(muttclearlyuwide) font(schumacherclean) font(schumachercleanwide) font(utopia) xorg-x11-fonts-converted"
RDEPENDS:${PN} += "/bin/sh fonts-config"

inherit rpm
