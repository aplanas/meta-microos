SUMMARY = "Professional Indian Language TrueType Fonts"
DESCRIPTION = "This package contains many professional Indian language TrueType fonts \
contributed by the community and some also donated by organizations to \
open source. All fonts are available under GPL-2.0+ or OFL-1.1."
LICENSE = "GPL-2.0-or-later & OFL-1.1"

PV = "20160512"

RPM_NAME = "indic-fonts-20160512-2.4.noarch.rpm"
RPM_HASH = "d8af8443fbf9d0e7627ef55c33d0b4c0746726c73ec67d15427ff0fea5bf6e99492ba3b30450fa7ca7653ccc0ff075349b3d03dfb2c51992d7687095e1ba2870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) font(:lang=af) font(:lang=an) font(:lang=as) font(:lang=ay) font(:lang=bh) font(:lang=bho) font(:lang=bi) font(:lang=bn) font(:lang=br) font(:lang=brx) font(:lang=bs) font(:lang=ca) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=doi) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gu) font(:lang=gv) font(:lang=hi) font(:lang=hne) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=kl) font(:lang=kn) font(:lang=kok) font(:lang=ku-tr) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lg) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mai) font(:lang=mg) font(:lang=mh) font(:lang=ml) font(:lang=mni) font(:lang=mr) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ne) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=or) font(:lang=pa) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=rw) font(:lang=sa) font(:lang=sat) font(:lang=sc) font(:lang=se) font(:lang=sg) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=ta) font(:lang=te) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(aakar) font(akaash) font(akrutidev2) font(akrutiguj1) font(akrutigujl1) font(akrutiknd1) font(akrutimal2) font(akrutiori1) font(akrutipnj2) font(akrutitlg2) font(akrutitml1) font(ani) font(anmoluni) font(anmolunibani) font(anmolunibaniheavy) font(anmoluniheavy) font(gargi_1.7) font(jamrul) font(likhan) font(lohitassamese) font(lohitbengali) font(lohitdevanagari) font(lohitgujarati) font(lohitkannada) font(lohitmalayalam) font(lohitmarathi) font(lohitoriya) font(lohitpunjabi) font(lohittamil) font(lohittamilclassical) font(lohittelugu) font(malayalam) font(mitra) font(mukti) font(ori1uni) font(padmaa) font(padmaa-bold.1.1) font(padmmaa) font(rachana) font(rachana03) font(rekha) font(saab) font(sagar) font(sampige) font(tamu_kadambri) font(tamu_kalyani) font(tamu_maduram) font(tscu_comic) font(tscu_paranar) font(tscu_times) font(tscu_vaigai) font(utkal) font(vaigaiuni) font(অনি) font(মুক্তি) indic-fonts locale(ta;bn;gu;hi;mr;pa) scalable-font-bn scalable-font-gu scalable-font-hi scalable-font-mr scalable-font-pa scalable-font-ta"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
