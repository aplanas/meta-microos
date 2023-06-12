SUMMARY = "WenQuanYi Micro Hei CJK Font"
DESCRIPTION = "WenQuanYi Micro Hei font family is a Sans-Serif style (also known as \
Hei, \
Gothic or Dotum among the Chinese/Japanese/Korean users) high quality \
 \
CJK outline font. It was derived from 'Droid Sans Fallback', 'Droid \
Sans' and 'Droid Sans Mono' released by Google Corp. This font \
package \
contains two faces, 'Micro Hei' and 'Micro Hei Mono', in form of a \
True-Type Collection (ttc) file. All the unified CJK Han glyphs, i.e. \
 \
GBK Hanzi, in the range of U+4E00-U+9FC3 defined in Unicode Standard \
5.1 \
are covered, with additional support to many other international \
languages such as Latin, Extended Latin, Hanguls and Kanas. The font \
file is extremely compact (~5M) compared with most known CJK fonts. \
As a result, it can be used for hand-held devices or embedded systems, \
or \
used on PC with a significantly small memory footprint. Because both \
font faces carry hinting and kerning instructions for Latin glyphs, \
they are the excellent choices for desktop fonts."
LICENSE = "Apache-2.0 | SUSE-GPL-3.0+-with-font-exception"

PV = "0.2.0+snapshot20150915"

RPM_NAME = "wqy-microhei-fonts-0.2.0+snapshot20150915-2.14.noarch.rpm"
RPM_HASH = "5babcc95092b19d3650ddb2bc34a1aeb5c1f6c7ed905177d63bef9af8d6d7dfc69584de96ed626a22740434ebc4b1d6ccc75c456ab9348f034a99950ff28592b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(wqy-microhei-fonts) \
font(:lang=aa) \
font(:lang=ab) \
font(:lang=af) \
font(:lang=an) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=ba) \
font(:lang=be) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=bin) \
font(:lang=br) \
font(:lang=bs) \
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
font(:lang=fi) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gn) \
font(:lang=gv) \
font(:lang=ho) \
font(:lang=hr) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ig) \
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=ja) \
font(:lang=jv) \
font(:lang=kaa) \
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kk) \
font(:lang=kl) \
font(:lang=ko) \
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
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
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
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sah) \
font(:lang=sc) \
font(:lang=se) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sh) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=smn) \
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
font(:lang=tr) \
font(:lang=ts) \
font(:lang=tt) \
font(:lang=ty) \
font(:lang=tyv) \
font(:lang=uk) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zh-cn) \
font(:lang=zh-sg) \
font(:lang=zh-tw) \
font(:lang=zu) \
font(wenquanyimicrohei) \
font(wenquanyimicroheimono) \
font(文泉驛微米黑) \
font(文泉驛等寬微米黑) \
font(文泉驿微米黑) \
font(文泉驿等宽微米黑) \
scalable-font-zh-CN \
scalable-font-zh-SG \
scalable-font-zh-TW \
ttf-wqy-microhei \
wqy-microhei-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
perl"

inherit rpm
