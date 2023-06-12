SUMMARY = "BibLaTeX stylefiles for German law theses"
DESCRIPTION = "The package provides a custom citation-style for typesetting a \
German law thesis with LaTeX. The package (using BibLaTeX) is \
based on biblatex-dw and uses biber."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.23svn56502"

RPM_NAME = "texlive-biblatex-juradiss-2023.201.0.0.23svn56502-53.1.noarch.rpm"
RPM_HASH = "d90ed4c27945c1577be215f7c88e88b2316a4f688039bcb9a95d8213c5c35091dd3af99864828f2ffe9ca9353aa0801881290a1e34518d52cf8bec311bd01e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-juradiss.bbx) \
tex(biblatex-juradiss.cbx) \
texlive-biblatex-juradiss"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authortitle-dw.bbx) \
tex(authortitle-dw.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
