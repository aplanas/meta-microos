SUMMARY = "A library for drawing optical setups with TikZ"
DESCRIPTION = "This package provides a new TikZ library designed to easily \
draw optical setups with TikZ. It provides shapes for lens, \
mirror, etc. The geometrically (in)correct computation of light \
rays through the setup is left to the user."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.3svn62977"

RPM_NAME = "texlive-tikz-optics-2023.201.0.0.2.3svn62977-52.1.noarch.rpm"
RPM_HASH = "c1bcb7f098533eadc2f016d953b981d0279e978b2dffd298947064d9cd87de75602a271766dfe9c5be125b5a416398b5d28dddbc1bb1c78b03a3f02224b48e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibraryoptics.code.tex) \
texlive-tikz-optics"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
