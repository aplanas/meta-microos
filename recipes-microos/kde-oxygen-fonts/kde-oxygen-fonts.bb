SUMMARY = "A desktop/gui font family for integrated use with the KDE desktop"
DESCRIPTION = "‘Oxygen Font’ is a project to design a desktop/gui font \
for integrated use with the KDE desktop. The design is \
based on interpolations between ‘Muli’ and ‘FontOne’ \
that have been further shaped to reach a clear, legible \
font to use within the KDE gui. \
 \
The basic concept for ‘Oxygen Font’ was to design a clear, \
legible, sans serif, that would be rendered with Freetype \
on Linux-based devices. The idea was to not quite follow \
a ‘purist’ line of sans serif typeface formulae, but to \
allow some juxtapositioning of font forms to give \
familiarity but also a sense of newness. A version of the \
font is also under development that is aimed to be a \
branding typeface for the desktop."
LICENSE = "OFL-1.1 & SUSE-GPL-3.0+-with-font-exception"

PV = "0.4.0"

RPM_NAME = "kde-oxygen-fonts-0.4.0-3.25.noarch.rpm"
RPM_HASH = "4de31443da3df5a63780a2a53fbbe06ca0104670019fa504f23f7df3d9c0c596d75ae1553feea2a09177cfde7f18424ab07d788dc702f775338815d827d0b51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=af) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=ca) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=cy) \
font(:lang=da) \
font(:lang=de) \
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
font(:lang=ga) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
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
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kl) \
font(:lang=ku-tr) \
font(:lang=kwm) \
font(:lang=la) \
font(:lang=lb) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
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
font(:lang=ny) \
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
font(:lang=sc) \
font(:lang=se) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=smn) \
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
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(oxygen-sans) \
font(oxygenmono) \
kde-oxygen-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
