SUMMARY = "Typeset OPM diagrams"
DESCRIPTION = "Typeset OPM (Object-Process Methodology) diagrams using LaTeX \
and PGF/TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn32769"

RPM_NAME = "texlive-tikz-opm-2023.201.0.0.1.1svn32769-52.1.noarch.rpm"
RPM_HASH = "b1db94c3383909e3cba59c2c9c30376ae8666fb043133079c2d02d64b722570613657292716edc9be536ee0c12a166f5f0d0cd0beb212bef8055aeff5afbd719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-opm.sty) \
texlive-tikz-opm"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(makeshape.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
