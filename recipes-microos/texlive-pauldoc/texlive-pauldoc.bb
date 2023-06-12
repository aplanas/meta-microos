SUMMARY = "German LaTeX package documentation"
DESCRIPTION = "The package provides helpers for German language package \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn16005"

RPM_NAME = "texlive-pauldoc-2023.201.0.0.5svn16005-51.1.noarch.rpm"
RPM_HASH = "791af3b2f60d04df11fb681130a427212092b7deb91cf965bdf2062507ebb68238e95ae19b4ce5adfcab3e5e852311a7f5fe162185c229f04ee7701475648440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pauldoc.sty) \
texlive-pauldoc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(fontenc.sty) \
tex(inputenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
