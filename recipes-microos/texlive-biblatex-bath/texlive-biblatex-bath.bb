SUMMARY = "Harvard referencing style as recommended by the University of Bath Library"
DESCRIPTION = "This package provides a BibLaTeX style to format reference \
lists in the Harvard style recommended by the University of \
Bath Library."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63401"

RPM_NAME = "texlive-biblatex-bath-2023.201.6.0svn63401-53.1.noarch.rpm"
RPM_HASH = "4737aa7baa161fb485a9c45aae7213c2d2f99e937b2d463d0078f77fa98b01d71f56527d55dedcd597fe5b06f55a0b2e981341ff52282a006c0560a45d79d8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bath.bbx) \
tex(bath.cbx) \
tex(british-bath.lbx) \
tex(english-bath.lbx) \
texlive-biblatex-bath"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authoryear-comp.cbx) \
tex(etoolbox.sty) \
tex(xpatch.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
