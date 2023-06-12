SUMMARY = "Extend the \\hhline command"
DESCRIPTION = "This package extends the \\hhline command with a !{...} token, \
which allows to create lines with arbitrary LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54676"

RPM_NAME = "texlive-ehhline-2023.201.1.1svn54676-53.1.noarch.rpm"
RPM_HASH = "c386d9c53a6f9f15c71dea29b26bc983647224899e4e2416d1937efbb49ee4886a0fdc9b347ab8c17fa2797fcee924930964b286f22732cf9597073e099c6207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ehhline.sty) \
texlive-ehhline"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(hhline.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
