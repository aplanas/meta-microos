SUMMARY = "Severed fonts for texlive-arabi"
DESCRIPTION = "The  separated fonts package for texlive-arabi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44662"

RPM_NAME = "texlive-arabi-fonts-2023.201.1.1svn44662-54.1.noarch.rpm"
RPM_HASH = "a6ad5877ec70dfad70c3ed5a41539604e45880706978e022ca9105c4404bf403e8a88badf66cf53134d50f8993df3799dc6e0be68200238b7d90152f3cedb733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=ar) \
font(:lang=ay) \
font(:lang=az-ir) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=da) \
font(:lang=de) \
font(:lang=en) \
font(:lang=es) \
font(:lang=et) \
font(:lang=eu) \
font(:lang=fa) \
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
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=ku-tr) \
font(:lang=kwm) \
font(:lang=lb) \
font(:lang=li) \
font(:lang=mg) \
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
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sg) \
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
font(:lang=tl) \
font(:lang=tn) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(ae_albattar) \
font(ae_almateen) \
font(ae_almohanadbold) \
font(ae_almohanadbolditalic) \
font(ae_almohanadextrabold2) \
font(ae_almohanadthin) \
font(ae_almothnna) \
font(ae_alyermook) \
font(ae_arab) \
font(ae_cortoba) \
font(ae_dimnah) \
font(ae_furat) \
font(ae_granada) \
font(ae_graph) \
font(ae_hani) \
font(ae_hor) \
font(ae_kayrawan) \
font(ae_khalid) \
font(ae_mashq) \
font(ae_metal) \
font(ae_nada) \
font(ae_nagham) \
font(ae_nice) \
font(ae_ostorah) \
font(ae_ouhod) \
font(ae_petra) \
font(ae_rehan) \
font(ae_salem) \
font(ae_shado) \
font(ae_sharjah) \
font(ae_sindibad) \
font(ae_tarablus) \
font(ae_tholoth) \
font(homa) \
font(nazli) \
font(titr) \
texlive-arabi-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
