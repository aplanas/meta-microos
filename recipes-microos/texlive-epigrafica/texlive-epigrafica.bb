SUMMARY = "A Greek and Latin font"
DESCRIPTION = "Epigrafica is forked from the development of the MgOpen font \
Cosmetica, which is a similar design to Optima and includes \
Greek. Development has been supported by the Laboratory of \
Digital Typography and Mathematical Software, of the Department \
of Mathematics of the University of the Aegean, Greece."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn17210"

RPM_NAME = "texlive-epigrafica-2023.201.1.01svn17210-53.1.noarch.rpm"
RPM_HASH = "5347414c317a418a798c62b0bfc5cc352eca35e1cb455c8c50664b7501d6111f92c4034c563c7a5ccbb2df39e8e1decc7fa2bfbe7be3b5118388ffbfeb0028d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epigrafica.map) \
tex(epigrafica.sty) \
tex(epigraficab8a.tfm) \
tex(epigraficab8r.tfm) \
tex(epigraficab8r.vf) \
tex(epigraficabi8a.tfm) \
tex(epigraficabi8r.tfm) \
tex(epigraficabi8r.vf) \
tex(epigraficabo8a.tfm) \
tex(epigraficabo8r.tfm) \
tex(epigraficabo8r.vf) \
tex(epigraficac8a.tfm) \
tex(epigraficac8r.tfm) \
tex(epigraficac8r.vf) \
tex(epigraficahb7a.tfm) \
tex(epigraficahb7r.tfm) \
tex(epigraficahb7r.vf) \
tex(epigraficahbi7a.tfm) \
tex(epigraficahbi7r.tfm) \
tex(epigraficahbi7r.vf) \
tex(epigraficahbo7a.tfm) \
tex(epigraficahbo7r.tfm) \
tex(epigraficahbo7r.vf) \
tex(epigraficahc7a.tfm) \
tex(epigraficahc7r.tfm) \
tex(epigraficahc7r.vf) \
tex(epigraficahellenic.enc) \
tex(epigraficahi7a.tfm) \
tex(epigraficahi7r.tfm) \
tex(epigraficahi7r.vf) \
tex(epigraficahn7r.tfm) \
tex(epigraficahn7r.vf) \
tex(epigraficaho7a.tfm) \
tex(epigraficaho7r.tfm) \
tex(epigraficaho7r.vf) \
tex(epigraficai8a.tfm) \
tex(epigraficai8r.tfm) \
tex(epigraficai8r.vf) \
tex(epigrafican8a.tfm) \
tex(epigrafican8r.tfm) \
tex(epigrafican8r.vf) \
tex(epigraficao8a.tfm) \
tex(epigraficao8r.tfm) \
tex(epigraficao8r.vf) \
tex(gepigraficahn7a.tfm) \
tex(lgrepigrafica.fd) \
tex(ot1epigrafica.fd) \
texlive-epigrafica"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pxfonts.sty) \
tex(updmap.cfg) \
texlive \
texlive-epigrafica-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
