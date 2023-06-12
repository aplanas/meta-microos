SUMMARY = "A development of Metafont for creating graphics"
DESCRIPTION = "MetaPost uses a language based on that of Metafont to produce \
precise technical illustrations. Its output is scalable \
PostScript or SVG, rather than the bitmaps Metafont creates."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn66264"

RPM_NAME = "texlive-metapost-2023.201.svn66264-54.1.noarch.rpm"
RPM_HASH = "b39f24143ed43c0a728ede10367a54f2a64089b734dc056a134f4b83cd30397f0faf4a55ed7e8ab3fa1c2617a05bf952e346be8b28e25b6bd62fbadc72aeb405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(freeeuro.tfm) \
tex(groff.enc) \
tex(mproof.tex) \
tex(mpsproof.tex) \
tex(pagd8g.tfm) \
tex(pagdo8g.tfm) \
tex(pagk8g.tfm) \
tex(pagko8g.tfm) \
tex(pbkd8g.tfm) \
tex(pbkdi8g.tfm) \
tex(pbkl8g.tfm) \
tex(pbkli8g.tfm) \
tex(pcrb8g.tfm) \
tex(pcrbo8g.tfm) \
tex(pcrr8g.tfm) \
tex(pcrro8g.tfm) \
tex(phvb8g.tfm) \
tex(phvb8gn.tfm) \
tex(phvbo8g.tfm) \
tex(phvbo8gn.tfm) \
tex(phvr8g.tfm) \
tex(phvr8gn.tfm) \
tex(phvro8g.tfm) \
tex(phvro8gn.tfm) \
tex(pncb8g.tfm) \
tex(pncbi8g.tfm) \
tex(pncr8g.tfm) \
tex(pncri8g.tfm) \
tex(pplb8g.tfm) \
tex(pplbi8g.tfm) \
tex(pplr8g.tfm) \
tex(pplri8g.tfm) \
tex(psyrgo.tfm) \
tex(ptmb8g.tfm) \
tex(ptmbi8g.tfm) \
tex(ptmr8g.tfm) \
tex(ptmri8g.tfm) \
tex(pzcmi8g.tfm) \
tex(trfonts.map) \
tex(troff-updmap.map) \
tex(troff.map) \
tex(zpzdr-reversed.tfm) \
texlive-metapost"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metapost-bin \
texlive-metapost-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
