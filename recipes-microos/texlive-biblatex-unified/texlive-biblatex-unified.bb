SUMMARY = "BibLaTeX implementation of the unified stylesheet for linguistics journals"
DESCRIPTION = "BibLaTeX-unified is an opinionated BibLaTeX implementation of \
the Unified Stylesheet for Linguistics Journals"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn64975"

RPM_NAME = "texlive-biblatex-unified-2023.201.1.20svn64975-53.1.noarch.rpm"
RPM_HASH = "d0514fbfa976a3b5c7b7f802a922b641be781875b436068489298baf9236ba1a18444b5390a4fd5aed82ab9a778d0e45c586f67e5321ac713b5eb66fc0cd28b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unified.bbx) \
tex(unified.cbx) \
texlive-biblatex-unified"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authoryear-comp.cbx) \
tex(authoryear.bbx) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
