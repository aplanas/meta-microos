SUMMARY = "Typeset cards for Set"
DESCRIPTION = "The package will typeset cards for use in a game of Set."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn40613"

RPM_NAME = "texlive-setdeck-2023.201.0.0.1svn40613-53.1.noarch.rpm"
RPM_HASH = "96557277389fdb46d3ae5b520c68b02fdabf342d7d44f1039242a7982ceea670fd69cc418637400b82acc9a3f45266700e1f81cb2dfb08b0392df91a87b05059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(setdeck.sty) \
texlive-setdeck"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
