SUMMARY = "TeX fonts from the American Mathematical Society"
DESCRIPTION = "An extended set of fonts for use in mathematics, including: \
extra mathematical symbols; blackboard bold letters (uppercase \
only); fraktur letters; subscript sizes of bold math italic and \
bold Greek letters; subscript sizes of large symbols such as \
sum and product; added sizes of the Computer Modern small caps \
font; cyrillic fonts (from the University of Washington); Euler \
mathematical fonts. All fonts are provided as Adobe Type 1 \
files, and all except the Euler fonts are provided as Metafont \
source. The distribution also includes the canonical Type 1 \
versions of the Computer Modern family of fonts. Basic LaTeX \
support for the symbol fonts is provided by amsfonts.sty, with \
names of individual symbols defined in amssymb.sty. The Euler \
fonts are supported by separate packages; details can be found \
in the documentation."
LICENSE = "OFL-1.1"

PV = "2023.201.3.04svn61937"

RPM_NAME = "texlive-amsfonts-2023.201.3.04svn61937-54.1.noarch.rpm"
RPM_HASH = "64426840b4be89db8c3a3ee6dbf38d6b72ebe67128dc764e83e398d00c49a657889065d733e5aa74cc6e03c99b7eac9cee894af565dd49c3289ff649421c0dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(amsfonts.sty) tex(amssym.def) tex(amssym.tex) tex(amssymb.sty) tex(cm.map) tex(cmbsy5.tfm) tex(cmbsy6.tfm) tex(cmbsy7.tfm) tex(cmbsy8.tfm) tex(cmbsy9.tfm) tex(cmcsc8.tfm) tex(cmcsc9.tfm) tex(cmex7.tfm) tex(cmex8.tfm) tex(cmex9.tfm) tex(cmextra.map) tex(cmmib5.tfm) tex(cmmib57.sty) tex(cmmib6.tfm) tex(cmmib7.tfm) tex(cmmib8.tfm) tex(cmmib9.tfm) tex(cyracc.def) tex(cyrillic.map) tex(dummy.tfm) tex(eucal.sty) tex(euex10.tfm) tex(euex7.tfm) tex(euex8.tfm) tex(euex9.tfm) tex(eufb10.tfm) tex(eufb5.tfm) tex(eufb6.tfm) tex(eufb7.tfm) tex(eufb8.tfm) tex(eufb9.tfm) tex(eufm10.tfm) tex(eufm5.tfm) tex(eufm6.tfm) tex(eufm7.tfm) tex(eufm8.tfm) tex(eufm9.tfm) tex(eufrak.sty) tex(euler.map) tex(eurb10.tfm) tex(eurb5.tfm) tex(eurb6.tfm) tex(eurb7.tfm) tex(eurb8.tfm) tex(eurb9.tfm) tex(eurm10.tfm) tex(eurm5.tfm) tex(eurm6.tfm) tex(eurm7.tfm) tex(eurm8.tfm) tex(eurm9.tfm) tex(eusb10.tfm) tex(eusb5.tfm) tex(eusb6.tfm) tex(eusb7.tfm) tex(eusb8.tfm) tex(eusb9.tfm) tex(euscript.sty) tex(eusm10.tfm) tex(eusm5.tfm) tex(eusm6.tfm) tex(eusm7.tfm) tex(eusm8.tfm) tex(eusm9.tfm) tex(latxfont.map) tex(msam10.tfm) tex(msam5.tfm) tex(msam6.tfm) tex(msam7.tfm) tex(msam8.tfm) tex(msam9.tfm) tex(msbm10.tfm) tex(msbm5.tfm) tex(msbm6.tfm) tex(msbm7.tfm) tex(msbm8.tfm) tex(msbm9.tfm) tex(symbols.map) tex(ueuex.fd) tex(ueuf.fd) tex(ueur.fd) tex(ueus.fd) tex(umsa.fd) tex(umsb.fd) tex(wncyb10.tfm) tex(wncyb5.tfm) tex(wncyb6.tfm) tex(wncyb7.tfm) tex(wncyb8.tfm) tex(wncyb9.tfm) tex(wncyi10.tfm) tex(wncyi5.tfm) tex(wncyi6.tfm) tex(wncyi7.tfm) tex(wncyi8.tfm) tex(wncyi9.tfm) tex(wncyr10.tfm) tex(wncyr5.tfm) tex(wncyr6.tfm) tex(wncyr7.tfm) tex(wncyr8.tfm) tex(wncyr9.tfm) tex(wncysc10.tfm) tex(wncyss10.tfm) tex(wncyss8.tfm) tex(wncyss9.tfm) texlive-amsfonts"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-amsfonts-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
